import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Pen here.
 *
 * @author Morgan Rangel
 * @version 2/1/24
 */
public class Computer
{
    // instance variables - replace the example below with your own
    private int storage;
    ArrayList<Document> docs = new ArrayList<Document>();

    /**
     * Constructor for objects of class Pen
     */
    public Computer()
    {
        docs = new ArrayList<Document>();
        storage = 10;
    }
    /**
     * getStorage() returns the amount of document space availible
     * @return 10 - number of documents
     */
    public int getStorage()
    {
        if (docs.size() < storage)
        {
            return (storage - docs.size());
        }
        else 
        {
            return (storage - docs.size());
        }
    }
    /**
     * deleteDocument() removes document at a certain location from the ArrayList
     * @param  location the location of document you want to remove
     */
    public void deleteDocument(int location)
    {
        docs.remove(location);
    }
    /**
     * createDocument() makes a new document in the ArrayList
     * @param name for the document
     */
    public void createDocument(String name)
    {
        docs.add(new Document(name));
    }
    /**
     * listDocument() returns all the document names
     * @return list of document names
     */
    public String listDocument()
    {
        String list = "";
        for (int i = 0; i < docs.size(); i++)
        {
            list = list + docs.get(i).getName();
        }
        return list;
    }
    /**
     * lockDocument() locks a certian document
     * @param location the location of the document you want to lock
     */
    public void lockDocument(int location)
    {
        docs.get(location).lock();
    }
    /**
     * isLocked() returns the boolean lock status
     * @param  location the location of the document you want to check
     */
    public void isLocked(int location)
    {
        docs.get(location).getLockStatus();
    }
    /**
     * isLocked() returns the boolean lock status
     * @param  location the location of the document you want to check
     */
    public void type(int location, int amount)
    {
        docs.get(location).type(amount);
    }
    /**
     * sortDocumentsBySize
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String sortDocumentsBySize()
    {
        int max = 0;
        int min = 0;
        int mid = 0;
        for (int i = 1; i < docs.size(); i++)
        {
            if(docs.get(max).getSize() < docs.get(i).getSize())
            {
                max = i;
            }
        }
        for (int n = 0; n < docs.size(); n++)
        {
            if(n != max)
            {
                if(docs.get(min).getSize() > docs.get(n).getSize())
                {
                    min = n;
                }
            }
        }
        for (int m = 0; m < docs.size(); m++)
        {
            if (m != max && m != min)
            {
                mid = m;
            }
        }
        ArrayList<Document> sorteddocs = new ArrayList<Document>();
        sorteddocs.add(docs.get(min));
        sorteddocs.add(docs.get(mid));
        sorteddocs.add(docs.get(max));
        String sortedlist = "";
        for (int z = 0; z < docs.size(); z++)
        {
            sortedlist = sortedlist + sorteddocs.get(z).getName();
        }
        return sortedlist;
    }
}
