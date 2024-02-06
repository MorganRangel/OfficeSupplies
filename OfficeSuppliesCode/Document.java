
/**
 * Write a description of class Document here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Document
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean locked;
    private int size;

    /**
     * Constructor for objects of class Document
     */
    public Document(String name)
    {
        this.name = name;
        locked = false;
    }
    /**
     * lock() locks the document
     */
    public void lock()
    {
        locked = true;
    }
    /**
     * getLockStatus() returns boolean variable locked
     * @return locked if doc is locked
     */
    public boolean getLockStatus()
    {
        return locked;
    }
    /**
     * getName() returns name
     * @return  name of the document
     */
    public String getName()
    {
        return name;
    }
    /**
     * changeName() changes the documents name
     * @param  newName what you want the new name to be
     */
    public void changeName(String newName)
    {
        name = newName;
    }
    /**
     * type() increases the size of the document
     * @param int amount the amount you want to type
     */
    public void type(int amount)
    {
        size = size + amount;
    }
    /**
     * getSize() returns size of the document
     */
    public int getSize()
    {
        return size;
    }
}
