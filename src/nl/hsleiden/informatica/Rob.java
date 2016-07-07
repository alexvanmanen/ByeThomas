package nl.hsleiden.informatica;



import java.util.Date;

public class Rob implements Colleague
{
    
    public String getMyPersonalEmail()
    {
        return ("schub8@hotmail.com");
    }
    
    public Date getMyBirthDate()
    {
        return new Date (1954, 9, 7); // eigenlijk deprecated ;-) 
    }
    public String getFarewellMessage()
    {
        return ("Een het-ga-je-meer-dan-goed aan mijn oud student,collega en baasje ");
        
    }
    public String getWishForTheFuture()
    {
        return ("Op weg naar de 12, maar bovenal geluk met vrouw en kids");
    }
    
}