import java.util.HashMap;

public class OnlyDsaHashMap_5 {

    // /* Question 3 ---> Count the frequency of each element */
    static HashMap<Integer,Integer> frequency(int [] arr){
        if(arr.length <= 0){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
    }

    // /* Question 2 ---> Two Sum */
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    // /* Question 1 ---> Check Whether array contains duplicate */
    static boolean isDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (!map.containsKey(arr[i])) {
                count++;
                map.put(arr[i], count);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // /* Question 1 ---> Check Whether array contains duplicate */
        // int [] arr={2,5,4,6,3,1};
        // boolean result = isDuplicate(arr);
        // if(result){
        // System.out.println("Duplicate : "+result);
        // }
        // else{
        // System.out.println("Duplicate : "+result);
        // }

        // /* Question 2 ---> Two Sum */
        // int[] arr = { 2, 5, 9, 11, 16 };
        // int target = 16;
        // int[] result = twoSum(arr, target);
        // for (int x : result) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();

        // /* Question 3 ---> Count the frequency of each element */
        // int [] arr = {1,2,3,2,4,4,4,8,9,3,1,3,8};
        // HashMap<Integer,Integer> map = frequency(arr);
        // System.out.println(map);

    }
}
