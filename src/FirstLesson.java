public class FirstLesson {
    public static void main(String[] args) {
        System.out.println("Info for console");

        //типДанных имяПеременной;
        int size; //объявили переменную типа int
        size = 12;
        int count =  2343;

        //в одну инструкцию объявили две переменные
        int lenght = 122, width = 12;
        count = 80_000;
        System.out.println(count);

       // byte data = 327; привышен доступный диапозон
        long veryBig = 67_000_000_000L;

        //если мы используем два типа doubl и float то во float нужно указать в конце букву f
        double price = 56.7;
        float temp = -78.3f;

        //деление чисел с плавающей точкой на ноль мы получаем бесконечность, как в отрицательном так и в положительном диапазоне
        System.out.println(price/0);
        System.out.println(temp/0);

        //double price = 34; две переменных с одним значением не могут существовать в одной области видимости

        count = 8700; //int 8700
        //автоматическое приведение типов
        price = count;
        System.out.println(price);

        //явное привидение типов, ставим скобки перед переменной и прописываем тот тип данных к которому приводим
        byte small = (byte)count;
        System.out.println(small);

        //Операторы
        int a = 9, b = 4;
        int c = a / b;
        System.out.println(c);

        byte x = 6, y = 12;
       // byte z = x +y; //если мы прибовляем данные байтов их результат становится int и мы не присвоим int к byte
        //если все же хотим привести к типу то берем сложение в скобки
        byte z = (byte) (x+y); // в z присвоится значение типа byte

        //%
        lenght = 9;
        width = 2;
        System.out.println(lenght % width);
        //работа оператора
        //4.5 и 4.5
        //0.5 + 0.5 = 1
        System.out.println(7 % 4); //3
        System.out.println(8 % 2); //0
        System.out.println(9 % 2); //1

        //операторы присваивания
        int num = 10;
        num = num + 10;
        num += 10; //тоже самое что и выше
        num -= 10;
        num *= 10;
        num /= 10; //вначале разделили значение потом присвоили
        num %= 10;

        System.out.println(width == lenght); //сравниваем значения
        System.out.println(40 <= 40);
        System.out.println(400 != 40);

        // тернарный оператор ?
        int start = 3, end = 5000;
        int res = start > end ? end - start:0; //возвращает результат в зависимовти от условия, если до ? вернет значение true если false то после :
        System.out.println(res);


    }
}
