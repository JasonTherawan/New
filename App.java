public class App {

    public int addition(int num1, int num2){
        return num1 + num2;
    }

    public App(){
        int number = addition(5, 10);
        System.out.println(number);
    }

    public static void main(String[] args) {
        
        App app = new App();

    }

}