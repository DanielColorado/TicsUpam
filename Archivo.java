

package Clases;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL
 */
public class Archivo {
    private File file;
    private FileReader lectorArchivo;
    private BufferedReader lectorBuffer;

    public Archivo(File file) {
        this.file = file;
    }
    
    
    public ArrayList<String> sacarPatronesBaseDeConocimientos(){
        ArrayList<String>patrones= new ArrayList<>();
        String texto;
        try {
            lectorArchivo = new FileReader(file);
            lectorBuffer = new BufferedReader(lectorArchivo);
            if (file.exists()) {
                StringBuilder p1= new StringBuilder();
                StringBuilder p2= new StringBuilder();
                StringBuilder p3= new StringBuilder();
                StringBuilder p4= new StringBuilder();
                StringBuilder p5= new StringBuilder();
                StringBuilder p6= new StringBuilder();
                StringBuilder p7= new StringBuilder();
                StringBuilder p8= new StringBuilder();
                StringBuilder p9= new StringBuilder();
                StringBuilder p10= new StringBuilder();
                StringBuilder p11= new StringBuilder();
                StringBuilder p12= new StringBuilder();
                StringBuilder p13= new StringBuilder();
                StringBuilder p14= new StringBuilder();
                StringBuilder p15= new StringBuilder();
                while ((texto = lectorBuffer.readLine()) != null) {
                    p1.append(String.valueOf(texto.charAt(0)));
                    p2.append(String.valueOf(texto.charAt(1)));
                    p3.append(String.valueOf(texto.charAt(2)));
                    p4.append(String.valueOf(texto.charAt(3)));
                    p5.append(String.valueOf(texto.charAt(4)));
                    p6.append(String.valueOf(texto.charAt(5)));
                    p7.append(String.valueOf(texto.charAt(6)));
                    p8.append(String.valueOf(texto.charAt(7)));
                    p9.append(String.valueOf(texto.charAt(8)));
                    p10.append(String.valueOf(texto.charAt(9)));
                    p11.append(String.valueOf(texto.charAt(10)));
                    p12.append(String.valueOf(texto.charAt(11)));
                    p13.append(String.valueOf(texto.charAt(12)));
                    p14.append(String.valueOf(texto.charAt(13)));
                    p15.append(String.valueOf(texto.charAt(14)));
                }
                patrones.add(p1.toString());
                patrones.add(p2.toString());
                patrones.add(p3.toString());
                patrones.add(p4.toString());
                patrones.add(p5.toString());
                patrones.add(p6.toString());
                patrones.add(p7.toString());
                patrones.add(p8.toString());
                patrones.add(p9.toString());
                patrones.add(p10.toString());
                patrones.add(p11.toString());
                patrones.add(p12.toString());
                patrones.add(p13.toString());
                patrones.add(p14.toString());
                patrones.add(p15.toString());
            } else {
                JOptionPane.showMessageDialog(null, file.getName() + ": El archivo no existe!!!");
            }
            lectorArchivo.close();
            lectorBuffer.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, file.getName() + ": No cuenta con los permisos necesarios");
        }
        return patrones;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileReader getLectorArchivo() {
        return lectorArchivo;
    }

    public void setLectorArchivo(FileReader lectorArchivo) {
        this.lectorArchivo = lectorArchivo;
    }

    public BufferedReader getLectorBuffer() {
        return lectorBuffer;
    }

    public void setLectorBuffer(BufferedReader lectorBuffer) {
        this.lectorBuffer = lectorBuffer;
    }
    
}
