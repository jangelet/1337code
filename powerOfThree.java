class Solution {
    
    //powers of 3: 1, 3, 9, 27, 81, 
    public boolean isPowerOfThree(int n) {
        // if(n <= 0 || (n != 1 && n%3 != 0)){
        //     return false;
        // } else if(n == 1){
        //     return true;
        // } else { //recursive case
        //     return isPowerOfThree(n/3);
        // }
        if(n!= 0 && (n^n-1)==1) return true;
        return false;
    }
}