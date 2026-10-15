// This is the class for practicing ArrayList!
//An ArrayList is a resizable collection that stores elements in a sequence.
//ArrayList is a class already provided by Java, in the java.util package.
// int[] numbers = new int[3]; In array, The array has a fixed length of 3. You cannot increase that array's length after creating it.
//In ArrayList- you can keep adding elements, and the list grows as needed.
// ArrayList stores duplicate values.
import java.util.*;
public class ArrayListPractice
{
    public static void main(String[]args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");//adding elements in array list
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add(1,"kiwi");// adding elements at a specific index.


        System.out.println(fruits);//printing array list.
        System.out.println(fruits.get(1));//retrieving an element
        System.out.println(fruits.set(2,"Guava"));//replace an element
        System.out.println(fruits);//printing array list.
        fruits.remove(2);//remove by index
        fruits.remove("kiwi");//remove by value
        System.out.println(fruits);//printing array list.
        fruits.remove(String.valueOf("Apple"));//remove by object
        System.out.println(fruits);//printing array list.

    }
}
