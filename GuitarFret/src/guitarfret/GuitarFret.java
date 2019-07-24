
package guitarfret;
import org.jfugue.player.*;



public class GuitarFret {

    
    public static void main(String[] args) {
        
        Player player = new Player ();
        
        int i, corda = 6, casa;
        
        Fret nota = new Fret ();
        
        
        for (i = 0; i <= 12; i++){
           
            nota.tocar(corda, i);
           
        }
        
        
       
        
        
        
    }
    
}
