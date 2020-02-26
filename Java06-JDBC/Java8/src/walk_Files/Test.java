package walk_Files;

import java.awt.Image;
import java.io.File;
import java.io.IOException;import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.ImageIcon;

public class Test {

    private static String directoryAvatar = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lesson19\\src\\main\\java\\image";

	
	public static void main(String[] args) {
		getImage(directoryAvatar+"\\team1","avatar.jpg");
	}
	
	public static void getWalk(String path) {
		try {
			
			Stream<Path> files = Files.walk(Paths.get(path));
			files.filter(t->t.toString().endsWith(".jpg")).map(t->t.getFileName()).forEach(System.out::println);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public void test (String path) {
		
		try {
            List<Image> images = new ArrayList<Image>();
            
            Files.walk(Paths.get(path)).map(t-> new ImageIcon(t.toString()).getImage()).collect(Collectors.toList());
        } catch (IOException ex) {
            
        }
	}
	
	 public static void getImage(String pathDir,String name){
	        Image image = null;
	        if(pathDir == null || pathDir.isEmpty() ||name == null || name.isEmpty()){
	            //return null;
	        	System.out.println("null1");
	        }else{
	            try {
	                Files.walk(Paths.get(pathDir)).map(t->t.getFileName().toString()).filter(t->t.equals("avatar.jpg")).forEach(System.out::println);  
	        } catch (IOException ex) {
	            
	        }
	        }
	        
	    }
}
