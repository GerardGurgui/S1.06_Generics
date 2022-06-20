package n2Ex1;


public class GenericMethods {
    
    
    public static <T> void metodeGeneric(T persona, String nom, T edat){
        
        System.out.println(persona.toString());
        System.out.println(nom);
        System.out.println(edat);
        
    }
    
}
