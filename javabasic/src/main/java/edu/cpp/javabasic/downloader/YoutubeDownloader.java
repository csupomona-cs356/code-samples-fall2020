package edu.cpp.javabasic.downloader;

public class YoutubeDownloader implements IVideoDownloader {

	@Override
	public void downloadVideo(String url) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		YoutubeDownloader td = new YoutubeDownloader();
		td.downloadVideo("hhh");
	}

	
}
