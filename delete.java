import java.io.File;
import java.util.Scanner;

public class delete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn từ người dùng
        System.out.print("Nhập đường dẫn của file hoặc thư mục cần xóa: ");

        String pathToDelete = scanner.nextLine();

        // Tạo một đối tượng File từ đường dẫn đã nhập
        File filedelete = new File(pathToDelete);

        // Kiểm tra xem file có tồn tại không
        if (filedelete.exists() ) {
            if  (filedelete.isDirectory()){
               
                deleteDirectory(filedelete);
            }else{
                deleteFile(filedelete);
            }
            
        } else {
            System.out.println("Hổng có file hoặc thư mục nha");
        }
        scanner.close();
    }

     // Hàm này để xóa thư mục
     private static void deleteDirectory(File directory) {
        // Lấy danh sách các tệp và thư mục trong thư mục đó
        File[] files = directory.listFiles();
        if (files != null) {
            // Xóa từng tệp hoặc thư mục trong thư mục
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file); // Đệ quy để xóa thư mục con
                } else {    
                    deleteFile(file); // Xóa tệp
                }
            }
        }
        // Xóa thư mục sau khi đã xóa tất cả các tệp và thư mục con
        if (!directory.delete()) {
            System.out.println("Không thể xóa thư mục: " + directory.getAbsolutePath());
        } else {
            System.out.println("Đã xóa thư mục: " + directory.getAbsolutePath());
        }
    }

     // Hàm này để xóa file
     private static void deleteFile(File file) {
        // Xóa file
        if (!file.delete()) {
            System.out.println("Không thể xóa file: " + file.getAbsolutePath());
        } else {
            System.out.println("Đã xóa file: " + file.getAbsolutePath());
        }
    }
}


