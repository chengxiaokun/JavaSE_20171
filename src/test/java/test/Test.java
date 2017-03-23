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
        String red = Integer.toHexString(color.getRed());
        red = (red.length() == 2) ? red : "0" + red;
        String green = Integer.toHexString(color.getGreen());
        green = (green.length() == 2) ? green : "0" + green;
        String blue = Integer.toHexString(color.getBlue());
        blue = (blue.length() == 2) ? blue : "0" + blue;
        String pattern = "(([0-9a-f])\\2){3}";
        String hexColor = red + green + blue;
        if (hexColor.matches(pattern)) {
            hexColor = "" + hexColor.charAt(0) + hexColor.charAt(2) + hexColor.charAt(4);
        }
        hexColor = "#" + hexColor;
        return "<i style='background:" + hexColor + "'></i>";

    }
}
