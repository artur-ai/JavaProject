import java.lang.reflect.Array;

public class Main {
    public static void main( String[] args) {
        // 1.  приймає масив чарів, виводить його на екран
        char[] array = {'a', '#', '!'};
        CharArray(array);




        //2. приймає масив інтів, повертає масив чарів, кожен символ у позиції масиву
        // відповідає коду символу передається інта
        int [] array1 = {65, 66, 67, 68, 69};
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


        // 5. приминає 5 інтів, повертає більше їх
        int f = 543253425;
        int g = 543565467;
        int h = 543665466;
        int j = 543569085;
        int k = 543565490;

        int maxVal = f;
        if (g>maxVal) {
            maxVal = g;
        }
        if (h>maxVal) {
            maxVal = h;
        }
        if (j>maxVal) {
            maxVal = j;
        }
        if (k>maxVal) {
            maxVal = k;
        }
        System.out.println("Найбільше з цих цифр: " +maxVal);


        // 6. приймає масив чарів, повертає рядок що складається із символів масиву
        char [] CharArray1 = {'!', '@', '#', '$', '%', '^', '&', '*', '~'};
        String result = charToString(CharArray1);
        System.out.println(result);


         /* 8. приймає масив інтів, і значення типу інт, повертає індекс масиву в якому значення збігається
         з переданим, починаючи з початку масиву. Якщо значення масиву немає повертає -1 */
        array1 = new int[]{65, 66, 68, 45};
        int value = 68;
        int index = indexOf(array1, value);
        System.out.println("Index: " +index);



        /* 9. приймає масив інтів, і значення типу інт, повертає індекс масиву в якому значення
        збігається з переданим, починаючи з кінця масиву. Якщо значення масиву немає повертає -1*/
       /* array1 = new int[]{65, 66, 68, 45};
        value = 68;
        index = indexOfEnd(array1, value);
        System.out.println("Index: " +index);*/
        int[] array2 = {34, 54, 43, 68, 98, 108};
        int value1 = 108;
        int index1 = indexOfEnd(array2, value1);
        System.out.println("Index: " +index1);


        // 10. метод приймає інт, і повертає факторіал від заданого інта




















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


    //5. приминає 5 інтів, повертає більше їх
    public static int maxValue (int f, int g, int h, int j, int k) {
        return maxValue(f, g, h, j, k);
    }

    // 6. приймає масив чарів, повертає рядок що складається із символів масиву
    public static String charToString (char[] chars) {
        return new String(chars);

    }



    /* 8. приймає масив інтів, і значення типу інт, повертає індекс масиву в якому значення збігається
         з переданим, починаючи з початку масиву. Якщо значення масиву немає повертає -1 */

    public static int indexOf (int [] array1, int value) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == value) {
                return i;
            }
        }
        return -1;
    }


     /* 9. приймає масив інтів, і значення типу інт, повертає індекс масиву в якому значення
        збігається з переданим, починаючи з кінця масиву. Якщо значення масиву немає повертає -1*/
    public static int indexOfEnd (int[] array2, int value1){
        for (int i = array2.length - 1; i >= 0; i--){
            if (array2[i] == value1){
                return i;
            }

        }
        return -1;
    }


    // 10. метод приймає інт, і повертає факторіал від заданого інта
    public static int












}


