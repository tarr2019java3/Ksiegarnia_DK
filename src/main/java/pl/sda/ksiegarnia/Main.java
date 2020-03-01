package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Author author = new Author("Jan", "Kowalski");
    Author author1 = new Author("Zbyszek", "Piotrowsk");
    Author author2 = new Author("Kazik", "Nowak");

    Category category = new Category("Fantasy");


    Book ksiazka = new Book("Byle dalej", author, category);
    Book ksiazka2 = new Book("Coraz lepiej", author1, category);
    Book ksiazka3 = new Book("To jest już koniec", author2, category);

        List<Book> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(ksiazka);
        listaKsiazek.add(ksiazka2);
        listaKsiazek.add(ksiazka3);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("listaksiazek.json"), listaKsiazek);
        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
