
public class countContinous1 {
    public static void main(String[] args)
    {
        int result=0, count=0;
        int[] ary = {1,0,1,1};

        for(int i=0;i<ary.length;i++)
        {
            if(ary[i] == 0)
            {
                count = 0;
            }
            else{
                count++;
                result = Math.max(result, count);
            }
        }

        System.out.println(result);
    }
}
