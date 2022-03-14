package String;

import java.util.*;
public class MLAHELP {
    public static int time_coast_fun(int m1, int m2,List<Integer> first_group,List<Integer> second_group) {
        int coast1 = 0,coast2 = 0;
        for (int a:first_group)
            coast1 += a*m1;
        for (int a:second_group)
            coast2 += a*m2;
        if (coast1>coast2)
            return coast2+(coast1-coast2);
        if (coast2>coast1)
            return coast1+(coast2-coast1);
        else return coast1;
    }
    public static void findSubsets(ArrayList<ArrayList<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
        if (index == nums.size()) {
            subset.add(output);
            return;
        }
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);

        output.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        ArrayList<Integer> final_one = new ArrayList<>();
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();

        ArrayList<Integer> input = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
            input.add(sc.nextInt());

        findSubsets(subset, input, new ArrayList<>(), 0);
        for (int i=0;i<subset.size();i++){
            ArrayList<Integer> second_lis = new ArrayList<>();
            for (int j=0;j<input.size();j++) {
                if (!subset.get(i).contains(input.get(j)))
                    second_lis.add(input.get(j));
            }
            int time_coast = time_coast_fun(m1,m2,second_lis,subset.get(i));
            if (min>time_coast){
                final_one = second_lis;
                final_one.addAll(subset.get(i));
                min = time_coast;
            }
        }
        for (int a:final_one)
            System.out.println(a);
    }
}
