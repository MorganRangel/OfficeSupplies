
/**
 * Write a description of class Stapler here.
 *
 * @author Morgan Rangel
 * @version 2/1/24
 */
public class Stapler
{
    // instance variables - replace the example below with your own
    private int amount;

    /**
     * Constructor for objects of class Stapler
     */
    public Stapler()
    {
        this.amount = 100;
    }
    /**
     * getAmountStapler() returns amount 
     * @return  amount the amount of staplers left
     */
    public int getAmountStapler()
    {
        return amount;
    }
    /**
     * refillStapler() refills amount to 100
     */
    public void refillStapler()
    {
        amount = 100;
    }
    /**
     * useStapler() lets you staple
     * @param  num number of staples you want to use
     */
    public void useStapler(int num)
    {
        if (amount >= num)
        {
            for (int i = 0; i < num; i++)
            {
                amount = amount - 1;
            }
        }
        else
        {
            System.out.println("You don't have enough staples left!");
        }
    }
}
