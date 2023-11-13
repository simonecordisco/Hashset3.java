import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<String> stringHashSet = createAndPopulateHashSet();

        String objectToBeRemoved = "Elemento1";
        System.out.println("Oggetto creato: " + objectToBeRemoved);

        removeElement(stringHashSet, objectToBeRemoved);
        stringHashSet.clear();
        System.out.println("HashSet svuotato: " + stringHashSet);
    }
    private static HashSet<String> createAndPopulateHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");

        System.out.println("HashSet riempito: " + hashSet);

        return hashSet;
    }

    private static void removeElement(HashSet<String> hashSet, String elementToRemove) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(elementToRemove)) {
                iterator.remove();
                System.out.println("Elemento rimosso: " + element);
            }

        }
        System.out.println("HashSet: " + hashSet);
    }
}