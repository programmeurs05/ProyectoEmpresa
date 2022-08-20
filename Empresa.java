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
      public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public date getUpdateAt() {
        return updateAt;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCreatedAt(date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdateAt(date updateAt) {
		this.updateAt = updateAt;
	}

}
