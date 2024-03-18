import java.io.File;
import java.util.Scanner;

public class Dolonfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn từ người dùng
        System.out.print("Nhập đường dẫn của file: ");

        String filePath = scanner.nextLine();

        // Tạo một đối tượng File từ đường dẫn đã nhập
        File file = new File(filePath);
        // Kiểm tra xem file có tồn tại không
        if (file.exists() && file.isFile()) {
            long fileSize = file.length();
            System.out.println(fileSize + " byte");
        } else {
            System.out.println("Hổng phải là file");
        }
}}
