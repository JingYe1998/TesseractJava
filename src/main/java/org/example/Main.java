package org.example;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {
    public static void main(String[] args) throws TesseractException {

//        System.setProperty("java.library.path", "/usr/local/Cellar/tesseract/5.3.4");

        // 設定Tesseract的設定，例如語言
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/usr/local/Cellar/tesseract/5.3.4/share/tessdata/");
//        tesseract.setLanguage("eng"); // 使用英文語言
        tesseract.setLanguage("chi_tra"); // 使用中文語言

        try {
            // 讀取圖片檔
//            File imageFileEng = new File("/Users/Jean/IdeaProjects/Tesseract/src/main/java/org/example/english.png");
            File imageFileChi = new File("/Users/Jean/IdeaProjects/Tesseract/src/main/java/org/example/chinese.png");

            // 進行文字辨識
//            String resultEng = tesseract.doOCR(imageFileEng);
            String resultChi = tesseract.doOCR(imageFileChi);

            // 印出辨識結果
//            System.out.println("英文辨識結果: \n" + resultEng);
            System.out.println("中文辨識結果: \n" + resultChi);

        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}