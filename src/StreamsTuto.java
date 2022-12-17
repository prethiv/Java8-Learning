import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTuto {

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Prethiv");
        names.add("Ajay");
        names.add("Ajith");

        System.out.println(names.stream().count());

        List<Integer> temp=names.stream().filter(i->i.length()>6).map(i->i.length()).collect(Collectors.toList());

        //Collect names having length >4

        List<String> temp1 = names.stream().filter(i->i.length()>4).collect(Collectors.toList());

        names.stream().forEach(System.out::println);

        //given a names collect all names length plus 2

        List<Integer> answer1 = names.stream().map(StreamsTuto::addTwo).collect(Collectors.toList());

        Optional<String> answer2 = names.stream().findAny();

        System.out.println(names.stream().allMatch(i->i.length()>4));

        System.out.println(names.stream().anyMatch(i->i.length()>4));

        System.out.println(temp);
        System.out.println(temp1);
        System.out.println(answer1);
        System.out.println(answer2);

        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employeeList = employeeDAO.getEmployees();

        System.out.println(employeeList);

        List<String> employeenames = employeeList.stream().map(i->i.name).collect(Collectors.toList());
        System.out.println(employeenames);

        System.out.println(employeeList.stream().allMatch(i->i.desc.length()>4));

        Optional<Employee> t=employeeList.stream().findAny();
        System.out.println(t);

         employeeList.stream().filter(employee->employee.id%2==0).collect(Collectors.toList()).forEach(System.out::println);

         employeeList.parallelStream().filter(employee -> employee.id%2==0).collect(Collectors.toList()).forEach(System.out::println);

         List<String> friends = Arrays.asList("Bhashith","Ajay","Ajith","Ajith");

         List<Integer> mynums = Arrays.asList(1,2,3,4,5);

         System.out.println(mynums.stream().reduce(1,(a,b)->{ return a*b;}));

         System.out.println(mynums.stream().parallel().reduce(0,(a,b)->a+b));

         System.out.println(mynums.stream().map(i->i+2).reduce(0,(a,b)->a+b));

         System.out.println(mynums.stream().filter(i->i%2==0).reduce(0,(a,b)->a+b));

         String allFriends = friends.stream().reduce("",(a,b)->a+b+" ");

         System.out.println(allFriends);

         List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

         System.out.println(numbers.stream().reduce(numbers.get(0),(a,b)->a<b?a:b));

         System.out.println(numbers.stream().anyMatch(i->i==2));


         names.forEach(item->System.out.println(item));

         List<Integer> list1 = Arrays.asList(1,2,2,2,3,4,5,6,7);
       List<Integer> list2=  list1.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println(list2);

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();

        System.out.println(count);

    }


    public static int addTwo(String i){
        return i.length()+2;
    }

}
