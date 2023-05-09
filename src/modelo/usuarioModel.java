package modelo;

public class usuarioModel {

    
    private Object _id;
    private String nombre;
    private int edad;
    private String email;
    private String password;
    private String ciudad;
    private String fotoPerfil;
    private boolean activo;

    @Override
    public String toString() {
        return "usuarioModel{" + "_id=" + _id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", password=" + password + ", ciudad=" + ciudad + ", fotoPerfil=" + fotoPerfil + ", activo=" + activo + '}';
    }

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
}
