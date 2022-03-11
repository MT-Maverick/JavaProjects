import java.util.Scanner;

class main{
        public static void main(String args[]){
                pentagon_counter number= new pentagon_counter();
                int count=1;

        for(int i=1;i<=50;i++){
                System.out.printf("%-6d",number.counter(i));
                if(count%10==0)
                 System.out.println(" ");
                count++;
                }

        }
}

class pentagon_counter{

        public int counter(int x){
                return(x *(3* x-1))/2;
        }

}
