package String;

import java.util.*;

public class collegeRank3 {
    public static int solve(int n,int m,ArrayList<Integer> clg_list,ArrayList<ArrayList<String>> student) {
        ArrayList<Float> per = new ArrayList<>();
        for (int i=0;i<student.size();i++)
            per.add(Float.parseFloat(student.get(i).get(1)));
        Collections.sort(per);
        System.out.println(per);
        for (int i=0;i<student.size();i++){
            if (per.get(per.size()-1) == Float.parseFloat(student.get(i).get(1))){
                String clg = String.valueOf(student.get(i).get(1).charAt(2));
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> clg_arr = new ArrayList<>();
        for (int i=0;i<n;i++)
            clg_arr.add(sc.nextInt());
        ArrayList<ArrayList<String>> student = new ArrayList<>();
        for (int i=0;i<m;i++){
            ArrayList<String> stu_temp = new ArrayList<>();
            for (int j=0;j<5;j++)
                stu_temp.add(sc.next());
            student.add(stu_temp);
        }
        int res = solve(n,m,clg_arr,student);
//        for (int i=0;i<res.length;i++){
//            System.out.println(res[i][0]+" "+res[i][1]);
//        }
        System.out.println(res);
    }
}

