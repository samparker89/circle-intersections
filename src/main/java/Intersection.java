public class Intersection {

    public int calculate(int[] intArr){

        int totalIntersects = 0;

        for(int i = 0; i < intArr.length; i++){
            int leftElement = intArr[i]; //0
            for(int j = i + 1; j < intArr.length; j++){
                int rightElement = intArr[j]; //0
                int leftRadius = i + leftElement; //0 + 0 == 0
                int rightRadius = j - rightElement; // 1 - 0 == -1
                if(leftRadius >= rightRadius){
                    totalIntersects++;
                }
            }
        }

        return totalIntersects;
    }
}