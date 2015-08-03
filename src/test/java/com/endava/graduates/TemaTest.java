package com.endava.graduates;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class TemaTest {

    @Test
    public void test() throws IOException {

        URL url=new URL("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQM5-4tH9AuoSiBE1edwzcRgwiG4DfGYrZ3uOT8DwX7SHZLOkDtLmh7x_VQ");
        BufferedImage img=ImageIO.read(url);
        System.out.println("Dimensiunea url: "+img.getWidth()+" "+img.getHeight());
        img=null;


        }
}

