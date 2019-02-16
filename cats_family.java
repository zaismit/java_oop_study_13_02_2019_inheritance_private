/**
 * Created by ZAISMIT - EVYNET
 **/
public class cats_family
{
    private int ears;
    private int legs;
    private boolean big_claws;

    public void setbig_claws(boolean big_claws)
    {
        this.big_claws = big_claws;
    }

    public cats_family()
    {
        ears = 2;
        legs = 4;
        big_claws = true;
    }

    public void show_info()
    {
        System.out.println( "qty ears: " + ears +
                            " qty legs: " + legs +
                            " big claws: " + big_claws);
    }

}
