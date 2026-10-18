
public class TwoArray
{
    public static void main(String[]args)
    {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums2 = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
        double[][] nums3 = randomize(3,3);
        System.out.println(sumAll(nums));
        System.out.println(sumAll(nums2));
        System.out.println(sumAll(zeroNegs(nums2)));
        System.out.println(biggerThanTwo(nums));
        System.out.println(convertToArray(nums3));
        System.out.println(getRow(nums,1));
        System.out.println(getCol(nums,1));
    }
    public static int[][] zeroNegs(int[][] a)
    {
        int rownum=0;
        for(int[] row:a)
        {
            for(int i=0;i<row.length;i++)
            {
                if(row[i] < 0 )
                {
                    a[rownum][i] = 0;
                }
            }
            rownum ++;
        }
        return a;
    }
    public static int sumAll(int[][] a)
    {
        int sum = 0;
        for(int[] row:a)
        {
            for(int i=0;i<row.length;i++)
            {
                sum += row[i];
            }
        }
        return sum;
    }
    public static double[][] randomize(int r, int c)
    {
        double [][] random= new double[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                random[i][j] = (1+4*Math.random());
            }
        }
        return random;
    }
    public static boolean[][] biggerThanTwo(int[][] a)
    {
        boolean[][] BIGGER = new boolean[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j] > 2)
                {
                    BIGGER[i][j] = true;
                }
            }
        }
        return BIGGER;
    }
    public static double[] convertToArray(double[][] bigboy)
    {
        double[] smallboy = new double[bigboy.length * bigboy[0].length];
        int totallength = 0;
        for(double[] a:bigboy)
        {
            for(int i=0;i<a.length;i++)
            {
                smallboy[totallength] = a[i];
                totallength++;
            }
        }
        return smallboy;
    }
    public static int[] getRow(int[][] nums, int row)
    {
        int[] subnums = new int[nums[0].length];
         for(int i=0;i<nums.length;i++)
         {
             if(i == row)
             {
                 for(int j=0;j<nums[0].length;j++)
                 {
                     subnums[j] = nums[i][j];
                 }
             }
         }
         return subnums;
    }
    public static int[] getCol(int[][] nums, int col)
    {
        int[] subcol = new int[nums.length];
        int spot = 0;
        for(int[] a:nums)
        {
            for(int i=0;i<a.length;i++)
            {
                if( i== col)
                {
                    subcol[spot] = a[i];
                    spot++;
                }
            }
        }
        return subcol;
    }

}