package question_No1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> lis = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            lis.add(scan.nextInt());
        }

        /*
        for(Integer num : lis){
            System.out.println(num);
        }
        */

        int sum = 0;
        for (int k =0; k < lis.size(); k++){
            sum = sum + lis.get(k);
        }

        int ave = sum / lis.size();

        Integer maxi =  Collections.max(lis);

        Integer mini = Collections.min(lis);

        System.out.print(sum);
        System.out.print(" " + ave);
        System.out.print(" " + maxi);
        System.out.print(" " + mini);


    }
}
