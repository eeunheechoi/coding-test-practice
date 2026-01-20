package arraystring;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumber = maxNumber(candies);

       // int[] appliedExtraCandies = appliedExtraCandies(candies, extraCandies);
        List<Boolean> results = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {

            int num = candies[i] + extraCandies;

            results.add(num>= maxNumber);

        }

        return results ;
    }


    public int maxNumber(int[] candies){
        int max = candies[0];
        for(int i=0; i< candies.length; i++){
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

}
