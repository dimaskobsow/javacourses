package lesson18;
//проект по работе с загрузками
import java.io.File;
import java.io.FileFilter;

public class Main4 {
    public static void main(String[] args) {

        File dir = new File("/Users/dimaskobsow1508gmail.com/Downloads");
        //File[] filesInDownload = dir.listFiles();// показывает католог в загрузках
        File[] filesInDownload = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                if(pathname.getName().endsWith("png")||
                        pathname.getName().endsWith("jpg")||
                        pathname.getName().endsWith("jpeg")||
                        pathname.getName().endsWith("sweg")){
                    return true;
                }
                return false;
            }
        });

        for(File f:filesInDownload){
            System.out.println(f.getAbsolutePath());
        }


    }
}
