import java.util.Scanner;

class Polynomial {
    int degree[] = new int[200];
	public void setCoefficient(int degree, int coeff){
		this.degree[degree] = coeff;
	}
	public void print(){
		for(int i=0;i<this.degree.length;i++){
            if(this.degree[i]!=0){
                System.out.printf("%dx%d ",this.degree[i],i);
            }
        }
	}
	public Polynomial add(Polynomial p){
        for(int i=0;i<p.degree.length;i++){
            this.degree[i]+=p.degree[i];
        }
        return this;
	}
	public Polynomial subtract(Polynomial p){
			for(int i=0;i<p.degree.length;i++){
            this.degree[i]-=p.degree[i];
        }
        return this;
	}
	public Polynomial multiply(Polynomial p){
        int x[]=new int[200];
        for(int i=0;i<200;i++)
        {
            for(int j=0;j<200;j++)
            {
                    int deg=(i) + (j);
                if(deg<200)
                {
                    x[deg]+=this.degree[i]*p.degree[j];
                }
            }
        }
        for(int i=0;i<200;i++){
            this.degree[i]=x[i];
        }
        return this;
	}
}
public class Polynomial_Class{
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}

}