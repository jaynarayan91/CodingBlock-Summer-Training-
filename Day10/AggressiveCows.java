package Day10;

import java.util.*;

public class AggressiveCows {
    
    public static int cowsDistance(int[] stable, int cows){
        int ans = -1;
        int i = 1;
        int j = stable[stable.length-1] - 1;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(check(stable,mid,cows)){
                ans = mid;
                i = mid + 1;
            }else{
                j = mid - 1;
            }
            }
        return ans;
        }

        public static boolean check(int[] stable, int cows, int dist){
            int count = 1;
            int last = stable[0];
            for(int i=1;i<stable.length;i++){
                if(stable[i]-last>=dist){
                    count++;
                    last = stable[i];
                }
                if (count>=cows) {
                    return true;
                }
            }
                return false;
        }

        public static void main(String[] args) {
            int[] stable = {1,5,8,10,12,15};
            Arrays.sort(stable);
            System.out.println(cowsDistance(stable,4));
        }
}

