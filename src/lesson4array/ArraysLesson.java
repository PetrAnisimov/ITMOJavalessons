package lesson4_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLesson {
    public static void main(String[] args) {
        // примитивные типы данных
        int a = 78; //[100]a
        int b = a; //[78] b
        a = 100;

        //ссылочные типы данных
        Scanner scanner = new Scanner(System.in); // in [Scanner] Scanner
        Scanner in = scanner; // переменная ссылается на одну область памяти

        //МАСИВЫ (ССЫЛОЧНЫЙ ТИП ДАННЫХ)
        // int ints2[] =// так тоже можно
        //  по умолчанию int массив наполняется 0ами
        // для boolean это false

        int[] ints1 = new int[7]; // создали массив на семь элементов
        //System.out.println(ints1); ВОТ ТАК МАССИВ НЕ ВЫВЕСТИ
        System.out.println(Arrays.toString(ints1)); //Метод toString собиает значения массива переводит их в строчку и возвращает

        int[] ints2 = {6, -12, 343, 34, 2, 6, 34}; //создание массива со своими значениями lkb
        System.out.println(Arrays.toString(ints2));

        ints2 = new int[3]; // мы присвоили массиву ints2 новый массив из трех элементов (они будут нули)
        // для присвоения новые данные в массив  нужно сделать
        ints2 = new int[]{32, 424, 4}; //теперь в массив мы перезаписали данные
        System.out.println(Arrays.toString(ints2));


        int len = 10;
        int[] ints3 = new int[len]; //создали массив на 10 эллементов
        int[] ints4 = new int[len + 5]; //создали массив на 15 элементов
        System.out.println(Arrays.toString(ints4));

        //как узнать длинну массива
        System.out.println(ints4.length);

        //доступ к элементам массива
        System.out.println(ints4[3]);
        ints4[2] = 56; //обратились к массиву inst4 в нем к эллементу с индексом 2 и присвоили ему значение 56
        System.out.println(Arrays.toString(ints4));

        //ArrayIndexOutOfBoundsException
        //System.out.println(ints4[100]);

        //МНОГОМЕРНЫЙ МАССИВ
        // [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]
        int[][] ints5 = new int[3][4]; //первые скобки после new это длинна внешнего массива, вторые скобки длинна вложенных массивов
        System.out.println(Arrays.deepToString(ints5));
        // [ [0,0], [0,0,0], [0,0,0,0] ]
        int[][] ints6 = new int[3][];
        System.out.println(Arrays.deepToString(ints6)); //пустые массивы вернуть null
        ints6[0] = new int[2]; //[[0,0][null, null],[null]]
        ints6[1] = new int[3]; //[[0,0],[0,0,0],[null]]
        ints6[2] = new int[4]; //[[0,0],[0,0,0],[0,0,0,0]]
        System.out.println(Arrays.deepToString((ints6)));

        ints6[2][1] = 90; // [ [0,0], [0,0,0], [0,0,0,0] ]

        //перебор массива

        int[] ints7 = {2, 3, 4, 2, 2};
        //for используется для изменения массива

        for (int index = 0; index < ints7.length; index += 1) {
            //обращаемся к массиву
            ints7[index] *= ints7[index];

        }
        int sum = 0;
        for (int i = 0; i < ints7.length; i += 1) {
            sum += ints7[i]; //на первой этерации сохранили перове значение == 0

        }
        System.out.println(sum);
        //этот цикл не предоставляет доступа к индексам
        // и не возможно изменить значение
        //идет от первого к последнему элементу а в  element запишется значение элемента
        sum = 0;
        for (int element : ints7) {
            System.out.println(element);
            sum += element;
        }

        double[] ints8 = {3.7, -6.2, 12.9, 0.4, 4.1};
        double minV = ints8[0];
        for (double element : ints8) {
            if (minV > element) minV = element;
        }
        System.out.println(minV);

        System.out.println(ints8[(int) (Math.random() * ints8.length)]);

        //ARRAYS
        Arrays.sort(ints8);// сортировка массива в обратном порядке
        System.out.println(Arrays.toString(ints8));
        int elements = Arrays.binarySearch(ints8, 3.7); //в массиве ints8 ищем элемент 3,7 (binary, работает только с отсартированным масиовом)
        System.out.println(elements);

        //КОПИРОВАНИЕ МАССИВОВ
        double[] ints9 = {3.7, -6.2, 12.9, 0.4, 4.1};
        // double[] ints10 = ints9; // так копировать массивы нельзя
        double[] cloneInts9 = ints9.clone(); //вызвать метод клон и в переменную cloneInts9 попадает полная копия массива ints9

        //Arrays.copyOf()
        double[] copyInst9 = Arrays.copyOf(ints9, 3);//вначале из какого массива (из ints9) а потом указываем сколько элементов
        System.out.println(Arrays.toString(copyInst9));

        double[] newDouble = new double[10];//создали пустой массив
        System.arraycopy(ints9, 1,newDouble, 3, 2); //вначале передаем из какого массива копируем,
                                                                        // далее с какого индекса копируем,
                                                                        // далее куда, начиная с какогшо масива записывать
                                                                        //  и забераем последние 2 элеиента
        System.out.println(Arrays.toString(newDouble));

        //алгоритм быстрой сортировки прочесть quicksort
        //задача в дз №3 там -1 0 1
    }


}

