public class App {
    
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public App() {

        int num = multiplication(7, 7);
        System.out.println(num);

    }

    public static void main(String[] args) {
        
        App app = new App();
        
    }

}