package com.ejemplo.Proyecto;


import java.time.LocalDate;

public class Enterprise {

    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private LocalDate createdAt;
    private LocalDate updateAt;


    
    public Enterprise(long id, String name, String document, String phone, String address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
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

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}

    @Override
    public String toString() {
        return id + " " + name + " " + document + " " + phone + " " + address + " " + createdAt + " " + updateAt;
    }
}
