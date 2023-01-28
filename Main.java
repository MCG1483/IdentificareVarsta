public class Main {
    public static void main(String[] args) {
        /* Introducem doua date de tip string, (Ziua Curenta si Data de Nastere)
        intotdeauna separate de slash "/" */
        String birthDate = "31/02/1983";
        String currentDate = "19/11/2022";
        /* Vom imparti ziua de nastere in trei componente pe baza separatorului "/".
           Impartirea este realizata prin folosirea metodei de .split()
           Rezultatul despartirii (split) va fi tot de tip String si
           intotdeauna va fi stocat intr-un vector "String[]"
        */

        String[] birthDateFormatted = birthDate.split("/");
           for (int i = 0; i < birthDateFormatted.length; i++)
           {System.out.println("Index value at i = " + i + " is " + birthDateFormatted[i]);}
        System.out.println();
        /*
        Deoarece nu putem efectua operatii de adunare, scadere, comparatie pe numere salvate ca String-uri,
        trebuie sa efectuam o conversie din String in Integer. Aceasta este realizata prin comanda
        Integer.parseInt
        */
        int dayOfBirth = Integer.parseInt(birthDateFormatted[0]);
        int monthOfBirth = Integer.parseInt(birthDateFormatted[1]);
        int yearOfBirth = Integer.parseInt(birthDateFormatted[2]);

        String[] currentDateFormatted = currentDate.split("/");
        for (int i = 0; i < currentDateFormatted.length; i++)
        {System.out.println("Index value at i = " + i + " is " + currentDateFormatted[i]);}
        int currentDay = Integer.parseInt(currentDateFormatted[0]);
        int currentMonth = Integer.parseInt(currentDateFormatted[1]);
        int currentYear = Integer.parseInt(currentDateFormatted[2]);

        int age = currentYear - yearOfBirth;
        if (monthOfBirth > currentMonth)
        {age -= 1;} /* Echivalent cu age = age - 1 */
          else
        if (monthOfBirth == currentMonth)
        {if (dayOfBirth > currentDay)
        {age -= 1;}
        }


        System.out.println();
        System.out.println("Current Age is: " + age);

    }
}