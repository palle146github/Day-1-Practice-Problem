public class Dargumentvaluessum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, count=0, sum=0;
        for(int i=0;i<args.length;i++)
        {

            n=Integer.parseInt(args[i]);
            sum = sum+n;
        }
        System.out.println("Sum of only valid integers is ==> "+sum) ;
    }
}
