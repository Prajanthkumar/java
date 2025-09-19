class Solution {
    public int[] evenOddBit(int n) 
    {
        int odd=0;
        int eve=0;
        int[] arr=new int[2];
        String s=Integer.toBinaryString(n);
        int c=s.length();
          for(int i=0;i<c;i++)
          {
            if(s.charAt(i)=='1')
            {
                int a=s.length()-1-i;
                if(a%2==0)
                {
                    eve++;
                }
                else
                {
                    odd++;
                }
            }
          }
          arr[0]=eve;
          arr[1]=odd;
          return arr;
    }
}