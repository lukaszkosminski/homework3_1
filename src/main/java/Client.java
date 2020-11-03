public class Client{

    private String name;
    private String telephone;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Client(String name, String telephone, String adress) {
        this.name = name;
        this.telephone = telephone;
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}