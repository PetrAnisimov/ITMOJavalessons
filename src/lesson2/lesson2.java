package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        //логические операторы
        //&& оператор - и
        int x = 50, y = 100, z = 91;
        //вначале отработает первый && а потом второй  (все последовательно) если оба у первого true то вернет true
        // если первый операнд false то вернет false и не проверяет далее
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
        // true && true && false
        //true && false
        System.out.println(res); //false

        res = (x < z) && (y > z);
        //true && true
        System.out.println(res); // true

        // || оператор - или
        int code = 3333, age = 34;
        //возвращает true если оба из апперандов true
        //возвращает true если один из апперандов true

        res = (code == 2222) || (code == 3333) || (code == 4444);
        //false         ||true           ||   false
        //true         ||  false (если второй апперанд true то третьий не проверяется
        System.out.println(res); //true

        res = (code != 3333) || (age < 18);
        //false || true
        System.out.println(res); //false

        //оператор ! - не -этот оператор меняет значение на противоположное
        System.out.println(!res); // true

        boolean isActive = false, isConnected = true;
        res = !isActive || !isConnected;
        //true          //false
        System.out.println(res); // вернет true сразу как только увидет его на первом опперанде

        res = !((code != 3333) || (age < 18));
        // false        || false
        //!false
        System.out.println(res);

        // ОПЕРАТОР IF
        int state = 1;
        if (state == 0) {
            System.out.println("закрытие приложения");
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }

        int month = 4;

        if (month == 12 || month == 1 || month== 2){
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month== 5){
            //month < 5 soup (spring)
            System.out.println("Spring");
        }else if (month == 6 || month == 7 || month== 8){
            System.out.println("Summer");
        }else if (month == 9 || month == 10 || month== 11){
            System.out.println("Autumn");
        }else System.out.println("Error");

      //  switch
    //от первого найденного совпадения до конца конструкции или первого break
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }
        // 4525 - вывести сумму с учетом скидки 30%
        // 6424, 7012 - вывести сумму с учетом скидки 20%
        // 7647, 9011, 6612 - вывести сумму с учетом скидки 10%
        // в остальных случаях скидка не предусмотрена

        int sum = 1000, saleCode = 7012;

        switch (saleCode){
            case 4525:
                System.out.println(sum-(sum*30/100));
                break;
            case 6424,7012:
                System.out.println(sum-(sum*20/100));
                break;
            case 7647, 9011, 6612:
                System.out.println(sum-(sum*20/100));
            default:
                System.out.println(sum);
        }
    }
}
