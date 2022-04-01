package ru.itmo.lessons.lesson12;

public class ExeptionLesson {
    public static void main(String[] args) {
        // Error - ошибки, связанные с проблеммами уровня JVM
        //Например не хватило памяти
        //Ошибки Error обрабатывать нет смысла

        //Exeption-исключения
        //1. Исключения времени исполнения(Наследники RunTimeExeption)
        //unchecked, необрабатываемые, неотслеживаемые, неконтролируемые
        //Разработчики могут(по своему усмотрению) обрать дынный тип исключений
        //2. Исклчения времени компеляции (все остальные наследники Exeption)
        //checked, обрабатываемые, отследваемые, контролируемые
        //Разработчик обяза обработать тип исключения

        //RunTimeExeption
        int a = 1;
        int b = 0;
        int res;
        // res = a / b; java.lang.ArithmeticException

        int[] ints = new int[3];
        //  ints[100] = 90; //java.lang.ArrayIndexOutOfBoundsException

        String s = null;
        // s.equals("data"); //java.lang.NullPointerException

        Object obj = "123";
        //  Integer integer = (Integer) obj; //java.lang.ClassCastException

        //обработка исключений (checked и unchecked)

        try { //в блок try помещается потенциально опасный код, который может привести к исключению
            res = a / b;//ArithmeticException
        } catch (ArithmeticException e) { //должен присутствовать всегда, блоков может быть несколько и всегда после try
            System.out.println(e.getMessage());
        }
    }
}
