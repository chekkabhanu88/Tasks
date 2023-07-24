package assignment;

import java.util.ArrayList;

public class airport 
{
    Address address;
    flight[] f;
    String[] a;
    
    int index=0;
    
    ArrayList<flight> fl= new ArrayList<flight>();
    
    ArrayList<traveller> tl=new ArrayList<traveller>();
    
    
    public boolean addflight(flight f2)
    {
    	  f[index++]=f2; 
    	 boolean flag=true;
    	  if(flag==true)
    		  return true;
    	  else
    		  return false;
    }
    public  void  searchflight(String source,String destination)
    {
    	for(flight e:f)
    	{
    		if  ( e.getSource().equals(source) && e.getDestination().equals(destination))
    		{
    		     fl.add(e);		
    		}
    		
    	}
 
    }
    public void bookticket(String flightid,traveller t)
    {
       for(flight e:f)
       {
    	   if(e.getFlightid()==flightid)
    	   {
    		   if(e.getAvailableseats()>0)
    		   {
    			   tl.add(t);
    			   
    		   }
    	   }
    	   e.setAvailableseats(e.getAvailableseats()-1);
       }
       
    }
    
    
    
    
    
    
	
}
