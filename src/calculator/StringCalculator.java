package calculator;

public class StringCalculator {

    public int add(String numbers) throws NegativeException
    {
        if(numbers.isEmpty()) {
            return 0;
        }
        int sum=0;
        String delimeter=",";
        if(numbers.startsWith("//")) {
            delimeter = numbers.charAt(2) + "";
            System.out.println(delimeter);
            numbers=numbers.substring(5);
        }
        String number[]=numbers.split("["+delimeter+"|\n]");
        for (String data: number) {
        	
        	int num=Integer.parseInt(data);
        	
        	if(num<0)
        	{
        		throw new NegativeException("negatives not allowed "+num);
        	}
        	else {
            sum+=num;
        	}
            //System.out.println(data);
        }
        return sum;
    }

    public static void main(String[] args) {
        StringCalculator calculator=new StringCalculator();
        //System.out.println(calculator.add("1\n2,3"));
        //System.out.println(calculator.add("//;\\n1;2"));
    }

}
