public class Main {
    public static void main(String[] args){

        //declarare - metoda 1
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 7;
        numbers[4] = 6;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;

        //declarare - metoda 2
        int[] numbers2 = new int[] {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};

        //declarare - metoda 3
        int[] numbers3 = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};


//        for (int i=0; i<numbers.length; i=i+2 ){
//            System.out.println(numbers[i]+numbers[i+1]);
//            }

        int x=numbers.length;
        for (int i=0; i< numbers.length/2; i++) {
            System.out.println(numbers[i]+numbers[x-i-1]);
        }
        }
    }
