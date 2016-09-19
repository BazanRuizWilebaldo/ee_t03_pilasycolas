/*
 *codigo no funciona
 */
package ee_t03_pilasycolas;

/**
 *
 * @author WILY
 */
import java.io.*;
import java.util.*;

import java.util.collections;

public class Tests {

    public ListaSimplementeLigada ;

    public static void main(String[] args) {
        String ar = "Archivos/datos.txt";
        String arc2 = "Archivos/datos2.txt";
  
        
        Stack<String> sc = new Stack <String>();
        File Archivo;
        FileReader Lector;

        Scanner s = new Scanner(System.in);
        try {
            Archivo = new File(ar);
            Lector = new FileReader(Archivo);

            s = new Scanner(Lector);
            while (s.hasNextLine()) {
                int n;
                num = s.nextLine();
                nums = num.split(",");
                
                for (int i = 0 ; i <nums.length();i++){
                String vb = nums.substring(i, i +1);
                
                   if (vb.equals(0)) {
               sc.push(vb);
               
           } else if (vb.equals(1))
                   {
           sc.pop(vb);
           } else if (vb.equals(2)){
           sc.peek(vb);
           
           }
                
                }
                
           
           }
           s.close();
    
    
    
    }catch (FileNotFoundException e){
    System.out.println("no se ha encottrado el archivo");
    }    
    
    
    }
    
}
