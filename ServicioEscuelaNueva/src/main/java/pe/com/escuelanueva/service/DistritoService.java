package pe.com.escuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.escuelanueva.entity.DistritoEntity;

public interface DistritoService {
    //func para mostrar todos los datos
    List<DistritoEntity>findAll();
    //func para mostrar los distritos habilitados 
    List<DistritoEntity> findAllCustom();
    //func para mostrar un dis por cod
    Optional<DistritoEntity> findById(long id);
    //func para registrar
    DistritoEntity add (DistritoEntity d);
    //func para actualizar
    DistritoEntity update (DistritoEntity d);
    //func para eliminar
    DistritoEntity delete (DistritoEntity d);
    
    
}
