public class PP_7{
    public static void main(String [] args)
    {
        for (int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if (i==1||j==1||i==7||j==7||i+j==8||i==j)
                {
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}