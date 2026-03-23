//Display all βiles of a given directory using File class

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program6 {
    public static void main(String[] args) {
        String dirPath = "."; 
        File dir = new File(dirPath);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Directory not found: " + dirPath);
            return;
        }

        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in directory: " + dirPath);
            return;
        }

        System.out.println("=== Files in Directory: " + dir.getAbsolutePath() + " ===");
        System.out.printf("%-5s %-30s %-10s %-20s\n", "No.", "File Name", "Type", "Last Modified");
        System.out.println("--------------------------------------------------------------------------");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        int count = 1;
        for (File f : files) {
            String type = f.isDirectory() ? "Directory" : "File";
            String lastModified = sdf.format(new Date(f.lastModified()));
            System.out.printf("%-5d %-30s %-10s %-20s\n", count++, f.getName(), type, lastModified);
        }
    }
}