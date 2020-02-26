package homeworks;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

public class Ex01 {

	public static void main(String[] args) {

		createdData();
		move(new File("garbage"), new File("garbage" + "\\" + DirEnum.system), ExtensionEnum.bat);
		move(new File("garbage"), new File("garbage" + "\\" + DirEnum.image), ExtensionEnum.png, ExtensionEnum.jpeg,
				ExtensionEnum.jpg);
		move(new File("garbage"), new File("garbage" + "\\" + DirEnum.music), ExtensionEnum.mp3, ExtensionEnum.mp4);
		copy(new File("garbage"), new File("garbage" + "\\" + DirEnum.coding), ExtensionEnum.java);
		delete(new File("garbage"), ExtensionEnum.txt);

	}
    // Các hàm phía dưới đều làm việc để làm việc với nhiều extention
	public static void move(File oldDirectory, File newDirectory, ExtensionEnum... extensions) {
		for (ExtensionEnum extension : extensions) {
			File[] listFile = oldDirectory.listFiles(t -> t.getName().endsWith("." + extension));
			for (File file : listFile) {
				try {
					String pathObject = newDirectory.getCanonicalPath() + "\\" + file.getName();
					File fileObject = new File(pathObject);
					Files.move(file.toPath(), fileObject.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void delete(File currentDirectory, ExtensionEnum... extensions) {
		for (ExtensionEnum extension : extensions) {
			File[] listFile = currentDirectory.listFiles(t -> t.getName().endsWith("." + extension));
			for (File file : listFile) {
				try {
					Files.delete(file.toPath());;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void copy(File oldDirectory, File newDirectory, ExtensionEnum... extensions) {
		for (ExtensionEnum extension : extensions) {
			File[] listFile = oldDirectory.listFiles(t -> t.getName().endsWith("." + extension));
			for (File file : listFile) {
				try {
					String pathObject = newDirectory.getCanonicalPath() + "\\" + file.getName();
					File fileObject = new File(pathObject);
					Files.copy(file.toPath(), fileObject.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static boolean createdDirectory(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			return dir.mkdirs();
		}
		return false;
	}

	public static void createdFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void createdData() {
		DirEnum[] dirEnums = DirEnum.values();
		ExtensionEnum[] extensionEnums = ExtensionEnum.values();

		for (DirEnum dir : dirEnums) {
			String parentpath = "garbage" + "\\" + dir;
			System.out.println(createdDirectory(parentpath));
		}
		for (int i = 0; i < 20; i++) {
			Random rd = new Random();
			int indexRamdom = rd.nextInt(extensionEnums.length);
			String path = "garbage" + "\\" + System.currentTimeMillis() + "." + extensionEnums[indexRamdom];
			createdFile(path);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
