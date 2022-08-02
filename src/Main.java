import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//write your code here
//        int number = 100;
//        long number2 = 100;
//        double number3 = 100.01;
//        String brand = "Amigoscode";
//        Date date = new Date();
//        byte theByte = -128;
//        // 1 byt
//        short theShort = -32_768;
//        // 2 byte
//        int theInt = 56_787_654;
//        // 4 byte
//        long theLong = 56_787_654L;
//        // 8 byte
//
//        float pi = 3.14F;
//        // 6-7 digits
//        double doublePi = 3.1415;
//        // 15 digits
//
//        boolean isAdult = true;
//
//        char nameInitial = 'A';
//
//        System.out.println(theByte);
//        System.out.println(theShort);
//        System.out.println(theLong);
//        System.out.println(theInt);
//        System.out.println(pi);
//        System.out.println(doublePi);
//        System.out.println(isAdult);
//        System.out.println(nameInitial);

//        REFERENCE DATA TYPES
//        String name = new String("Amigoscode");
//        System.out.println(name.toUpperCase());
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getMonth());
//

        // PRIMITIVES VS REFERENCE TYPES

//        int a = 10;
//        int b = a;
//        a = 100;
//        System.out.println("a = " + a + " - b = " + b);
//        Person alex = new Person("alex");
//        Person mariam = alex;
//
//        System.out.println("before changing alex");
//        System.out.println(alex.name + " " + mariam.name);
//
//        alex.name = "Alexander";
//
//        System.out.println("after changing alex");
//        System.out.println(alex.name + " " + mariam.name);
//    }
//
//    static class Person {
//        String name;
//
//        Person(String name) {
//            this.name = name;
//        }

        // String
//        char a = 'A';
//        char b = 'B';
//
//        String name = new String("Amigoscode");
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        // pulls character at specfic index
//        System.out.println(name.charAt(0));
//
//        String code = new String("code");
//        System.out.println(name.contains(code));
//        System.out.println(name.equals(code));

//
//        ARITHMETIC OPERATIONS

//        int ten = 10;
//        int two = 2;
//        int addition = ten + two;
//        System.out.println(addition);

//        MATH CLASS

//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(3.6, 10.11));
//        System.out.println(Math.min(3, 90));
//        System.out.println((int) Math.pow(5, 2));
//        System.out.println((int) Math.sqrt(25));
//        System.out.println(Math.PI);

//        COMPARISON OPERATORS

//            int khalidAge = 19;
//            int mariamAge = 20;
//            boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
//        System.out.println(isKhalidOlderThanMariam);
//        System.out.println(khalidAge > mariamAge);
//        System.out.println(khalidAge < mariamAge);
//        System.out.println(khalidAge != mariamAge);

//        LOGICAL OPERATORS

//        boolean isAdult = false;
//        boolean isStudent = true;
//        System.out.println(isAdult && isStudent);
//        System.out.println(isAdult || isStudent);
//        boolean isAmigoscodeMember = true;
//        System.out.println( (!isAdult || isStudent) && isAmigoscodeMember);
//        String name = "Mark";
//        System.out.println((10 > 8 || 2 <= 2)
//        && !isAdult
//        && name.contains("M"));

//        If Statements;
//        int age = 16;

//        Ternary Operator
//        String message = age >= 18 ?
//                "Hooray... I'm an adult" :
//                "I am not an adult";
//        System.out.println(message);
        //        Ternary Operator End

//        if (age >= 18) {
//            System.out.println("Hooray... I'm an adult");
//        } else if (age >= 16 && age <=18) {
//            System.out.println("I'm almost an adult");
//        } else {
//            System.out.println("I am not an adult");
//        }

//        SWITCH STATEMENT
//            String gender = "MALE";

//            if (gender.equals("FEMALE")) {
//                System.out.println("I am a Female");
//            }  else if (gender.equals("MALE")) {
//                System.out.println("I am a male");
//            } else if (gender.equals("Prefer_Not Say")) {
//                System.out.println("Prefered not to say");
//            } else {
//                System.out.println("Unknown");
//            }
//            SWITCH CASE EQUIVILENT

//            switch (gender.toLowerCase()) {
//            case "female":
//                System.out.println("I am a Female");
//                break;
//            case "male":
//                System.out.println("I am a Male");
//                break;
//            case "Prefer_Not_Say":
//                System.out.println("Prefer Not Say");
//                break;
//            default:
//                System.out.println("Unknown");
//        }

