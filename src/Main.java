import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Modół oblicza tajemne dane dotyczące pewnego trojkąta. \n");
        System.out.print("Dane te będą wprowadzone z klawiatury. \n");

        //sekcja zmiennych wartości podstawy wierzchołków
        int wierzchołek_a, wierzchołek_b, wierzchołek_c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartość podstawy wierchołka a: ");
        wierzchołek_a = Integer.parseInt(br.readLine());
        System.out.print("Podstawa wierzchołka a wynosi: " + wierzchołek_a + ". \n");
        System.out.println("Podaj wartość podstawy wierchołka b: ");
        wierzchołek_b = Integer.parseInt(br.readLine());
        System.out.print("Podstawa wierzchołka a wynosi: " + wierzchołek_b + ". \n");
        System.out.println("Podaj wartość podstawy wierchołka c: ");
        wierzchołek_c = Integer.parseInt(br.readLine());
        System.out.print("Podstawa wierzchołka c wynosi: " + wierzchołek_c + ". \n");

        System.out.print("Informacja zbiorcza: " + wierzchołek_a + " / " + wierzchołek_b + " / " + wierzchołek_c + "\n");

        //sekcja generowania wartości n, która będzie informacja podniesienia zmiennych wartości podstawy pewnych wierzchołków
        //generowanie n (sumowanie)
        int n, suma_n = 0;

        for (n = 1; n <= 2; n++) {
            suma_n += n;
        }
        System.out.print("Test liczby (sumowanie wartości potegi, która jest cześcią podstawy wierchołków tajmniczego trójkąta  : " + suma_n + ".\n");

        //sekcja podnoszenia danych do potęgi dla kazdego wierchołka
        int rezultat_a = wierzcholek_aFunction(wierzchołek_a, suma_n);
        System.out.println("Test: sekcja podnoszenia danych do potęgi dla danego wierchołka: " + rezultat_a + ". ");
        int rezultat_b = wierzcholek_bFunction(wierzchołek_b, suma_n);
        System.out.println("Test: sekcja podnoszenia danych do potęgi dla danego wierchołka: " + rezultat_b + ". ");
        int rezultat_c = wierzcholek_cFunction(wierzchołek_c, suma_n);
        System.out.println("Test: sekcja podnoszenia danych do potęgi dla danego wierchołka: " + rezultat_c + ". " );

        System.out.print("Informacja zbiorcza: " + rezultat_a + " / " + rezultat_b + " / " + rezultat_c + " / (wartośc podniesiona do potęgi.) \n");

        //sekcja podająca różnice pomiedzy punktami (kazdego wierchołka)
        int droga_x, droga_y, droga_z;
        // <a, b>
        droga_x = rezultat_a - rezultat_b;
        droga_y = rezultat_b - rezultat_c;
        droga_z = rezultat_a - rezultat_c;

        System.out.println("Wartość drogi pomiędzy punktami: (zawartość posiadanych informacji w bazie danych) -> " + droga_x);
        System.out.println("Wartość drogi pomiędzy punktami: (zawartość posiadanych informacji w bazie danych) -> " + droga_y);
        System.out.println("Wartość drogi pomiędzy punktami: (zawartość posiadanych informacji w bazie danych) -> " + droga_z);
    }

    static int wierzcholek_aFunction(int informationOne, int informationTwo) {
        int result_a = 1;
        for (int i = 0; i < informationTwo; i++) {
            result_a = informationOne * result_a;
        }
        return result_a;
    }
    static int wierzcholek_bFunction(int informationOne, int informationTwo) {
        int result_b = 1;
        for (int i = 0; i < informationTwo; i++) {
            result_b = informationOne * result_b;
        }
        return result_b;
    }
    static int wierzcholek_cFunction(int informationOne, int informationTwo) {
        int result_c = 1;
        for (int i = 0; i < informationTwo; i++) {
            result_c = informationOne * result_c;
        }
        return result_c;
    }

}