public class Chicken
{
   private int speed;
   private String name;
   public Chicken()
   {
       speed = 0;
       name = "";
   }
   public Chicken (int speed, String name)
   {
       this.speed = speed;
       this.name = name;
   }
   public boolean isFast(int speed)
   {
       if(speed > 50)
       {
           return true;
       }
       return false;
   }
}
public void run() {
	Chicken a = new Chicken( 75, "foghorn" );
	System.out.println( a.isFast() );
	Chicken b = new Chicken( 25, "slow" );
	System.out.println( b.isFast() );
	Chicken c = new Chicken( -77, "really slow" );
	System.out.println( c.isFast() );
	Chicken d = new Chicken( 212, "speedy" );
	System.out.println( d.isFast() );
}