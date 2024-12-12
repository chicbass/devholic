package exapp;

public class hello
{
    String greet;
   
    public hello(String greet)
    {
        this.greet=greet;
    }
 
    public String getName() {
        return greet;
    }
 
    public void setName(String greet) {
        this.greet = greet;
    }
}