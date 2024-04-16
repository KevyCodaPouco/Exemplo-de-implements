package model;

public class Ave implements IAnimal {

    private String nome;

    public Ave() {
        this("");
    }

    public Ave(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void produzirSom() {
        System.out.println("Cantar");
    }

    @Override
    public void mover() {
        System.out.println("Voar");
    }

}
