package notes_java;

public class _10_29_2022_ArrayList_LinkedList_Vector {
    /*
            Array:
        -It is a collection that stores multiple data
        -It is fixed sized
            int[] numbers = new int[3];
        -Array works with both primitives and objects
        -Manipulating data in the array happens with index
            numbers[1] = 3;
            System.out.println(numbers[1]);
        ArrayList:
        -ArrayList is known as dynamic sized arrays
        -ArrayList is a collection that is used to store multiple same data in one variable
        -It is not fixed size that you can add or remove elements. You can change the size
        -ArrayList (LinkedList and Vector) works only with objects (Wrapper for primitives)
        -Manipulation on the elements happens with ready methods
            numbers.set(1, 3);
            System.out.println(numbers.get(1));
        ArrayList Syntax:
        ArrayList<Double> numbers = new ArrayList<>();
        How to print ArrayList
        System.out.println(numbers);
        The size of the ArrayList
        System.out.println(numbers.size()); // 0
        ARRAYLIST METHODS
        1. size()
            -TASK: it gets the size of the ArrayList
            -return
            -returns an int
            -non-static
            -no args
        2. add(element)
            -TASK: it adds an element to the next available cell
            -return
            -returns a boolean (true when the element is added)
            -non-static
            -takes an element as argument
        3. add(int index, element)
            -TASK: it adds element to the specified index
            -void
            -does not return anything
            -non-static
            -takes 2 args as index and the element
        4. set(int index, element)
            -TASK: it updates element at the specified index
            -return
            -returns the replaced-updated element
            -non-static
            -takes 2 args as index and the element
        5. get(index)
            -TASK: it retrieves the element at specified index
            -return
            -returns the element at specified index
            -non-static
            -takes index as an argument
        6. remove(index)
            -TASK: it removes the element at specified index
            -return
            -returns the object that is removed
            -non-static
            -takes an index as an arg
        7. remove(Object)
            -TASK: it removes given element if exists
            -return
            -returns a boolean
            -non-static
            -takes an Object as an arg
        NOTE: If the object specified occurs multiple times in the collection, then remove(Object) method will always remove the first occurrence
        8. clear()
            -TASK: it removes all elements from the ArrayList
            -void
            -does not return anything
            -non-static
            -no args
        9. removeAll(Collection)
            -TASK: it removes given collection from the ArrayList
            -return
            -returns a boolean
            -non-static
            -takes a Collection as an argument
        10. addAll(Collection)
            -TASK: it adds all the elements of given collection to the original collection
            -return
            -returns a boolean
            -non-static
            -takes one arg as a Collection
        11. addAll(index, Collection)
            -TASK: it adds all the elements of given collection to the original collection starting from specified index
            -return
            -returns a boolean
            -non-static
            -takes 2 args - an index and a Collection
        12. containsAll(Collection)
            -TASK: it checks if all the elements exist in the original collection
            -return
            -returns a boolean
            -non-static
            -takes a collection as an arg
        13. retainAll(Collection)
            -TASK: it retains (holds) the elements from the given collection in the original collection and removes the rest
            -return
            -returns a boolean
            -non-static
            -takes a collection as arg
        CRUD Operations:
        Create 	-> POST
        Retrive -> GET
        Update  -> PUT
        Delete  -> DELETE
        get() method
        set() method
        remove() method
                    List (Interface)
        ArrayList 	LinkedList 		Vector
        OPERATIONS:
        retrieve - get
        update - set
        delete - removing an element
        get size
     */
}
