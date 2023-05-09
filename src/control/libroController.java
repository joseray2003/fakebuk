package control;

import java.util.List;
import mongoconexion.conexion;
import org.bson.Document;

public class libroController {
    
    conexion mongoDB = new conexion();
    
    public List<Document> listarLibros(){
        return mongoDB.listarLibros();
    }
    
    public boolean Insertar(Document dbo){
        return mongoDB.Insertar(dbo);
    }
    
    public boolean Eliminar(Document dbo){
        return mongoDB.Eliminar(dbo);
    }
    
    public boolean Editar(Document original, Document nuevo){
        return mongoDB.Editar(original, nuevo);
    }
    
}
