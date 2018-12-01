package kata5p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MailListReader {

    public static List<String> Read(String filename){
        List<String> lista = new LinkedList<>();
        String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filename));
            String s;
            
            while ((s = bf.readLine()) != null){
                
                if (s.matches(pattern)){                    
                    lista.add(s);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailListReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailListReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    } 
}
