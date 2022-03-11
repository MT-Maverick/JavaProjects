import java.util.Scanner;

class main{

        public static void main(String args[]){
        classb Amount = new classb();
        Amount.get_future_investment_value();
        }
}


class classb{
        protected double investment_amt;
        protected double monthly_rate;
        protected int years;

        classb(){
        this.investment_amt =28000;
        this.monthly_rate =1.07;
        this.years =0;
        }

        public void get_future_investment_value(){
                double Amount =0.0;
                for(int years=this.years;years<=6;years++){
                        double rate = Math.pow(monthly_rate,years);
                        Amount = investment_amt* rate;
                        System.out.println("Total return for year "+years+" :"+Amount);

                }
        }

}
