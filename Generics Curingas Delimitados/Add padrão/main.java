import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        preencher(numberList);
        System.out.println(numberList);


    }
    public static void preencher(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
