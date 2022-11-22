package ifrs.edu.controller;

import java.util.List;
import ifrs.edu.entity.Burger;

public class CreateBurger {

    private CreateBurger(){}

    public static boolean createburger(String carne, List<String> opcionais, String pao) {
        
        Burger burger = new Burger();

        burger.setCarne(carne);
        burger.setOpcionais(opcionais);
        burger.setPao(pao);
        burger.setStatus("Pendente");
        
        return (persist(burger));
    }

    private static boolean persist(Burger burger){
        burger.persist();
        return burger.isPersistent();
    }
}
