package test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 13:10
 * JavaSE_20171
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("doc/1.png"));
        int[][] matrix = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];

//        for (int i = 0; i < bufferedImage.getWidth(); i++) {
//            for (int j = 0; j < bufferedImage.getHeight(); j++) {
//                System.out.print(bufferedImage.getRGB(i, j) + "\t");
//            }
//            System.out.println();
//        }

        Color color = new Color(bufferedImage.getRGB(0, 0));
        System.out.println(getBackgroundColorStyle(color));

    }

    private static String getBackgroundColorStyle(Color color) {
        return "style='background:rgb(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "')";
    }
}
