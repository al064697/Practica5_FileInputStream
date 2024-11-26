import java.io.FileInputStream;
import java.io.IOException;

public class Practica5_UsoFileInputStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // Abrir el archivo de receta
            fis = new FileInputStream("receta.txt");

            // Leer el contenido del archivo
            int content;
            while ((content = fis.read()) != -1) {
                // Mostrar el contenido en la consola
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el FileInputStream
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}