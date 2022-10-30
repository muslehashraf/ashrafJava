package notes_java;

public class _10_30_2022_ArrayList_LinkedList_Vector {
    /*
            10/30/2022 - ArrayList-LinkedList-Vector
        RECAP:
        Array - ArrayList
        Similarities:
            -They are both collection and used to store multiple same/similar data (elements)
            -They both work with objects
            -They both allows programmers to manipulate the data (CRUD)
        Differences:
            -Array is fixed-sized while ArrayList is dynamic
            -ArrayList is known as dynamic sized array
            -Array can work both with primitives and objects
            -ArrayList works only with objects
        ARRAYLIST - LINKEDLIST - VECTOR
        Syntax:
        ArrayList<dataType> varName = new ArrayList<>();
        List<dataType> varName = new ArrayList<>();
        LinkedList<dataType> varName = new LinkedList<>();
        List<dataType> varName = new LinkedList<>();
        Vector<dataType> varName = new Vector<>();
        List<dataType> varName = new Vector<>();
        1. add(Object)
        2. add(index, Object)
        3. get(index)
        4. set(index, Object)
        5. size()
        6. remove(Object)
        7. remove(index)
        8. clear()
        9. removeAll(Collection)
        10. addAll(Collection)
        11. addAll(index, Collection)
        12. retainAll(Collection)
        13. contains(Object)
        14. containsAll(Collection)
        15. indexOf(Object)
        16. lastIndexOf(Object)
        HOW TO SORT LISTS?
        -We can use Collections.sort(list) method
        SYNTAX:
            ArrayList<String> words = new ArrayList<>();
            Collections.sort(words);
        Numbers -> ascending order
        Strings -> Lexicographically
        ARRAYLIST vs LINKEDLIST
        -ArrayList stores elements in the memory with their indexes
        -ArrayList takes less memory compared to LinkedList
        -LinkedList is faster when it comes to removing/adding elements
        -LinkedList implements Deque and Queue interfaces and provides more methods to manipulate data in it
        WHEN TO USE ARRAYLIST OR LINKEDLIST?
        -If the size of the collection does not change often, then it is better to use ArrayList
        -If the size is changing frequently, then it is better to use LinkedList
        -LinkedList provides better performance when removing or adding elements
        -ArrayList allocates less memory compared to ArrayList
        LinkedList methods
            -addFirst() vs offerFirst(): they add an element to the 0th index but addFirst() is a void method while offerFirst() returns a boolean
            -addLast() vs offerLast()-offer(): they add an element to the last index but addLast() is a void method while offerLast()-offer() return a boolean
            -getFirst() vs getLast(): they are used to first and last elements from the LinkedList

            -peek()-peekFirst(): Retrives the first element like getFirst()
            -peekLast(): Retrives the last element like getLast()
            -pop(): retrieves and removes the first element
            -poll() or pollFirst(): retrieves and removes the first element
            -pollLast(): retrives and removes the last element
            -push(): adds an element to the 0th index like addFirst()
            -removeFirst() vs removeLast(): removes the first or last element
            -removeFirstOccurrence() vs removeLastOccurrence(): removes the first or last occurrences of given objects
        ARRAYLIST vs VECTOR
        -Vector is synchronized
        -Synchronized means Thread-safe
        HOW TO CONVERT ARRAY TO ARRAYLIST?
        -Use Arrays.asList() method
            dataType[] arr = {e1, e2, e3};
            ArrayList<dataType> list = new ArrayList<>(Arrays.asList(arr));
        -Use loops
            dataType[] arr = {e1, e2, e3};
            ArrayList<dataType> list = new ArrayList<>();
            for(dataType element : arr){
                list.add(element);
            }
            for(int i = 0; i < arr.length; i++){
                list.add(arr[i]);
            }
        -Use Collections.addAll(list, arr);
            dataType[] arr = {e1, e2, e3};
            ArrayList<dataType> list = new ArrayList<>();
            Collections.addAll(list, arr);
        HOW TO CONVERT A LIST TO AN ARRAY?
            ArrayList<String> lan = new ArrayList<>();
            lan.add("Java");
            lan.add("C#");
            lan.add("Ruby");
            Object[] arr = lan.toArray();
             */
}
