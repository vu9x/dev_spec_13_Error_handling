package hw3.ex2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    private Path filePath;
    private String fileName;
    private String text;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public FileManager(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
    }

    public Path getFilePath() {
        return filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public String getFullPath(){
        return getFilePath().toString() + File.separatorChar + fileName.toString();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void create(){
        try{
            File myFile = new File(getFileName());

            if(myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void read(){
        try(FileReader myFile = new FileReader(getFileName());){
            int i;
            while((i = myFile.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(){
        try(FileWriter myFile = new FileWriter(getFileName())){
            for(int i = 0; i < getText().length(); i++){
                myFile.write(getText().charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void makeCopy(){

        try {
            File source = new File(getFileName());
            File dest = new File(getFileName() + "copy.txt");

            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
