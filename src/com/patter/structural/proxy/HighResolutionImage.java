package com.patter.structural.proxy;

import java.net.URL;

public class HighResolutionImage implements Image {

	private URL imageURL;
	
	private long startTime;
	
	private int height;
	
	private int width;
	
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	
	public HighResolutionImage(URL imageURL) {
		super();
		this.imageURL = imageURL;
		this.startTime = System.currentTimeMillis();
		this.height = 600;
		this.width = 600;
	}

	public boolean isLoad() {
		long endTime = System.currentTimeMillis();
		return endTime - startTime > 3000;
	}
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		System.out.println("Real Image " + imageURL);
	}

}
