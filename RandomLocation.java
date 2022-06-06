import java.util.*;

public class RandomLocation
{
    public static void main(String[] args)
    {
        
        ArrayList<String> locations = new ArrayList<String>();
        
        locations.add("NJ");
        locations.add("NY");
        locations.add("FL");
        locations.add("AK");
        locations.add("AZ");
        locations.add("AR");
        locations.add("AS");
        locations.add("CA");
        locations.add("CO");
        locations.add("CT");
        locations.add("DE");
        locations.add("DC");
        locations.add("GA");
        locations.add("GU");
        locations.add("HI");
        
        
        
        Random rand = new Random();
        System.out.print(locations.get(rand.nextInt(locations.size())));
        
    }
}
