package problema9_3_1;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application2 {


    public static void main(String[] args) {
        String text = "Expresii Lambda";


        List<String> cuvinte = Arrays.asList(text.split(" "));
        System.out.println("Lista inițială: " + cuvinte);
        System.out.println("    ");


        List<String> cuvinteLungi = cuvinte.stream()
                .filter(cuvant -> cuvant.length() >= 5)
                .collect(Collectors.toList());

        long numarCuvinteLungi = cuvinte.stream()
                .filter(cuvant -> cuvant.length() >= 5)
                .count();

        System.out.println("Lista filtrată (lungime >= 5): " + cuvinteLungi);
        System.out.println(" Numărul cuvinte: " + numarCuvinteLungi);


        List<String> cuvinteOrdonate = cuvinteLungi.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Lista ordonata: " + cuvinteOrdonate);


        Optional<String> cuvantCuP = cuvinte.stream()
                .filter(cuvant -> cuvant.startsWith("p") || cuvant.startsWith("P"))
                .findFirst();

        if (cuvantCuP.isPresent()) {
            System.out.println("Un element care începe cu litera 'p': " + cuvantCuP.get());
        } else {
            System.out.println(" Niciun cuvannt nu incepe cu p.");
        }

    }
}
