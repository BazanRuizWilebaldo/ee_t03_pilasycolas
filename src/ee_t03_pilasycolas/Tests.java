/*
 *posible solucion, pero no funcional

 */
package ee_t03_pilasycolas;

/**
 *
 * @author WILY
 */
import java.io.*;
import java.util.*;
//import cola.cola;


public class Tests {

    //public ListaSimplementeLigada();

    public static void main(String[] args) {
        String ar = "Archivos/datos.txt";
        //String arc2 = "Archivos/datos2.txt";
        String num;

        String nums[];
        Stack<String> stk = new Stack<String>();
        cola<T> col = new cola<T>();

        File Archivo;
        FileReader Lector;

        Scanner s = new Scanner(System.in);
        try {
            Archivo = new File(ar);
            Lector = new FileReader(Archivo);

            s = new Scanner(Lector);
            while (s.hasNextLine()) {

                num = s.nextLine();
                nums = num.split(",");
                int x = nums.length();

                for (int i = 0; i < x; i++) {
                    String lk = nums.substring(i, i + 1);
                    if (nums.equals("0")) {
                        System.out.println("es una pila");
                        if (nums.equals("0")) {
                            stk.push(nums);
                        } else if (nums.equals(1)) {
                            stk.pop();
                        } else if (nums.equals(2)) {
                            stk.peek();
                        }System.out.println(stk);
                        break;
                        
                    } else if (nums.equals("1")) {
                        System.out.println("es una cola");
                        if (nums.equals("0")) {
                            col.intsertar(nums);

                        } else if (nums.equals("1")) {
                            col.eliminar();

                        }
                        System.out.println("la cola "+col.mostrar());
                        break;

                    }

                }


                
                
                /*
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
                */
                
           
           }
           s.close();
    
    
    
    }catch (FileNotFoundException e){
    System.out.println("no se ha encottrado el archivo");
    }    
    
    
    }
    
}
