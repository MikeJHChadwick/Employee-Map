/**
 * This Class tests a TreeMap populated with Employee objects.
 *
 * @author Michael Chadwick
 * @version 4/22/2020
 */
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
public class EmployeeTester
{
    /**
     * Creates the Employee's that will populate the TreeMap.
     */
    public static void main(String[] args)
    {
        Map<Integer, Employee> empMap = new TreeMap<>();
        
        empMap.put(1, new Employee (1, "Charles", 65000));
        empMap.put(2, new Employee (2, "Ben", 35000));
        empMap.put(3, new Employee (3, "Isabella", 116000));
        empMap.put(4, new Employee (4, "Drew", 87526));
        empMap.put(5, new Employee (5, "Jamar", 44789));
        
        displayEmp_Map(empMap);
        System.out.println();
        
        findByKey(empMap, 8);
        findByKey(empMap, 3);
        System.out.println();
        
        empSal_Greater_Than_60K(empMap);
    }
    
    /**
     * This method diplays all Employee's in the TreeMap.
     * @param empMap the Employee TreeMap
     */
    public static void displayEmp_Map(Map<Integer, Employee> empMap)
    {
        Set<Integer> keySet = empMap.keySet();
        for(Integer key : keySet)
            System.out.println(empMap.get(key));                       
    }
    
    /**
     * This method checks to see if a employee number is in the TreeMap and desplays different strings for if it's true or false.
     * @param empMap the Employee's TreeMap
     * @param keyToFind the Employee's number as a key to find
     */
    public static void findByKey(Map<Integer, Employee> empMap, Integer keyToFind)
    {
        if(empMap.containsKey(keyToFind))
            System.out.println("Here's employee number " + keyToFind +  "'s information " + " " + empMap.get(keyToFind));
        else
            System.out.println("There's no employee with " + keyToFind + " as their employee number.");
    }
    
    /**
     * This method uses searches the TreeMap for Employee's with a salary greater than $60k and displays them.
     * @param empMap the Employee's TreeMap
     */
    public static void empSal_Greater_Than_60K(Map<Integer, Employee> empMap)
    {
        empMap.keySet()
        .stream()
        .filter(empNum -> empMap.get(empNum).getEmp_Salary()>60000.0)
        .forEach(empNum -> System.out.println(empMap.get(empNum)));
    }   
}
