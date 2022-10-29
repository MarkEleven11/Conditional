public class Main {
    public static void main(String[] args) {
        ///Task 1
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        }

        ///Task 2
        int age1 = 7;
        if (age1 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age1 < 14) {
            System.out.println("Может кататься в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if ( age > 14 ) {
            System.out.println("Может кататься без сопровождения взрослого");
        }

        ///Task 3
        int one = 300;
        int two = 150;
        int three = 68;
        if (one > two && one > three) {
            System.out.println(one + " большее число.");
        } else if (two > one && two > three ) {
            System.out.println(two + " большее число");
        } else if (three > one && three > two) {
            System.out.println(three + " большее число.");
        }



        }
    }