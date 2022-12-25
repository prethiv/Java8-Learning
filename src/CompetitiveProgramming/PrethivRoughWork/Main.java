package CompetitiveProgramming.PrethivRoughWork;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String firstLine  = scanner.nextLine();
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(item->{
            return Integer.parseInt(item);
        }).collect(Collectors.toList());
        Integer k = Integer.parseInt(firstLine.split(" ")[1]);
        String result="";
        for(Integer data:list){
            if(data!=k){
                result+=data;
                result+=" ";
            }
        }
        result=result.trim().length()==0?"empty":result.trim();
        System.out.println(result);
    }
}