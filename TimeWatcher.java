//package java.util;
  
public class TimeWatcher {
	public TimeWatcher(){
		
	}
   static long _start = System.currentTimeMillis( );
   
   public double eplasedTime(){
		 long $end = System.currentTimeMillis( );
         double diff = ($end - _start) / 1000.0;
         System.out.println("Eplased Time : " + diff); 
		 return diff;
	  }
}