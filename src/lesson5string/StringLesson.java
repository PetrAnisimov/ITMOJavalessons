package lesson5_String;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
                            //TODO
                            // char (примитивный тип данных) 16 бит
                            // от 0 до 65636 / '\u0000' до '\uffff'
                            // Строго одинарными ковычками

        char char1 = 'j'; // символ
        char char2 = 74; // номер из таблички UNICODE символа j
        char char3 = '\u0044';//16 ричное представление символа в escape последовательности
        System.out.print(char1);
        System.out.print(char2);
        System.out.print(char3);

                            //TODO перенос строки это \n
        System.out.print("\nСтрокик");

                            //TODO  Строка это упорядоченная последовательность символов.
                                    // Строка - ссылочный тип,экземпляр класса String
                            //TODO Общее о строках
                                      // 1) Строки задаются в "";
                                      // 2) new String() - этот вариант используется только если двойные ковычки использовать ни как не полчается
                                      // 3) Строки в языке не изменны

                            //TODO Проверяме написание строки когда невозможно напистаь стпроку с ""
                                    //Массив последовательности char
        char[] chars = {'\u004A','\u004A','\u004A'};
        String jjdString = new String(chars);
        System.out.println(jjdString);
        System.out.println(jjdString.length()); // вернул количество char = 3

                            //TODO Пример сурогатной пары, смвол лягушки появился путем вывода в консоль двумя парами.ТОЛЬКО ДВА СИМВОЛА
        char[] chars1 = {'\uD83D','\uDC38'};
        String frogString = new String(chars1);
        System.out.println(chars1);
        System.out.println(chars1.length);

                            //TODO Действительный вывод количества символов
        System.out.println(frogString.codePoints().count());

                                    //Хранение строк до java 9 массив char[] в кодировке UTF-16
                                    //Каждый char был представлен двумя байтами
                                    //Начиная с 9 версии строки стали хранится как массив
                                    // byte[] +кодировка LATIN1 или UTF-16

                            //TODO Пул строк
                                    //В пуле строк всегда содержит уникальные строки
                                    //Пул строк хранит только одну копию каждого стракового литерала
                                    //Пул строк: "Строка", даллее вновь проверяется пул строк
                                    // и в нем уже находится значение из string1 и поэтому ссылается string2 на string1
                                    //
        String string1 ="Строка";
        String string2 ="Строка";

        String string3 = new String("Строка");
        //string3 ссылается на "Строка" вне пула

        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
                                //TODO метод intern() все интернированные строки они из пула (строки в "")
        String internString = string3.intern();
        //internString ссылается на "Строка" из пула


                                //TODO Сравнение строк
                                //для сравнения не используем ==, тк == сравнивает ссылки

        System.out.println(string1.equals(string2)); //true если равны false если не равны
        System.out.println("строка".equals(string2)); //false потому что в "строка" начало с маленькой буквы
        System.out.println("строка".equalsIgnoreCase(string2)); //true так как метод не смотрит на регистр

        string2 = null;
        System.out.println("строка".equals(string2));
      //  System.out.println(string2.equals("строка")); //.NullPointerException (где то в переменной NULL)

                                //TODO проверка на NULL

        System.out.println(string2 == null);
        System.out.println(string2 != null);

        string1 = "Java";
        string2 = "Python";

                                //TODO Конкатенация строк
        String concatString = string1 + " :: " + string2;
        System.out.println(concatString);

        concatString = string1.concat(" :: ").concat(string2);
        System.out.println(concatString);

        concatString = String.join(" :: ",string1,string2);
        System.out.println(concatString);

            //ВОТ ТАК ДЕЛАТЬ НЕЛЬЗЯ
//        concatString = "";
//        for (int i = 0; i < 10; i++) {
//            concatString += i + " ";
//        }
//        System.out.println(concatString);

                                    //StringBuilder - работает быстррее НЕ СОЗДАЕТ НОВЫЙ ОБЪЕКТ! ПОЭТОМУ МОЖНО ИСПОЛЬЗОВАТЬ В FOR
                                    //StringBuffer - потокобезопасный, может использоваться в многопоточных программах

        concatString = "Начало строки ";
        StringBuilder sb = new StringBuilder(concatString);

        sb.append(string1).append(" :: ").append(string2);

        StringBuilder sb2 = new StringBuilder(concatString);
        for (int i = 0; i < 10; i+=1) {
            sb2.append(i).append(" :: ");
        }
        System.out.println(sb2); //В методе println уже реализован toString()

        String sbString = sb2.toString(); //toString вернул строчку от sb2,то что накопилось в цикле
        System.out.println(sbString);

                                    //TODO split()
        String langs = "Java, Python, JavaScript";
        //масив строк
        String[] lanfArr = langs.split(", ");//ищет то что в скаобках, как нашел сразу создает первый элемент массива
        System.out.println(Arrays.toString(lanfArr));
                                    //TODO Методы замены

        String newString = langs.replaceAll(", "," - ");//Сначало что хотим заменить потом на что, поддерживает регулярные выражения
        System.out.println(newString); //Java - Python - JavaScript

        newString = langs.replaceFirst(", "," - "); //заменилось только первое вхождение
        System.out.println(newString); //Java - Python, JavaScript

        newString = langs.replace(", "," - "); //не поддерживает регулярные выражения
        System.out.println(newString); //Java - Python, JavaScript

        System.out.println(langs.contains("th"));//проверяет содержит ли строка уникальную последовательность символов (true/false) регистрозависима
        System.out.println(langs.startsWith("j"));//проверяет начинается ли строка с указанных символов (true/false) регистрозависима
        System.out.println(langs.endsWith("Script"));//проверяет заканчивается ли на указанный символ (true/false) регистрозависима
        System.out.println(langs.startsWith("a",1)); // проверка есть ли буква "a" в индексе 1

        int a = 10;
        int b = 12;
        int c1 = a + b;
        int c2 = 10 + 22;
    }


}
