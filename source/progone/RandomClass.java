package progone;
import java.util.Random;
public class RandomClass{
	public static long seed;
	public static Random random;
	public static	double  a[]={5,6,7,8,9};
	static {
		seed=System.currentTimeMillis();
		random=new Random(seed);
	}
	public static void setSeed(long s) {
		seed=s;
		random=new Random(seed);
	}
	public static double uniform() {
        	return random.nextDouble();
    	}

	public static long getSeed() {
		return seed;
	}
	public static int uniform(int n) {
		return random.nextInt(n);
	}
	public static double uniform(double l,double h) {
		return l+uniform()*(h-l);
	}
	public static boolean bernoulli(int p) {
				
		return uniform()<p;
		
	}
 	public static double gaussian() {
        
        	double r, x, y;
        	do {
          	  	x = uniform(-1.0, 1.0);
            		y = uniform(-1.0, 1.0);
           		r = x*x + y*y;
       		 } while (r >= 1 || r == 0);
       		 return x * Math.sqrt(-2 * Math.log(r) / r);

        
   	 }
 	public static double gaussian(double mu, double sigma) {
       		 return mu + sigma * gaussian();
    	}
	public static void shuffle(double[] d) {
			int n=d.length;
			for(int i=0;i<n;i++) {
				 int r = i + uniform(n-i);
					double temp=a[i];
					a[i]=a[r];
					a[r]=temp;
			}
	
		
	}

	

	public static void main(String[] args) {
		setSeed(10);
	
		System.out.println("uniform:"+uniform(5));
		System.out.println("uniform:"+uniform(5,7));
		System.out.println("berno:"+bernoulli(0));
		System.out.println("GASS:"+gaussian(5,6));
		shuffle(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
