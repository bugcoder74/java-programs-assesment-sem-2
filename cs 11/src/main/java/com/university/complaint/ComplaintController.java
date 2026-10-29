package com.university.complaint;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    private final List<Complaint> complaints = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Complaint> registerComplaint(@Valid @RequestBody ComplaintRequest request) {
        Complaint complaint = new Complaint();
        complaint.setId(UUID.randomUUID().toString());
        complaint.setDescription(request.getDescription());
        complaint.setCategory(request.getCategory());
        complaint.setStatus("PENDING");
        
        complaints.add(complaint);
        return new ResponseEntity<>(complaint, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Complaint>> getAllComplaints() {
        return ResponseEntity.ok(complaints);
    }
}
