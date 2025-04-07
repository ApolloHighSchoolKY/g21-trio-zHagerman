//Write your answer here
public class Trio implements menuItems
{
    String mySandwich = "";
    String mySalad = "";
    String myDrink = "";
    double total;
    public Trio(String sandwich,String salad,String drink)
    {
        mySandwich = sandwich;
        mySalad = salad;
        myDrink = drink;
    }
    public double getPrice(double y)
    {
        if(x == mySandwich)
            x = sandwich;
        else if(x == mySalad)
            x = salad
        else
            x = drink;
        return y;
    }
    public String getName(String x)
    {
        
        x = sandwich;
    else if(x == mySalad)
        x = salad
    else
        x = drink;
    return x;
    }
    public String toString()
    {
        return "" + mySandwich.getName() + "/" + mySalad.getName() + "/" + myDrink.getName() + " trio " + "and a price of " total;
    }
}