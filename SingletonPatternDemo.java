public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonExample se= SingletonExample.INSTANCE;
        SingletonExample se1= SingletonExample.INSTANCE;
        se.balance();
        se1.balance();
    }

}

enum SingletonExample{
    
    INSTANCE;
  int size=11;
  public void balance(){
      System.out.println("hello"+this.hashCode());
  }  
}
