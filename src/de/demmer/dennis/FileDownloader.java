package de.demmer.dennis;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileDownloader {
	
	
	private List<TextHandler> textHandlers;
	
	
	public FileDownloader() {
		textHandlers = new ArrayList<TextHandler>(); 
	}
	
	
	public void registerTextHandler(TextHandler textHandler) {
		textHandlers.add(textHandler);
	}
	
	
	public String downloadTextFile(String url) throws IOException {
		File file = new File("text.txt");
		FileUtils.copyURLToFile(new URL(url), file, 20000, 20000);
		
		String text = FileUtils.readFileToString(file,"UTF-8");
		
		for (TextHandler textHandler : textHandlers) {
			text = textHandler.callback(text);
		}
	
		return text;
	}
	
	

}
