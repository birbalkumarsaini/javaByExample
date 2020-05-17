package com.celebal;

import com.github.sarxos.webcam.Webcam;

public class WebCamStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Webcam webcam = Webcam.getDefault();
		if (webcam != null) {
			System.out.println("Webcam: " + webcam.getName());
		} else {
			System.out.println("No webcam detected");
		}
		}catch(Exception ce) {
			ce.printStackTrace();
		}
	}

}
