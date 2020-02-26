

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Directory {
	IMAGE("image", ".jpg"), MUSIC("music", ".mp3"), SYSTEM("system", ".bat"), CODING("coding", ".java"),
	TEXT("text", ".txt");

	String name;
	String extention;

	private Directory(String name, String extention) {
		this.name = name;
		this.extention = extention;
	}

	public String getExtention() {
		return extention;
	}

	public String getName() {
		return name;
	}
}

public class aaa {
	public static void main(String[] args) {

		String[] pathsFile = new String[4]; // mảng lưu các path của các file
		String root = "garbage";
		File garbage = new File(root);// tạo file gốc garbage
		boolean isDir = garbage.mkdirs();
		int lengthOfEnum = Directory.values().length; // lấy độ dài của enum
		String[] pathsFolder = new String[lengthOfEnum - 1]; // tạo mảng lưu các path của các folder
		if (isDir) {
			// Tạo folder
			for (int i = 0; i < lengthOfEnum; i++) {
				Directory dir = Directory.values()[i];
				if (dir != Directory.TEXT) {
					pathsFolder[i] = root + File.separator + dir.getName();
					createNewDirectory(pathsFolder[i]);
				}
				for (int j = 0; j < pathsFile.length; j++) {
					pathsFile[j] = System.currentTimeMillis() + dir.getExtention();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				createNewFile(root, pathsFile);
			}

			/// thao tác với file và thư mục
			File[] files = garbage.listFiles();

			List<String> fileName = Arrays.stream(files).filter(f -> f.isFile()).map(File::getPath)
					.collect(Collectors.toList());
			List<String> imgName = fileName.stream().filter(f -> f.endsWith(".jpg")).collect(Collectors.toList());
			List<String> codeName = fileName.stream().filter(f -> f.endsWith(".java")).collect(Collectors.toList());
			List<String> musicName = fileName.stream().filter(f -> f.endsWith(".mp3")).collect(Collectors.toList());
			List<String> systemName = fileName.stream().filter(f -> f.endsWith(".bat")).collect(Collectors.toList());
			List<String> textName = fileName.stream().filter(f -> f.endsWith(".txt")).collect(Collectors.toList());

			for (String pathFolder : pathsFolder) {
				if (pathFolder.endsWith(Directory.IMAGE.getName())) {
					moveFiles(pathFolder, imgName);
				}
				if (pathFolder.endsWith(Directory.MUSIC.getName())) {
					moveFiles(pathFolder, musicName);
				}
				if (pathFolder.endsWith(Directory.SYSTEM.getName())) {
					moveFiles(pathFolder, systemName);
				}
				if (pathFolder.endsWith(Directory.CODING.getName())) {
					copyFiles(pathFolder, codeName);
				}
			}

			for (String name : textName) {
				File file = new File(name);
				file.delete();
			}
		}
	}

	private static void createNewFile(String parent, String... paths) {
		for (String path : paths) {
			File file = new File(parent, path);
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createNewDirectory(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	private static void moveFiles(String folder, List<String> files) {

		for (String file : files) {
			File source = new File(file);
			File target = new File(folder + File.separatorChar + source.getName());
			try {
				Path path = Files.move(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void copyFiles(String folder, List<String> files) {

		for (String file : files) {
			File source = new File(file);
			File target = new File(folder + File.separatorChar + source.getName());
			try {
				Path path = Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}