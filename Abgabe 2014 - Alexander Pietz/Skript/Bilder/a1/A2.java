public class A2
{
    private B2[] b;
    
    public A2()
    {
        b = new B2[5];
    }
    
    public void setB2(int index, B2 b)
    {
        if(0 <= index && index <= 5)
            this.b[index] = b;
    }
}
