import java.io.*;
import java.util.*;
import edu.princeton.cs.algs4.*;

public class TwoSum {
	public static void main(String[] args) throws IOException{
		int nums_size = Integer.parseInt(args[0]);
		int[] nums = new int[nums_size];
		String _fileName = args[1];
		File file = new File("").getCanonicalFile();
		String dir_parent = file.getParent();
		Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(dir_parent + "/algs4-data/" + _fileName)));
			for (int j = 0; j < nums_size; j++) {
                if (s.hasNextInt()){
					nums[j] = s.nextInt();
				}
            }
			s.close();
        } catch(Exception e) {
			StdOut.println("Exception: " + e); 
		}
		
		int res = count(nums);
		StdOut.printf("with Size: %d! " , nums_size);
		
	}
	public static int count(int[] nums){
		int len = nums.length;
		int cnt = 0;
		TimeWatcher tw = new TimeWatcher();	
		/*  try{
				Thread.sleep(2000);
		 } catch(Exception e){
			 ;
		 } */
		for(int i=0; i< len; i++) {
			for(int j=i+1; j<len; j++){
					if (nums[i]+ nums[j] ==0){
					StdOut.printf("%d + %d = %d\n", nums[i], nums[j],0);
					cnt+=1;
				}
				
			}
		}
		tw.eplasedTime();
		return cnt;
	}
}