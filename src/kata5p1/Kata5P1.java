package kata5p1;

import java.util.List;


public class Kata5P1 {

    public static void main(String[] args) {
        String file = "email.txt";
        List<String> list = MailListReader.Read(file);
        InsertarDatosTabla insertar = new InsertarDatosTabla();
        insertar.insert(list);
    }
}
