package de.demmer.dennis;

import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		FileDownloader fileDownloader = new FileDownloader();
		
		fileDownloader.registerTextHandler(new TextHandler() {
			@Override
			public String callback(String string) {
				return string.toLowerCase();
			}
		});
		
		fileDownloader.registerTextHandler(new TextHandler() {
			@Override
			public String callback(String string) {
				return string.replaceAll("a|e|i|o|u", "");
			}
		});
		
		String text = "";
		
		try {
			text = fileDownloader.downloadTextFile("https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(text);
		
	}

}
