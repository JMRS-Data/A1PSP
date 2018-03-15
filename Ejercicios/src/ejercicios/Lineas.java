/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author MF
 */
public class Lineas {
    private int lineasCod;
    private int comentarios;
    private int vacios;
    
    public int contarLineas() throws FileNotFoundException{
    final String folderPath = "C:\\Users\\MF\\Documents\\NetBeansProjects\\Ejercicios\\src\\src";
    int totalLineCount = 0;
    final List<File> folderList = new LinkedList<>();
    folderList.add(new File(folderPath));
    while (!folderList.isEmpty()) {
        final File folder = folderList.remove(0);
        if (folder.isDirectory() && folder.exists()) {
            System.out.println("Abriendo " + folder.getName());
            final File[] fileList = folder.listFiles();
            for (final File file : fileList) {
                if (file.isDirectory()) {
                    folderList.add(file);
                } else if (file.getName().endsWith(".java")) {
                    long lineCount = 0;
                    final Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        scanner.nextLine();
                        lineCount++;
                    }
                    totalLineCount += lineCount;
                    final String lineCountString;
                    if (lineCount > 99999) {
                        lineCountString = "" + lineCount;
                    } else {
                        final String temp = ("     " + lineCount);
                        lineCountString = temp.substring(temp.length() - 5);
                    }
                    System.out.println(lineCountString + "Tiene" + file.getName());
                }
            }
        }
    }
    return totalLineCount;        
    }
    
    
    public int contarComentarios() throws FileNotFoundException{
    final String folderPath = "C:\\Users\\MF\\Documents\\NetBeansProjects\\Ejercicios\\src\\src";
    int totalLineCount = 0;
    final List<File> folderList = new LinkedList<>();
    folderList.add(new File(folderPath));
    while (!folderList.isEmpty()) {
        final File folder = folderList.remove(0);
        if (folder.isDirectory() && folder.exists()) {
            System.out.println("Abriendo " + folder.getName());
            final File[] fileList = folder.listFiles();
            for (final File file : fileList) {
                if (file.isDirectory()) {
                    folderList.add(file);
                } else if (file.getName().endsWith(".java")) {
                    long lineCount = 0;
                    final Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        scanner.nextLine();
                        lineCount++;
                    }
                    totalLineCount += lineCount;
                    final String lineCountString;
                    if (lineCount > 99999) {
                        lineCountString = "" + lineCount;
                    } else {
                        final String temp = ("     " + lineCount);
                        lineCountString = temp.substring(temp.length() - 5);
                    }
                    System.out.println(lineCountString + "Tiene" + file.getName());
                }
            }
        }
    }
    return totalLineCount;        
    }
    
    public int contarVacios() throws FileNotFoundException{
    final String folderPath = "C:\\Users\\MF\\Documents\\NetBeansProjects\\Ejercicios\\src\\src";
    int totalLineCount = 0;
    final List<File> folderList = new LinkedList<>();
    folderList.add(new File(folderPath));
    while (!folderList.isEmpty()) {
        final File folder = folderList.remove(0);
        if (folder.isDirectory() && folder.exists()) {
            System.out.println("Abriendo " + folder.getName());
            final File[] fileList = folder.listFiles();
            for (final File file : fileList) {
                if (file.isDirectory()) {
                    folderList.add(file);
                } else if (file.getName().endsWith(".java")) {
                    long lineCount = 0;
                    final Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        scanner.nextLine();
                        lineCount++;
                    }
                    totalLineCount += lineCount;
                    final String lineCountString;
                    if (lineCount > 99999) {
                        lineCountString = "" + lineCount;
                    } else {
                        final String temp = ("     " + lineCount);
                        lineCountString = temp.substring(temp.length() - 5);
                    }
                }
            }
        }
    }
    return totalLineCount;        
    }
}



