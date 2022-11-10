package pe.com.escuelanueva.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.entity.ParentescoEntity;

public interface ParentescoRepository extends JpaRepository<ParentescoEntity,Long>{
    @Query("select f from ParentescoEntity f where f.estado=1")
    List<ParentescoEntity> findAllCustom();

    
}
