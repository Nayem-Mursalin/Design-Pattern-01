
public class client {

     public static void main(String[] args) {
        file file1 = new file(500);
        file file2 = new file(50);
        file file3 = new file(5000);

        directory directory1 = new directory("Documents");
        directory1.addComponent(file_1);
        directory1.addComponent(file_3);

        directory directory2 = new directory("Pictures");
        directory2.addComponent(file_2);

        directory rootDirectory = new directory("Root");
        rootDirectory.addComponent(directory_1);
        rootDirectory.addComponent(directory_2);

       System.out.println(rootDirectory.fileSize());
    }
}