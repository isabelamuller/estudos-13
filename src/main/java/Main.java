import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Suecia");
        paises.add("Noruega");
        paises.add("Finlandia");
        paises.add("Dinamarca");

        Iterator<String> iterator = paises.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println( next); // cara eu nao sei oq eh iterator namoral tentei entender e n entendi
        }                              // pra que raios serve isso? eu ein nao entendi
    }
}