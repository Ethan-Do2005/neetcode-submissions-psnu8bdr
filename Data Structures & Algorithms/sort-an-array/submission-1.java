class Solution {
    public int[] sortArray(int[] nums) {

        if(nums.length < 2){
            return nums;
        }

        int midIndex = nums.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[nums.length - midIndex];

        for(int i=0; i < midIndex; i++){
            leftHalf[i] = nums[i];
        }
        for(int j = midIndex; j < nums.length; j++){
            rightHalf[j - midIndex] = nums[j];
        }

        sortArray(leftHalf);
        sortArray(rightHalf);

        //merge
        merge(nums, leftHalf, rightHalf);
        return nums;
    }

    public void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j=0, k=0;

        while( i < leftSize && j < rightSize){
            if(leftHalf[i] < rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while ( i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        
        while ( j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    
    }
}
/*

[10,1,9,3]
[10,1] , [9,3]
[10] , [1] , [9], [3]
class sortArray
{
if(nums.length<2) return;
int midIndex = nums.length / 2;
int[] leftHalf = new int[midIndex];
int[] rightHalf = new int[nums.length - midIndex];

for(int i = 0; i< midIndex; i++){
    leftHalf[i] = nums[i];
}
for (int j = midIndex; j < nums.length;j++){
    rightHalf[j - midIndex] = nums[j];
}

sortArray(leftHalf);
sortArray(rightHalf);

}

class Merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
    int leftSize = leftHalf.length();
    int rightSize = rightHalf.length();

    int i=0,j=0,k=0;
    while( i < leftSize && j < rightSize){
        if(leftHalf[i] < rightHalf[j]){
            inputArray[k] = leftHalf[i];
            i++
        }
        else {
            inputArray[k] = rightHalf[j];
        }
        k++
    }

    while ( i < leftSize ){
        inputArray[k] = leftHalf[i];
        i++
        k++
    }

    while (j < rightSize){
        inputArray[k] = rightHalf[j];
        j++
        k++
    }

}


*/