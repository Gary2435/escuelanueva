package pe.com.escuelanueva.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.service.DistritoService;

@RestController
@RequestMapping("/distrito")

public class DistritoController {
    @Autowired
    private DistritoService distritoService;    
    
    //getmapping permite obtener valores
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoService.findAll();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return distritoService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DistritoEntity>findById(@PathVariable Long id){
        return distritoService.findById(id);
    }
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity p){
        return distritoService.add(p);
    }
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id ,@RequestBody DistritoEntity d){
            d.setCodigo(id);
            return distritoService.update(d);
    }
    @DeleteMapping("{id}")
    public DistritoEntity delete(@PathVariable long id ){
        DistritoEntity objdistrito=new DistritoEntity();
            objdistrito.setEstado(false);
            return distritoService.delete(DistritoEntity.builder().codigo(id).build());
    }
}
