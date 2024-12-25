public class Main {
    public static void main( String[] args) {
        // 1.  приймає масив чарів, виводить його на екран
        char[] array = {'a', '#', '!'};
        CharArray(array);



        //2. приймає масив інтів, повертає масив чарів, кожен символ у позиції масиву
        // відповідає коду символу передається інта
        int [] array1 = {1, 5, 6, 10};
        char[] charArray = ToCharArray(array1);
        for (char symbol : charArray) {
            System.out.println(symbol);
        }



        //3. приминає 2 інта, а і б, повертає більше їх цих 2х чисел
        int a = 4;
        int b = 8;
        int max = a;
        if (b>max) {
            max = b;
        }
        System.out.println("Максимальне значення: " + max);


        //4. приймає 3 інти, повертає більшу з них
        int c = 218312;
        int d = 321321;
        int e = 42389;
        int Max = c;
        if (d>Max) {
            Max= d;
        }
        if (e>Max) {
            Max = e;
        }
        System.out.println("Більше з цих цифр: " + Max);






    }


    // 1. приймає масив чарів, виводить його на екран
    public static void CharArray (char[] array) {
        System.out.println(array);

    }


    /* 2.приймає масив інтів, повертає масив чарів, кожен символ у позиції масиву
    відповідає коду символу передається інта
    */

    public static char[] ToCharArray (int[] array1){
        System.out.println("Hello");
        char[] charArray = {'b'};
        return charArray;
    }


    //3. приминає 2 інта, а і б, повертає більше їх цих 2х чисел
    public static int maxValue (int a, int b) {
        return maxValue(a, b);
    }


    //4.приймає 3 інти, повертає більшу з них
    public static int maxValue (int c, int e, int d){
        return maxValue(c, d, e);

    }

    }


