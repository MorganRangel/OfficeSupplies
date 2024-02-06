
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OfficeSuppliesTester
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Office Supplies Tester!");
        
        System.out.println("TESTING OUT STAPLER");
        System.out.println("Getting amount of inital staples. Expected 100");
        Stapler stapler = new Stapler();
        System.out.println(stapler.getAmountStapler());
        System.out.println("Using 3 staplers. Expected left 97");
        stapler.useStapler(3);
        System.out.println(stapler.getAmountStapler());
        System.out.println("Refilling stapler. Expected 100");
        stapler.refillStapler();
        System.out.println(stapler.getAmountStapler());
        System.out.println();

        System.out.println("TESTING OUT DOCUMENT");
        Document doc = new Document("Doc1");
        System.out.println("Printing name. Expected Doc1.");
        System.out.println(doc.getName());
        System.out.println("Locking the document. Expected locked = true");
        doc.lock();
        System.out.println(doc.getLockStatus());
        System.out.println("Changing the name. Expected MorgansDoc");
        doc.changeName("MorgansDoc");
        System.out.println(doc.getName());
        System.out.println("Type in doc. Expected size 12");
        doc.type(12);
        System.out.println(doc.getSize());
        System.out.println();
        
        System.out.println("TESTING OUT COMPUTER");
        Computer mycomp = new Computer();
        System.out.println("Creating four new documents, doc1, doc2, doc3, doc4");
        mycomp.createDocument("doc1");
        mycomp.createDocument("doc2");
        mycomp.createDocument("doc3");
        mycomp.createDocument("doc4");
        mycomp.type(0,6);
        mycomp.type(1,7);
        mycomp.type(2,5);
        mycomp.type(3,1);
        System.out.println("Listing current documents.");
        System.out.println(mycomp.listDocument());
        System.out.println("Deleting doc3.");
        mycomp.deleteDocument(2);
        System.out.println("Listing current documents.");
        System.out.println(mycomp.listDocument());
        System.out.println("Getting storage. Expected 7.");
        System.out.println(mycomp.getStorage());
        System.out.println("Sorting documents by size (min --> max). Expected doc4, doc1, doc2");
        System.out.println(mycomp.sortDocumentsBySize());
    }
}
 