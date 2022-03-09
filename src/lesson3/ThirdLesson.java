package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
//
//        // Пользовательский ввод
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        int userNum = in.nextInt();
//        System.out.println(userNum * userNum);
//
//        while (true) { //в скобках должен быть результат буливового типа
//            System.out.println("Введите целое положительное число" + " или 0 для выхода из программы");
//            userNum = in.nextInt();
//            if (userNum == 0)
//                break; //если значение == 0, то выход из цикла, break выкидывает из цикла. Приврвет только текущий цикл
//            if (userNum < 0)
//                continue; //переход на следующую итерацию (следующую команду в текущем цикле)
//            System.out.println(userNum * userNum);
//        }
//
//        //do выполнится в любом случае и только потом переходит к проверке условий в while(условие)
//        do {
//            System.out.println("-DOWHILE- Введите целое положительное число" + " или 0 для выхода из программы");
//            userNum = in.nextInt();
//            if (userNum < 0) continue;
//            System.out.println(userNum * userNum);
//        } while (userNum != 0); // если тут true то выполняется еще раз тело цикла do()
//
//        int start = 1, end = 12;
//        //вывести все четные числа от start до end
//        //четное число: делем число на 2 без остатка  (%2 == 0)
//        // 2 4 6 8 19 12
//
//        while (start <= end) { //пока значение start меньше или равно переменной end будет true
//            if (start % 2 == 0) System.out.println(start);
//            start += 1;
//        }
//
//
//        //Цикл for
//        //      1                           2                           3
//        // (инициализация переменных ; булевое выражение (условие) ; обновление значений переменных) {
//        //проверка выполняется сначала 1 потом 3 потом 2 потом снова 3
//        for (start = 1, end = 12;start<=end; start += 1){
//            if (start % 2 == 0) System.out.println(start);
//        }
//
//        //вывести все неотрецательные элементы последовательности
//        // 90 85 80 75 70 65 60
//
//        for (int num = 90;num >= 0;num -=5 ){
//            System.out.println(num);
//        }
//
//        //вывести на экран первые 10  элементов последовательности
//        //2 4 6 8 10

//        int secondNum = 10;
//        for (int count = 0,num = 2; count < 10;count +=1, num += 2){
//            System.out.println(num);
//        }
        System.out.println("Введите количество тареолок");
        Scanner in = new Scanner(System.in);
        int plates = in.nextInt();

        System.out.println("Введите количество моющего средства");
        double ferry = in.nextInt();

        while (ferry > 0 && plates >0){
            ferry -= 0.5;
            plates -=1;
            System.out.println(ferry);
        }
        System.out.println(ferry);
        System.out.println(plates);
        }

    }

