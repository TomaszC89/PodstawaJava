public class Stringi {
    public static void main(String[] args) {

        String myVar = "Mama i Tata";
        String myVar2 = "Mama i Tata";
        System.out.println(myVar.toUpperCase()); //wszystkie litery na duże
        System.out.println(myVar.toLowerCase()); //wszystkie litery na małe
        System.out.println(myVar.equals(myVar2));//sprawdza czy oba ciągi_znaków są takie same
//System.out.println(myVar=myVar+myVar2); //dodanie do siebie napisów
        System.out.println(myVar.concat(myVar2)); //dodanie do siebie napisów
        System.out.println(myVar.isEmpty());      // czy jest puste true or false
        System.out.println(myVar.length());       // ilość znaków w ciągu


        String myVar = new String("This String is String!");
        String str = "String";
        myVar.contains(str); // true
        myVar.indexOf(str); // 5
        myVar.lastIndexOf(str); // 15


        String myVar = new String("This String is String!");
        String str = "OK";
        String.join("-", myVar, str, "xyz"); // This String is String!-OK-xyz


        System.out.print("Tekst" + "\n"); // "\n" działa jako polecienie przejścia do nowej lini
        System.out.println("Dodatni");
        System.out.printf("My cat, %s, is %d years old.%n", "Filemon", 8); //podmienia litery z znakiem % np: %s na wartość która jest na końcu lini i ma odpowiedni typ


        int wiek = 18;
        if (wiek < 18 && wiek > 0) {
            System.out.println("Nieletni");
        } else if (wiek >= 18) {
            System.out.println("Pełnoletni");
        } else if (wiek >= 65 && wiek < 100) {
            System.out.println("Senior");
        } else {
            System.out.println("błędny wiek");
        }
    }
}