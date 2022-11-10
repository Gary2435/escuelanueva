package pe.com.escuelanueva.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.escuelanueva.entity.ApoderadoEntity;
import pe.com.escuelanueva.entity.ParentescoEntity;

public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity,Long>{
    @Query("select a from ApoderadoEntity a where a.estado=1")
    List<ApoderadoEntity> findAllCustom();

   
}
