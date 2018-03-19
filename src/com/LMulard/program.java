package com.LMulard;

import java.io.File;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File.createTempFile("", null);
		} catch (Exception erreur) {
			// TODO: handle exception
			erreur.printStackTrace();
		}
	}

}
