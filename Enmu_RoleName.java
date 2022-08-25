package com.ejemplo.Proyecto;

public class Enmu_RoleName {
    private String Admin;
    private String Operario;
    
    public Enmu_RoleName(String Admin, String Operario) {
        this.Admin = Admin;
        this.Operario = Operario;
    }

    public String getAdmin() {
        return this.Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String getOperario() {
        return this.Operario;
    }

    public void setOperario(String Operario) {
        this.Operario = Operario;
    }

}
