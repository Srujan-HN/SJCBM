package NewT;
import java.util.*;
class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}
class Vote
{
    void cast(int age) throws AgeException
    {
        if(age<18)
        {
            throw new AgeException("not a valid age");
        }
        else
        {
            System.out.println("valid age");
        }
    }
}

class CustomeExceptions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        Vote t=new Vote();
       
        try
        {
            t.cast(age);
        }
        catch(AgeException e)
        {
            System.out.println("error "+e.getMessage());
        }
        finally
        {
            System.out.println("no matters what it executes");
        }
    }
}


