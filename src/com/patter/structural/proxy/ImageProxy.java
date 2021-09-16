package com.patter.structural.proxy;

public class ImageProxy implements Image {
	
	private HighResolutionImage highResolutionImage;
	
	
	public ImageProxy(HighResolutionImage highResolutionImage) {
		super();
		this.highResolutionImage = highResolutionImage;
	}

	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		while(!highResolutionImage.isLoad()) {
			try {
				System.out.println("Temp Image " + highResolutionImage.getWidth() + " " + highResolutionImage.getHeight());
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		highResolutionImage.showImage();
	}

}
