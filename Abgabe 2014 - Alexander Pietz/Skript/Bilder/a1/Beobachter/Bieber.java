package Beobachter;
import java.util.*;
public class Bieber implements Subject
{
    private boolean onDrugs;
    private ArrayList<Observer> beobachterListe;
    public Bieber()
    {
        beobachterListe = new ArrayList<Observer>();
    }

    public void addObserver(Observer o)
    {
        beobachterListe.add(o);
    }
    
    public boolean removeObserver(Observer o)
    {
        return beobachterListe.remove(o);
    }
    
    public void notifyAllObservers()
    {
        for(int i = 0; i < beobachterListe.size(); i++)
            beobachterListe.get(i).update();
    }
    
    public boolean getZustand()
    {
        return onDrugs;
    }
    
    public void setZustand(boolean drugs)
    {
        if(onDrugs != drugs) {
            onDrugs = drugs;
            notifyAllObservers();
        }
    }
}
