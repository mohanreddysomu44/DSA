class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false; // means you’d need to use a power twice
            n /= 3;
        }
        return true;
    }
}