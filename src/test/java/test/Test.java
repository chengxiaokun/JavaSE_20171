package test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 13:10
 * JavaSE_20171
 */
public class Test {

    private static final String PREFIX = "<html><head><style>table{border-collapse:collapse;}</style></head><body><table>";
    private static final String SUFFIX = "</table></body></html>";

    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("doc/1.jpg"));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("doc/map.html"))) {
            bufferedWriter.write(PREFIX);
            for (int i = 0; i < bufferedImage.getHeight(); i++) {
                bufferedWriter.write("<tr>");
                for (int j = 0; j < bufferedImage.getWidth(); j++) {
                    bufferedWriter.write(getBackgroundColorStyle(new Color(bufferedImage.getRGB(j, i))));
                }
                bufferedWriter.write("</tr>");
            }
            bufferedWriter.write(SUFFIX);
        }
    }

    private static String getBackgroundColorStyle(Color color) {
        return "<td style='background:rgb(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")'></td>";
    }
}
