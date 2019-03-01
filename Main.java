public class Main
{
	public static void main(String[] args) {
		System.out.println("Distance : "+ distance(41.016382, 28.857305, 40.999801, 29.142824));
	}
	
	public static double distance(double latA, double lonA, double latB, double lonB)//from A to B
	{
	    int radius = 6371;//Dünyanın yarıçapı km
	    
	    double latDistance = Math.toRadians(latB - latA);
	    double lonDistance = Math.toRadians(lonB - lonA);
	    
	    double a = Math.sin(latDistance/2) * Math.sin(latDistance/2) + 
	               Math.cos(Math.toRadians(latA)) * Math.cos(Math.toRadians(latB)) *
	               Math.sin(lonDistance/2) * Math.sin(lonDistance/2);
	               
	   double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	   
	   return c * radius;//km
	}
}
