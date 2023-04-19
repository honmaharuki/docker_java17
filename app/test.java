import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Test{
    /**
     * @param args
     */
    public static void main(String args[]){
        System.out.println("process:START");
        try{
            List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
/* 
            System.out.println("process:1");
            integers.forEach(i -> {
                try {
                    System.out.println(50 / i);
                } catch (ArithmeticException e) {
                    System.err.println(
                      "Arithmetic Exception occured : " + e.getMessage());
                }
            });
*/
            System.out.println("process:2");
            integers.forEach(i -> System.out.println(50 / i));
        }catch(Exception e){
            System.out.println("Err");
        }

        System.out.println("process:3");
        List<String> names = Arrays.asList("aaa", "bbb");
        try {
            names.stream().forEach(name -> {
                throw new RuntimeException("error: " + name);
            });
        } catch (Exception e) {
            e.printStackTrace(); // 例外をthrowするメソッド
        }

        System.out.println("process:4");
        

        System.out.println("process:END");
    }

    static void method(String name) {
        throw new RuntimeException("error: " + name);
    }
   
}