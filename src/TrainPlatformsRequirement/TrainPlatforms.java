package TrainPlatformsRequirement;
/*
 * Program to find the minimum number of platforms required so that no
 * train has to wait
 * */
import java.util.Arrays;

public class TrainPlatforms {
	
	
	// Returns minimum number of platforms required
	int findPlatform(int arrivalTimes[], int depatureTimes[], int n)
	{
	   // Sort arrival and departure arrays
	   Arrays.sort(arrivalTimes);
	   Arrays.sort(depatureTimes);
	 
	   // plat_needed indicates number of platforms needed at a time
	   int temp_platforms = 1, platforms_required = 1;
	   int i = 1, j = 0;
	 
	   // Similar to merge in merge sort to process all events in sorted order
	   while (i < n && j < n)
	   {
	      // If next event in sorted order is arrival, increment count of
	      // platforms needed
	      if (arrivalTimes[i] < depatureTimes[j])
	      {
	    	  temp_platforms++;
	          i++;
	          if (temp_platforms > platforms_required)  // Update platforms_required if needed
	              platforms_required = temp_platforms;
	      }
	      else // Else decrement count of platforms needed
	      {
	    	  temp_platforms--;
	          j++;
	      }
	   }
	 
	   return platforms_required;
	}

}
