public class Main {
    public static void main(String[] args) {
        ///Task 1
        int age = 25;
        if ( age >= 18 )
        {
            System.out.println("Поздравляем с совершеннолетием");
        }
        else
        {
            System.out.println("Возраст совершеннолетия еще не наступил, придется подождать");
        }

        ///Task 2
        if (age >= 7 && age < 18 ) {
            System.out.println("Ребенок идет в школу");
        } else if (age >= 18 && age <= 24 ) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if  (age > 24 ) {
            System.out.println("Человек уже окончил университет и ему пора искать первую работу");
        }

        ///Task 3
        int people = 102;
        int seats = 60;
        int stand = people - seats;
        int seatsUsed = 5;
        int standUsed =  62;
        if ( seatsUsed + standUsed > people ) {
            System.out.println("Вагон забит");
        }
        if ( seats >= seatsUsed ) {
            System.out.println("Есть еще " + (seats - seatsUsed) + " cидячих мест");
        }
        if ( stand >= standUsed) {
            System.out.println( "Есть еще " + (stand - standUsed) + " стоячих мест");
        }
        else if ( seats < seatsUsed ) {
            System.out.println("Сидячих мест нет");
        }
        else if ( stand < standUsed) {
            System.out.println("Стоячих мест нет");
        }









    }
}