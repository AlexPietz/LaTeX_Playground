package Beobachter;
public class TeenGARL implements Observer
{
    private Subject meinStar;
    private static int nrC;
    private int nr;
    public TeenGARL(Subject s)
    {
        meinStar = s;
        s.addObserver(this);
        nrC++;
        nr = nrC;
    }
    
    public void update()
    {
        System.out.println("Fangirl "+nr+": 'JUSTIN BIEBER, I LUVVV YAAA!!!!!111111'");
        System.out.println("Fangirl "+nr+": 'let ma b ya bb'");
    }
}
