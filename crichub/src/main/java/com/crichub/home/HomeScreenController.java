package com.crichub.home;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;

@Controller
public class HomeScreenController {
    /**
     * HOME画面を描画する
     */
    public void showHomeScreen() throws IOException, UnsupportedOperationException{
        File homeScreenHtmlFile = new File("resources/templates/HomeScreen.html");
        // デフォルトのブラウザでHTMLファイルを開く
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(homeScreenHtmlFile.toURI());
        } else {
            System.err.println("Desktop is not supported. Cannot open the file.");
        }
        
    }
}
