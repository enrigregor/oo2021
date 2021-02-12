import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class Lessonwork {
    public static void aList(String[] args) {
        //teeb uusi massiive kui vana jääb väikseks
        //kasutada pigem siis kui on vaja suvalist stringi ning tihti.
        //kasutada pigem siis kui lisada või eemaldada elemente listi lõpust.
        ArrayList<String> utilities = new ArrayList<String>();
        utilities.add("CCleaner");
        utilities.add("Malwarebytes");
        utilities.add("CleanMyPC");
        utilities.add("AVG PC TuneUp");
        utilities.add("LifeLock");
        utilities.add("Razer Cortex");
        for (int i = 0; i < utilities.size(); i++) {
          System.out.println(utilities.get(i));
        }
      }

      public static void linList(String[] args) {
          //hoiab väärtusi n-ö "konteinerites" ning listil on igale konteinerile vastav link
          //kasutada kui loop-ida läbi listi otsides midagi
          //võimaldab lisada/kustutada elemente igast listi kohast (algusest, keskelt, lõpust)
        LinkedList<String> utilities = new LinkedList<String>();
        utilities.add("CCleaner");
        utilities.add("Malwarebytes");
        utilities.add("CleanMyPC");
        utilities.add("AVG PC TuneUp");
        utilities.add("LifeLock");
        utilities.add("Razer Cortex");
        System.out.println(utilities);
      }

      public static void hashSetList(String[] args) {
          //listis võib küll olla ühte asja mitu aga välja lugedes näidatakse ainult ühte, sest iga set peab olema unikaalne
        HashSet<String> utilities = new HashSet<String>();
        utilities.add("CCleaner");
        utilities.add("Malwarebytes");
        utilities.add("CleanMyPC");
        utilities.add("AVG PC TuneUp");
        utilities.add("LifeLock");
        utilities.add("Razer Cortex");
        System.out.println(utilities);
      }
}
