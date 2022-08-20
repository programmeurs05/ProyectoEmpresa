package programmeurs.empresa;

//piloto clase Enterprise
public class Enterprise {

    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private date createdAt;
    private date updateAt;
    

    public Enterprise(long id, String name, String document, String phone, String address, date createdAt, date updateAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
  
}
