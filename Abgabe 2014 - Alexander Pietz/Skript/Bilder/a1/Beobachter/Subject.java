package Beobachter;
import java.util.*;
public interface Subject
{
    public void addObserver(Observer o);
    public boolean removeObserver(Observer o);
    public void notifyAllObservers();
    public boolean getZustand();
}
