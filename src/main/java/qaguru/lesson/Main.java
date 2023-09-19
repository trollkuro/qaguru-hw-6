package qaguru.lesson;

public class Main {
    public static void main(String[] args) {

        byte varByte = 127; // [-128;127]
        short varShort = 32767; // [-32768;32767]
        int varInt = 90090055;
        long varLong = 9223372036764685100l;
        float varFloat = 1.1f;
        double varDouble = 1.1;
        char varChar = 'a';
        boolean varBoolean = true;

        System.out.println("### Приведение типов:");
        System.out.println("varByte + varShort = " + (varByte + varShort));
        System.out.println("varShort + varInt = " + (varShort + varInt));
        System.out.println("varInt + varLong = " + (varInt + varLong));

        System.out.println("\n### Выход за пределы типов данных:");
        System.out.println("значение, если за пределами Byte = " + (byte)(varByte + 1));
        System.out.println("значение, если за пределами Short = " + (short)(varShort + 1));

        System.out.println("\n### Комбинация типов данных:");
        System.out.println("varShort + varDouble = " + (varShort + varDouble));
        System.out.println("varLong + varFloat = " + (varLong + varFloat));
        System.out.println("varChar + varDouble = " + (varChar + varDouble));
        //System.out.println("varChar + varBoolean = " + (varChar + varBoolean)); вернётся ошибка "bad operand types for binary operator"

        System.out.println("\n### Логические операторы:");
        String animal = "dog";
        byte hour = 7;

        if (animal.equals("cat") || animal.equals("fish") || animal.equals("humster")){
            System.out.println("Спишь до 10 утра, счастливый человек!\nНикого не нужно выгуливать.");
        } else if (animal.equals("dog") && (hour >= 5) && (hour <= 9)) {
            System.out.println("Просыпайся, пора гулять с собакой утром!");
        } else if (animal.equals("dog") && (hour >= 19) && (hour <= 22)) {
            System.out.println("Пора гулять с собакой вечером!");
        } else {
            System.out.println("Обними своего питомца (если это возможно) :)");
        }

    }
}