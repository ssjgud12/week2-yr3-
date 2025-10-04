package ie.atu.week2;

import static org.apache.el.lang.ELArithmetic.*;

public class Calculator
{
private int x,y,z;
public String op;


public Calculator(int x , int y, int z)
{

    this.x = x;
    this.y = y;
    this.z = z;

    switch(op)
    {
        case "add":
            add(x,y);
            break;

        case "Subtract":
            subtract(x,y);
            break;

        case "Multiply":
            multiply(x,y);
            break;

        case "Divide":
            divide(x,y);
            break;
    }


}



    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getZ()
    {
        return z;
    }
}



