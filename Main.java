import java.io.File;
import java.io.FileInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() throws Exception {
           // Mở một luồng FileInputStream để đọc từ tệp "input.inp"
        FileInputStream file = new FileInputStream("input.inp");
          // Biến s dùng để lưu giá trị byte đọc được từ tệp
        int s;
        // Đọc từng byte từ tệp và in ra màn hình
        while ((s=file.read())!=-1) {
            System.out.print(Character.toChars(s));
        }
    }
    public static void main(String[] args) throws Exception{
        new Main();
    }
}