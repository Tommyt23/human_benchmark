package Java;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;

class PixelColourCapture{
    public static void main(String[] args) {
        try{
            Robot robot = new Robot();

            int x = 249;
            int y = 301;

            int targetRed = 75;
            int targetGreen = 219;
            int targetBlue = 106;

            for(int i = 0; i < 5;)
                while(true){
                    BufferedImage screencapture = robot .createScreenCapture(new Rectangle(x, y, 1, 1));

                    Color pixelColor = new Color(screencapture.getRGB(0, 0));

                    if(pixelColor.getRed() == targetRed && pixelColor.getGreen() == targetGreen && pixelColor.getBlue() == targetBlue){
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    }
                }
        } catch(AWTException e){
            e.printStackTrace();
        }
    }
}


