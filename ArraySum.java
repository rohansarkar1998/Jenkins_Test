package HackerrankPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;

public class ArraySum {
    public static void main(String[] args) {
        int m=3;
        List<Integer> li = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        List<Long> res = new ArrayList<>();
        li.add(4);
        li.add(2);
        int i,j;
        for(i=0;i<3;i++)
        {
            ans.add(i+1);
        }
        for(i=0;i<li.size();i++)
        {
            long sum=0;
            if(!(ans.contains(li.get(i))))
            {
                ans.remove(ans.get(ans.size()-1));
                ans.add(li.get(i));
            }
            else
            {
                Collections.swap(ans,0,ans.size()-1);
            }

            for(j=0;j<ans.size();j++)
            {
                sum=sum+ans.get(j);
            }
            res.add(sum);
        }
        System.out.println(res);

    }
}
