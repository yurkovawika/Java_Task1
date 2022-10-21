package Lesson_2;

public class FirstTask {
    public static void main(String[] args) {

    }
    class Solution {
        public double myPow(double x, int n) {
            if (x == 1.0){
                x = 1;
            }
            else if (x == -1.0){
                if (n > 0){
                    x = -1;
                }
                if (n < 0){
                    x = 1;
                }

            }
            else if ( n < 0 && n > -21474836){
                x = 1/myPow1(x,n*(-1),x);

            }
            else if ( n == 0){
                x = 1;
            }
            else if (n > 0 & n < 21474836){
                x = myPow1(x,n,x);
            }
            else if (n > 21474836){
                x = 0;
            }
            else if ( n < -214748364){
                x = 0;
            }

            return x;
        }
        public double myPow1(double x, int n,double y){
            if (n > 1){
                x = x*y;
                x = myPow1(x,n-1,y);
            }

            return x;
        }

    }

}
