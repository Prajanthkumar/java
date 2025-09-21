class Solution 
{
    public int maxFrequencyElements(int[] nums)
    {
         HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) 
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        for (int freq : countMap.values()) 
        {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        int totalCount = 0;
        for (int freq : countMap.values()) 
        {
            if (freq == maxFrequency) 
            {
                totalCount += freq;
            }
        }
        
        return totalCount;
    }
}