//        ARRAYS
//        int [ ] numbers = {2, 0, 1, 1232, 24324, 980};
//        int [] numbers = new int[3];
//        numbers[0] = 0;
//        numbers[1] = 1;
//        numbers[2] = 2;
//        numbers[3] = 34; /*throws error*/
//        boolean [] numbers = new boolean[3];
//        String [] numbers = new String[3];
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//
//        String [] names = {"Ali", "Maria"};
//        System.out.println(names.length);
//        System.out.println(Arrays.toString(names));
//        int thirdNum = numbers[2];
//        int thirdNum1 = numbers[numbers.length-1];
//        System.out.println(thirdNum);
//        System.out.println(thirdNum1);

//        FOR LOOPS --- INCREMENTING AND DECREMENTING

//        int [ ] loopTestNum = {2, 0, 1, 12, 24, 98, 105, 77, 49};
//        String[] names = {"Anna", "Ali", "Bobby"};

//        int number = 0;
//        number++; /*equivalant to: number = number + 1 */
//        number += 3 /*equivalent to: number + 3 */
//        System.out.println(number);

//        for (int i = 0; i < loopTestNum.length; i++) {
//            System.out.println(loopTestNum[i]);
//        }
//        System.out.println("Enhanced for loop");
//        for (int number : loopTestNum) {
//            System.out.println(number);
//        }
//        System.out.println("For loop for strings");
//        for (String name :names) {
//            System.out.println(name);
//        }
//        Arrays.stream(loopTestNum).forEach(System.out::println);
//        Arrays.stream(names).forEach(System.out::println);
//        for (int i = 0; i < loopTestNum.length; i++) {
//
//        }
//        for (int i = loopTestNum.length - 1; i >= 0; i--) {
//
//        }
//        for (String name : names) {
//
//        }

//        BREAK AND CONTINUE

//        String[] breakNames = {"Anna", "Ali", "Bobby", "Mike"};
//        for (String breakName : breakNames) {
//
//            if (breakName.startsWith("B")) {
//                continue;
//            }
//            System.out.println(breakName);
//
////            if (breakName.equals("Bobby")) {
////                break;
////            }
////            System.out.println(breakName);
//
////            System.out.println(breakName);
////            break;
//        }

//        WHILE & DO WHILE LOOP
//        int count = 0;
//
//        while(count <= 20){
//            System.out.println("count " + count);
//            count++;
//        }
//
//        int doCount = 21;
//
//        do {
//            System.out.println("doCount " + doCount);
//            doCount++;
//        }
//        while(doCount <= 20);

//        Scanner Class
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//
//        System.out.println("How old are you ?");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("Born in the year of " + year);
//
//        if (age <= 18) {
//            System.out.println("You are not an adult");
//        } else {
//            System.out.println("You're an adult :)");
//        }

//        METHODS

//        System.out.println("Hello");
//        String brand = "Samsung";
//        System.out.println(brand.toUpperCase());
//        boolean startsWithS = brand.startsWith("s");
//        System.out.println(startsWithS);
//        // or
//        System.out.println(brand.startsWith("S"));
//        System.out.println(brand.endsWith("g"));

        // User defines Methods
//        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
//        int count = countOccurrences(letters, 'A');
//        System.out.println(count);
//    }
//
//    public static int countOccurrences(
//            char [] letters, char searchLetter) {
//        int count = 0;
//        for (char letter : letters) {
//            if (letter == searchLetter) {
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(letters));
//        System.out.println(searchLetter);
//        System.out.println("Method countOccurrences was invoked");

//        return count;

//        CLASSES AND OBJECTS
        Lens lensOne = new Lens(
                "Sony",
                "85mm",
                true
        );
        Lens lensTwo = new Lens(
                "Canon",
                "30mm",
                true
        );
        Lens lensThree = new Lens(
                "Nikon",
                "24-70mm",
                true
        );
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);


        Passport ukPassport = new Passport(
                "1234",
                "England",
                LocalDate.of(2025, 1, 1));
        Passport usPassport = new Passport(
                "5678",
                "England",
                LocalDate.of(2028, 5, 5));

    }
    static class Lens {
        String brand;
        String model;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
