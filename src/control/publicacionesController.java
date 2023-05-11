package control;

import java.util.List;
import mongoconexion.conexion;
import org.bson.Document;

public class publicacionesController {

    conexion mongoDB = new conexion();
    
    public boolean NuevaPublicacion(Document dbo){
        return mongoDB.NuevaPublicacion(dbo);
    }
    
}
