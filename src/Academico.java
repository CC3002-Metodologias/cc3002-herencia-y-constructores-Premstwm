public class Academico extends Persona{
    private String paper;

    public Academico( String nombre, String ocupacion, int edad, String paper){
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }

    public void comer() {
        super.comer();
    }

    public void dormir() {
        System.out.println("ZzzZzzZ");
    }

    public String hacerLoSuyo() {
        return "Aprender a usar Zoom";
    }

    public void publicarPaper(){ System.out.println(this.paper);}
}
