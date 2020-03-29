/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *@assignment 4b
 description: AStack data structure adapted from Clifford Shaffers Data Structures and Algorithim Analysis, Chapter 4.2.1
 */

 public class AStack<E> implements StackADT<E>{

    private static final int defaultSize = 10;

    private int maxSize;
    private int top;
    private E [] listArray;

    /**
     * Constructor with default size
     */
    AStack(){
        this(defaultSize);
    }

    /**
     * Constructor that takes a size parameter.
     * @param size the size of the stack to be created
     */
    @SuppressWarnings("unchecked")
    AStack(int size){
        maxSize = size;
        top = 0;
        listArray = (E[]) new Object[size];
    }

    /**
     * Method clears the stack
     */
    public void clear(){
        top = 0;
    }

    /**
     * Method pushes element onto the stack
     * @param element element to be pushed onto the stack
     */
    public void push(E element){
        assert top != maxSize : "Stack is full";
        listArray[top++] = element;
    }
 }