package model;

public class Client {
    private String name;
    private String cpf;
    private String phone;
    private String email;

    public Client(String name, String cpf){
        this.name = name;
        this.cpf  = cpf;
    }
    public Client(String name, String cpf, String phone, String email){
        this(name, cpf);
        this.phone  = phone;
        this.email  = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf(){
        return cpf;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Owner: " + name + "\n"
                + "CPF: " + cpf + "\n"
                + "Phone: " + phone + "\n"
                + "E-mail: " + email;
    }
}
