class Solution {
    public int totalNumbers(int[] digits) {
        int[] availableCounts = new int[10];
        for (int d : digits) {
            availableCounts[d]++;
        }
        
        int distinctEvenCount = 0;
     
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;       
            int d2 = (num / 10) % 10; 
            int d3 = num % 10;        
            int[] neededCounts = new int[10];
            neededCounts[d1]++;
            neededCounts[d2]++;
            neededCounts[d3]++;
            
            if (availableCounts[d1] >= neededCounts[d1] &&
                availableCounts[d2] >= neededCounts[d2] &&
                availableCounts[d3] >= neededCounts[d3]) {
                distinctEvenCount++;
            }
        }
        
        return distinctEvenCount;

    }
}