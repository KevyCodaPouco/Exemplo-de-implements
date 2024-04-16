package principal;

import model.Ave;
import model.Cachorro;
import model.IAnimal;

public class Principal {

    public static void main(String[] args) {
        IAnimal cachorro1 = new Cachorro("Rex");
        cachorro1.produzirSom();
        cachorro1.mover();

        IAnimal ave1 = new Ave("PicaPau");
        ave1.produzirSom();
        ave1.mover();
    }
}
