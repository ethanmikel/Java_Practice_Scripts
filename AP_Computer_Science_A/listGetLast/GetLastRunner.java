  import java.util.Arrays;

public class GetLastRunner {

    public static void main(String[] args) {
       ListGetLast lg = new ListGetLast();
       System.out.println(lg.go(Arrays.asList(-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5)));
       System.out.println(lg.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));

    }
}
