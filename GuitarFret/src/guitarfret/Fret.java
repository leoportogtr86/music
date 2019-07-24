
package guitarfret;
import org.jfugue.player.*;


public class Fret {
    
    int corda, casa;    
    
    
    public void tocar (int corda, int casa){
    
       String nota = "R";
        
       Player player = new Player ();
       
       if (corda == 1 && casa == 0){
       
          nota = "E";
       
       } else if (corda == 1 && casa == 1){
       
          nota = "F";
       
       } else if (corda == 1 && casa == 2){
       
          nota = "F#";
       
       } else if (corda == 1 && casa == 3){
       
          nota = "G";
       
       } else if (corda == 1 && casa == 4){
       
          nota = "G#";
       
       } else if (corda == 1 && casa == 5){
       
          nota = "A";
       
       } else if (corda == 1 && casa == 6){
       
          nota = "A#";
       
       } else if (corda == 1 && casa == 7){
       
          nota = "B";
       
       } else if (corda == 1 && casa == 8){
       
          nota = "C6";
       
       } else if (corda == 1 && casa == 9){
       
          nota = "C#6";
       
       } else if (corda == 1 && casa == 10){
       
          nota = "D6";
       
       } else if (corda == 1 && casa == 11){
       
          nota = "D#6";
       
       } else if (corda == 1 && casa == 12){
       
          nota = "E6";
       
       }
       
       
       //corda 2
       
       else if (corda == 2 && casa == 0){
       
          nota = "B4";
       
       } else if (corda == 2 && casa == 1){
       
          nota = "C";
       
       } else if (corda == 2 && casa == 2){
       
          nota = "C#";
       
       } else if (corda == 2 && casa == 3){
       
          nota = "D";
       
       } else if (corda == 2 && casa == 4){
       
          nota = "D#";
       
       } else if (corda == 2 && casa == 5){
       
          nota = "E";
       
       } else if (corda == 2 && casa == 6){
       
          nota = "F";
       
       } else if (corda == 2 && casa == 7){
       
          nota = "F#";
       
       } else if (corda == 2 && casa == 8){
       
          nota = "G";
       
       } else if (corda == 2 && casa == 9){
       
          nota = "G#";
       
       } else if (corda == 2 && casa == 10){
       
          nota = "A";
       
       } else if (corda == 2 && casa == 11){
       
          nota = "A#";
       
       } else if (corda == 2 && casa == 12){
       
          nota = "B";
       
       }
       
       //----------------------------------------------------------------------
       
       //corda 3
       
         else if (corda == 3 && casa == 0){
       
          nota = "G4";
       
       } else if (corda == 3 && casa == 1){
       
          nota = "G#4";
       
       } else if (corda == 3 && casa == 2){
       
          nota = "A4";
       
       } else if (corda == 3 && casa == 3){
       
          nota = "A#4";
       
       } else if (corda == 3 && casa == 4){
       
          nota = "B4";
       
       } else if (corda == 3 && casa == 5){
       
          nota = "C5";
       
       } else if (corda == 3 && casa == 6){
       
          nota = "C#5";
       
       } else if (corda == 3 && casa == 7){
       
          nota = "D5";
       
       } else if (corda == 3 && casa == 8){
       
          nota = "D#5";
       
       } else if (corda == 3 && casa == 9){
       
          nota = "E5";
       
       } else if (corda == 3 && casa == 10){
       
          nota = "F5";
       
       } else if (corda == 3 && casa == 11){
       
          nota = "F#5";
       
       } else if (corda == 3 && casa == 12){
       
          nota = "G5";
       
       }
       
       //----------------------------------------------------------------------
       
       //corda 4
       
         else if (corda == 4 && casa == 0){
       
          nota = "D4";
       
       } else if (corda == 4 && casa == 1){
       
          nota = "D#4";
       
       } else if (corda == 4 && casa == 2){
       
          nota = "E4";
       
       } else if (corda == 4 && casa == 3){
       
          nota = "F4";
       
       } else if (corda == 4 && casa == 4){
       
          nota = "F#4";
       
       } else if (corda == 4 && casa == 5){
       
          nota = "G4";
       
       } else if (corda == 4 && casa == 6){
       
          nota = "G#4";
       
       } else if (corda == 4 && casa == 7){
       
          nota = "A4";
       
       } else if (corda == 4 && casa == 8){
       
          nota = "A#4";
       
       } else if (corda == 4 && casa == 9){
       
          nota = "B4";
       
       } else if (corda == 4 && casa == 10){
       
          nota = "C5";
       
       } else if (corda == 4 && casa == 11){
       
          nota = "C#5";
       
       } else if (corda == 4 && casa == 12){
       
          nota = "D5";
       
       }
       
       //----------------------------------------------------------------------
       //corda 5
       
         else if (corda == 5 && casa == 0){
       
          nota = "A3";
       
       } else if (corda == 5 && casa == 1){
       
          nota = "A#3";
       
       } else if (corda == 5 && casa == 2){
       
          nota = "B3";
       
       } else if (corda == 5 && casa == 3){
       
          nota = "C4";
       
       } else if (corda == 5 && casa == 4){
       
          nota = "C#4";
       
       } else if (corda == 5 && casa == 5){
       
          nota = "D4";
       
       } else if (corda == 5 && casa == 6){
       
          nota = "D#4";
       
       } else if (corda == 5 && casa == 7){
       
          nota = "E4";
       
       } else if (corda == 5 && casa == 8){
       
          nota = "F4";
       
       } else if (corda == 5 && casa == 9){
       
          nota = "F#4";
       
       } else if (corda == 5 && casa == 10){
       
          nota = "G4";
       
       } else if (corda == 5 && casa == 11){
       
          nota = "G#4";
       
       } else if (corda == 5 && casa == 12){
       
          nota = "A4";
       
       }
       
       //-----------------------------------------------------------------------
        //corda 6
       
         else if (corda == 6 && casa == 0){
       
          nota = "E3";
       
       } else if (corda == 6 && casa == 1){
       
          nota = "F3";
       
       } else if (corda == 6 && casa == 2){
       
          nota = "F#3";
       
       } else if (corda == 6 && casa == 3){
       
          nota = "G3";
       
       } else if (corda == 6 && casa == 4){
       
          nota = "G#3";
       
       } else if (corda == 6 && casa == 5){
       
          nota = "A3";
       
       } else if (corda == 6 && casa == 6){
       
          nota = "A#3";
       
       } else if (corda == 6 && casa == 7){
       
          nota = "B3";
       
       } else if (corda == 6 && casa == 8){
       
          nota = "C4";
       
       } else if (corda == 6 && casa == 9){
       
          nota = "C#4";
       
       } else if (corda == 6 && casa == 10){
       
          nota = "D4";
       
       } else if (corda == 6 && casa == 11){
       
          nota = "D#4";
       
       } else if (corda == 6 && casa == 12){
       
          nota = "E4";
       
       }
       
       player.play(nota);
    
    }
    
    
    
}
