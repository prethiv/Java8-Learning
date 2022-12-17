package CompetitiveProgramming.PrethivRoughWork;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListTutorial {

    public static void main(String[] args) {

        ArrayList<String> stringarrayList = new ArrayList<String>();

        PrethivUtility prethivUtility = new PrethivUtility();

        stringarrayList.add("Prethiv");
        stringarrayList.add("Ajay");
        stringarrayList.add("Ajith");

        System.out.println(stringarrayList);
        prethivUtility.printLine();
        Iterator<String> itr =  stringarrayList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        prethivUtility.printLine();
        for(String names:stringarrayList){
            System.out.println(names);
        }
        prethivUtility.printLine();
        System.out.println("Returning element: "+stringarrayList.get(1));

        stringarrayList.set(1,"Love");
        prethivUtility.printLine();
        for(String names:stringarrayList){
            System.out.println(names);
        }

        Collections.sort(stringarrayList);

        prethivUtility.printLine();

        System.out.println(stringarrayList);

        prethivUtility.printLine();

        stringarrayList.forEach(data->{
            System.out.println(data);
        });

        stringarrayList.add("Hello");

        prethivUtility.printLine();

        System.out.println(stringarrayList);

        prethivUtility.printLine();

        stringarrayList.remove("Hello");

        prethivUtility.printLine();

        System.out.println(stringarrayList);

    }

}
