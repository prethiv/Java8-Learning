package CompetitiveProgramming.PrethivRoughWork;

import javax.print.attribute.IntegerSyntax;
import java.util.*;
import java.util.stream.Collectors;

public class ShrinkArray {

    public static Integer shrinkArray(List<Integer> list,Integer k){
        if(list.size()==0){
            return 0;
        }
        else {
            boolean tripletFound = false;
            List<Integer> intermediateryResult = new ArrayList<>();
            for (int i = 0; i < list.size() - 2; i++) {
                if ((Math.abs(list.get(i + 1) - list.get(i) )== k) && (Math.abs(list.get(i + 2) - list.get(i + 1) )== k)) {
                    List<Integer> newList = new ArrayList<>();
                    tripletFound = true;
                    for (int j = 0; j < list.size(); j++) {
                        if (j == i) {
                            j += 2;
                        } else {
                            newList.add(list.get(j));
                        }
                    }
                    Integer intermediateryresult = shrinkArray(newList, k);
                    intermediateryResult.add(intermediateryresult);
                }
            }

            if (!tripletFound) {
                return list.size();
            } else {
                return Collections.min(intermediateryResult);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list= Arrays.stream(scanner.nextLine().split(",")).map(item->{
            return Integer.parseInt(item.trim());
        }).collect(Collectors.toList());
        Integer k = scanner.nextInt();
        System.out.println("Resultant Array Size "+shrinkArray(list,k));


    }

}
