import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(2.4f);
        arrayList.add(6.7f);
        arrayList.add(7.6f);
        arrayList.add(3.2f);
        arrayList.add(5.3f);
        arrayList.add(8.9f);
        Iterator<Float> iterator = arrayList.iterator();
        float sum=0;
        while(iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("Sum of elements in a list is: "+sum);
    }
}