package n1Ex2;


import static n1Ex2.GenericMethods.metodeGeneric;


public class App {
    
    public static void main(String[] args) {
        
        
        Persona persona1 = new Persona("Gerard", "Gurgui", 30);
        Persona persona2 = new Persona("Lionel", "Messi", 40);
        
        
        //Com hem fet el metode generic, podem pasar els arguments en l'ordre que volguem
        
        metodeGeneric(persona1.getNom(), persona1, persona1.getEdat());
        
        System.out.println("---------------");
        
        metodeGeneric(persona2, persona2.getEdat(), persona2.getCognom());
        
        
    }
    
}
