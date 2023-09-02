package hw3.ex2;


// Задача 2: Файловый менеджер (ООП, исключения)
//
// Создайте класс FileManager. Этот класс должен иметь методы для выполнения
// основных операций с файлами: чтение, запись и копирование. Каждый из этих
// методов должен выбрасывать соответствующее исключение, если в процессе выполнения
// операции произошла ошибка (например, FileNotFoundException, если файл не найден).

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class hw2 {
    public static void main(String[] args) {
        FileManager myFile = new FileManager("newFile.txt");
        myFile.create();

        myFile.setText("Hello World!");

        myFile.write();

        myFile.read();

        myFile.makeCopy();

    }
}
