package test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 13:10
 * JavaSE_20171
 */
public class Test {

    private static final String PREFIX = "<html><head><style>*{margin:0}i{display:inline-block;width:1px;height:1px;}</style></head><body><table>";
    private static final String SUFFIX = "</table></body></html>";

    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("doc/bw1.jpg"));
        Set<String> strings = new HashSet<>();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("doc/bw1.html"))) {
            bufferedWriter.write(PREFIX);
            for (int i = 0; i < bufferedImage.getHeight(); i++) {
                bufferedWriter.write("<p>");
                for (int j = 0; j < bufferedImage.getWidth(); j++) {
                    bufferedWriter.write(getBackgroundColorStyle(new Color(bufferedImage.getRGB(j, i))));
                    strings.add(getBackgroundColorStyle(new Color(bufferedImage.getRGB(j, i))));
                }
                bufferedWriter.write("</p>");
            }
            bufferedWriter.write(SUFFIX);
            System.out.println(strings.size());
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }

    private static String getBackgroundColorStyle(Color color) {
        String colorHex = "#" + getHexColor(color.getRed()) + getHexColor(color.getGreen()) + getHexColor(color.getBlue());
        return "<i style='background:" + colorHex + "'></i>";

    }

    private static String getHexColor(int rgb) {
        String rawHexString = Integer.toHexString(rgb);
        String pattern = "(([0-9a-f])\\2){3}";
        String hexString = (rawHexString.length() == 2) ? rawHexString : "0" + rawHexString;
        if (hexString.matches(pattern)) {
            hexString = "" + hexString.charAt(0) + hexString.charAt(2) + hexString.charAt(4);
        }
        return hexString;
    }
}
