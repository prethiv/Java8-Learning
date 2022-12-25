package CompetitiveProgramming.PrethivRoughWork;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double days = scanner.nextDouble();
        scanner.nextLine();
        HashMap<Character,Double> attendence = new HashMap<>();
        for(int i=0;i<days;i++){
            Character PorA = scanner.next().toCharArray()[0];
            try {
                attendence.put(PorA, attendence.get(PorA) + 1.0);
            }
            catch(Exception e){
                attendence.put(PorA,1.0);
            }
        }

        Double percentage = Double.valueOf((days/attendence.get('P'))*100);

        if(percentage>25){
            System.out.print("Not Blacklisted");
        }
        else{
            System.out.print("Blacklisted");
        }

    }
}