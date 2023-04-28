import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* @author:Laura Irais García Mendoza
 * @mail: iraisgm1219@gmail.com
 * PRACTICAS LISTAS ENLAZADAS
 */

public class listasEnlazadas2 {
    class demoItr {
        public static void main(String[] args) {
            LinkedList<telefonos> agenda =
                new LinkedList<telefonos>( );
        
    agenda.add(new telefonos("Ernesto", "555-5456"));
    agenda.add(new telefonos("Carlos", "555-3976"));
    agenda.add(new telefonos("Karen", "555-1010"));

    Iterator<telefonos> itr=agenda.iterator( );
    telefonos et;
    System.out.println("itera en la lista en " + " dirección hacia delante:");

    while(itr.hasNext()) {

        et = itr.next();
        //System.out.println(itr.next());
        System.out.println(et.nombre + ":" + et.numero);
    }
        System.out.println();

    ListIterator<telefonos> litr =
        agenda.listIterator(agenda.size( ));
    System.out.println ("itera en la lista en" + "dirección inversa:");

    while(litr.hasPrevious( )) {
        et = litr.previous( );
        System.out.println(et.nombre + ":" + et.numero);

    }
        }
    }
    
}
