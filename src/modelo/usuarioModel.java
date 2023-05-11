package modelo;

public class usuarioModel {

    
    private Object _id;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String password;
    private String ciudad;
    private boolean activo;
    private String img;

    @Override
    public String toString() {
        return "usuarioModel{" + "_id=" + _id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo + ", password=" + password + ", ciudad=" + ciudad + ", activo=" + activo + ", img=" + img + '}';
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

    
    
}
