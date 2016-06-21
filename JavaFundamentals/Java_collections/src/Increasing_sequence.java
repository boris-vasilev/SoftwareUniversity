import java.util.*;

/**
 * Created by boris on 6/18/2016.
 */
public class Increasing_sequence {
    public static void main(String[] args) {
        ArrayList<Integer> intArr= new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Insert size of array: ");
        int n = s.nextInt();
        System.out.print("Insert numbers: ");
        for (int i = 0; i < n; i++) {
            intArr.add(s.nextInt());
        }
        LinkedHashMap<Integer,Integer> seqList=new LinkedHashMap<>();
        for(int i =1; i<intArr.size();i++){
            int k = i;
            if(intArr.get(i)>intArr.get(i-1)){
                int seqLen = 2;
                seqList.put(i-1,seqLen);
                while(intArr.get(k)>intArr.get(k-1)){
                    seqList.replace(i-1,seqLen);
                    seqLen++;
                    if(k<intArr.size()-1){
                    k++;}else{break;}
                }
                i=k;
            }
        }
    }
}