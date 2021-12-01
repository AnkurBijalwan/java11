public class FactoryPatternDemo {
    public static void main(String[] args) {
        Sample sample= Sample.createSampleInstance();
        System.out.println(sample instanceof Sample);
    }
}


class Sample{
    private Sample(){

    }

    // static factory method
    public static Sample createSampleInstance(){
        return new Sample();
    }
}