package tightCoupled;

public class EmailSender {
    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void sendMsg(){
        System.out.println(this.msg);
        System.out.println("Email successfully sent..");
    }
}
