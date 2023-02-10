package Vebinar_OOP.Task_4;

public class Phone {
    private String model;
    private String number;
    private Phone currentPhone;

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.currentPhone = null;
    }

    public void call(Phone phone) {
        if (this.currentPhone == null && phone.getCurrentPhone()==null){
        this.setCurrentPhone(phone);
        phone.setCurrentPhone(this);
        System.out.println("Calling to nmber: " + phone.getNumber());}
        else if (phone.getCurrentPhone() != null){
            System.out.println("Номер абонента в данный момент занят");
        }else {
            System.out.println("Ваш телефон занят");
        }
    }
    public void hangCall(){
        this.getCurrentPhone().setCurrentPhone(null);
        this.setCurrentPhone(null);
    }
    public void sendMessage(Phone phone, String message) {
        System.out.println("Sending message " + message + "to number" + phone.getNumber());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone getCurrentPhone() {
        return currentPhone;
    }

    public void setCurrentPhone(Phone currentPhone) {
        this.currentPhone = currentPhone;
    }


}
