

public class StringOperation {
    public static void main(String[] args) {
        String data="  Hello I like java 11\u2005";
        System.out.println("String length:"+data.length());

        //Trim not work on unicode but strip method will do
        System.out.println("String length:"+data.trim().length()); 
        System.out.println("String length:"+data.strip().length());

        //isBlank
        System.out.println("Is string blank: "+data.isBlank());

        data="hi \n this is paragraph \n 1: java11 \n 2. java8";
        System.out.println(data);
        // Print length of each line
        data.lines().map(String:: length).forEach(System.out:: println);

    }
}
