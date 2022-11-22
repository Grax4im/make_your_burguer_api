package ifrs.edu.gets;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ifrs.edu.entity.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Path("")
public class Ingredientes{
    
    @GET
    @Path("/carnes")
    public List<PanacheEntityBase> carnes() {
        return Carne.listAll();
    }

    @GET
    @Path("/pao")
    public List<PanacheEntityBase> pao() {
        return Pao.listAll();
    }

    @GET
    @Path("/carnes")
    public List<PanacheEntityBase> status() {
        return StatusBurger.listAll();
    }

    @GET
    @Path("/opcionais")
    public List<PanacheEntityBase> opcionais() {
        return Opcionais.listAll();
    }

}
