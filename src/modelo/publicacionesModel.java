package modelo;

public class publicacionesModel {
    
    private Object _id;
    private String fechaHora;
    private String contenido;
    private String img;
    private String correo;

    @Override
    public String toString() {
        return "publicacionesModel{" + "_id=" + _id + ", fechaHora=" + fechaHora + ", contenido=" + contenido + ", img=" + img + ", correo=" + correo + '}';
    }

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
