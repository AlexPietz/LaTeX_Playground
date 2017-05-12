package Beobachter;
public class Hater implements Observer
{
    private Subject meinHassobjekt;
    public Hater(Subject s)
    {
        meinHassobjekt = s;
        s.addObserver(this);
    }

    public void update()
    {
        if(meinHassobjekt.getZustand()) {
            System.out.println("Anonymous: 'LoL, BIEBER IS ON DRUGS, #TAKEDRUGS4BIEBER'");
        } else {
            System.out.println("Anonymous: 'BIEBER IS SUCH A FAGGOT, HE DOESN'T EVEN SMOKE POT xDDDDDdddd'");
        }
    }
}
