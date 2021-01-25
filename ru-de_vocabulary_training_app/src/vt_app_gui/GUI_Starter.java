package vt_app_gui;

import javax.swing.*;
//import Vocabulary_Training_RU-DE.src.Dictionary_Backend;

public class GUI_Starter {

	public static void main (String[] args) {
		//Dictionary dictionary = Dictionary_backend.getDictionary();
		JFrame hauptFrame = new DictFrame();
		hauptFrame.setVisible(true);
	}
}