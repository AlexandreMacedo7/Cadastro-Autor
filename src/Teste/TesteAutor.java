package Teste;

import model.Autor;
import model.eSexo.ESexo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class TesteAutor {
    public static void main(String[] args) {

    Collection<Autor> autor = new HashSet<>();

        autor.add(new Autor("Alexandre Macedo", ESexo.MASCULINO,"alexandre.gmail.com",
                LocalDate.of(1996, Calendar.MARCH,14),"Brasil", "888.666.666-85"));

        autor.add(new Autor("Bruna Heloisa", ESexo.FEMININO,"heloisa.gmail.com",
                LocalDate.of(2004, Calendar.JULY,17),"Brasil", "999.999.999-55"));


        autor.forEach(autores -> System.out.println(autores + "\n"));

    }

}