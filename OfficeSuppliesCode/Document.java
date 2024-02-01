
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
}
