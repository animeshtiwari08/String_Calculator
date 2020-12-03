public class StringCalculator {

    public int add(String numbers)
    {
        if(numbers.isEmpty()) {
            return 0;
        }
        int sum=0;
        String number[]=numbers.split("[,|\n]");
        for (String data: number) {
            sum+=Integer.parseInt(data);
            System.out.println(data);
        }
        return sum;
    }

    public static void main(String[] args) {
        StringCalculator calculator=new StringCalculator();
        System.out.println(calculator.add("1\n2,3"));
    }

}
