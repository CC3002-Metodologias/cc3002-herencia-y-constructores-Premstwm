public class Estudiante extends Persona {
    public Estudiante( String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }
    public void comer() {
        System.out.println("Ñom Ñom Gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzz");
    }

    public String hacerLoSuyo() {
        return "Ver animé y series en Netflix";
    }
}
