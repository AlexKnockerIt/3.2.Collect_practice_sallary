import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Sasha1", "программист", 50));
        employees.add(new Employee("Sasha2", "программист", 50));
        employees.add(new Employee("Sasha3", "менеджер", 50));
        employees.add(new Employee("Sasha4", "менеджер", 50));
        employees.add(new Employee("Sasha5", "программист", 50));
        employees.add(new Employee("Sasha6", "бухгалтер", 50));

//        for(Employee i : employees){ //перебор должностей в множестве employees
//            System.out.println(i.getOccupation());
//        }

        Map<String, Integer> occupationAndSalary = new HashMap<>(); //[должность:сумма зарплат]
        Map<String, Integer> occupationAndQuantity = new HashMap<>(); //[должность:кол-во]
        Map<String, Integer> occupationAndAverSalary = new HashMap<>(); //[должность:средняя зарплата]

        for (Employee occup : employees) { //добавление в occupationAndSalary [должность:сумма зарплат]
            if(!occupationAndSalary.containsKey(occup.getOccupation())){
                occupationAndSalary.put(occup.getOccupation(), occup.getSalary());
            }
            else{
                occupationAndSalary.put(occup.getOccupation(), occupationAndSalary.get(occup.getOccupation())+occup.getSalary());
            }
        }
        System.out.println("Сумма зарплат: "+occupationAndSalary);


        for (Employee occup : employees) { //добавление в occupationAndQuantity [должность:количество]
            if(!occupationAndQuantity.containsKey(occup.getOccupation())){
                occupationAndQuantity.put(occup.getOccupation(), 1);
            }
            else{
                occupationAndQuantity.put(occup.getOccupation(), occupationAndQuantity.get(occup.getOccupation())+1);
            }
        }
        System.out.println("Кол-во: "+occupationAndQuantity);

        for (Map.Entry<String, Integer> entry : occupationAndSalary.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            occupationAndAverSalary.put(key, value/occupationAndQuantity.get(key));
        }

        System.out.println("Средняя зарплата: "+occupationAndAverSalary);

    }
}