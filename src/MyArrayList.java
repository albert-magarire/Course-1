import java.util.ArrayList;

public class MyArrayList {
    public static void main(String [] args){
        ArrayList<Integer> myList =  new ArrayList<>();
        myList.add(1);
        myList.add(345);
        myList.add(5);
        myList.add(1);
        myList.add(7);
        myList.add(1);

        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
