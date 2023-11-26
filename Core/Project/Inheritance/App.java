public class App {
    public static void main(String[] args) {
        SUV maruti = new SUV("Maruti", false);
        maruti.move(80, 45);
        maruti.acceLerate(30);

        System.out.println("Current Gear : " + maruti.getCurrentGear());
        System.out.println("Current Speed :  " + maruti.getCurrentSpeed());
    }
    
}
