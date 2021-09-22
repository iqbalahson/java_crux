package Lec12;


import java.util.*;
public class Book_Allocation_Problem {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int nob = sc.nextInt();
                int nos = sc.nextInt();
                int[] page = new int[nob];
                for (int i = 0; i < page.length; i++) {
                    page[i] = sc.nextInt();
                }
                System.out.println(bookallocation(page, nos));
            }

        }

        public static int bookallocation(int [ ] book, int nos  ){
            int low =0;
            int high = 0;
            for (int i = 0; i < book.length; i++) {
                high +=book[i];

            }
            int ans = 0;

            while (low<=high){
                int mid = (low+high)/2;
                if (Ispossible( book , nos , mid)){
                    high = mid  -1;
                    ans = mid;
                }
                else {
                    low  = mid + 1;
                }
            }
            return ans;
        }

        public static boolean Ispossible(int [ ] book , int nos ,int mid){
            int nu_student = 1;
            int nu_pages = 0;
            int i = 0;
            while (i<book.length) {
                if (nu_pages + book[i] <= mid) {
                    nu_pages += book[i];
                    i++;
                } else {
                    nu_student++;
                    nu_pages = 0;
                }
            }

            if (nu_student>nos){
                return false;
            }
            return true;
        }



}
