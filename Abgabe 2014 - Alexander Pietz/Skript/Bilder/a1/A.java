public class A
{
    private B b;

    public void setB(B b)
    {
        if(b == null)
            delB();
        else
            this.b = b;
    }
    
    private void delB()
    {
        this.b = null;
    }
    
}
