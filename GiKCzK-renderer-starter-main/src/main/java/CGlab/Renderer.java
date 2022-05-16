package CGlab;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Renderer {

    public enum LineAlgo { NAIVE, DDA, BRESENHAM, BRESENHAM_INT; }

    private BufferedImage render;
    public final int h = 200;
    public final int w = 200;

    private String filename;
    private LineAlgo lineAlgo = LineAlgo.NAIVE;

    public Renderer(String filename) {
        render = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        this.filename = filename;
    }

    public void drawPoint(int x, int y) {
        int white = 255 | (255 << 8) | (255 << 16) | (255 << 24);
        render.setRGB(x, y, white);
    }

    public void drawLine(int x0, int y0, int x1, int y1, LineAlgo lineAlgo) {
        if(lineAlgo == LineAlgo.NAIVE) drawLineNaive(x0, y0, x1, y1);
        if(lineAlgo == LineAlgo.DDA) drawLineDDA(x0, y0, x1, y1);
        if(lineAlgo == LineAlgo.BRESENHAM) drawLineBresenham(x0, y0, x1, y1);
        if(lineAlgo == LineAlgo.BRESENHAM_INT) drawLineBresenhamInt(x0, y0, x1, y1);
    }

    public void drawLineNaive(int x0, int y0, int x1, int y1) {
        // TODO: zaimplementuj
    }

    public void drawLineDDA(int x0, int y0, int x1, int y1) {
        // TODO: zaimplementuj
    }

    public void drawLineBresenham(int x0, int y0, int x1, int y1) {
        // TODO: zaimplementuj
    }

    public void drawLineBresenhamInt(int x0, int y0, int x1, int y1) {
        // TODO: zaimplementuj
    }

    public void save() throws IOException {
        File outputfile = new File(filename);
        render = Renderer.verticalFlip(render);
        ImageIO.write(render, "png", outputfile);
    }

    public void clear() {
        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                int black = 0 | (0 << 8) | (0 << 16) | (255 << 24);
                render.setRGB(x, y, black);
            }
        }
    }

    public Vec3f barycentric(Vec2f A, Vec2f B, Vec2f C, Vec2f P) {

//                Vector v0 = b - a, v1 = c - a, v2 = p - a;


                Vec3f v1 = new Vec3f((A.x-B.x),(A.x-C.x),(P.x-A.x));// tutaj potrzebujemy wektora składającego się ze współrzędnych


                // x wektorów AB, AC ora PA.

                Vec3f v2 = new Vec3f((A.y-B.y),(A.y-C.y),(P.y-A.y));// tutaj potrzebujemy wektora składającego się ze współrzędnych
                // y wektorów AB, AC ora PA.

                Vec3f cross = // iloczyn wektorowy v1 i v2. Wskazówka: zaimplementuj do tego oddzielną metodę

                        //A→×B→=(a2b3−a3b2;a3b1−a1b3;a1b2−a2b1)

//                Vec2f uv = // wektor postaci: cross.x / cross.z, cross.y / cross.z
//
//
//                Vec3f barycentric = // współrzędne barycentryczne, uv.x, uv.y, 1- uv.x - uv.y

////|\overrightarrow{AB}|=\sqrt{(x_B-x_A)^2+(y_B-y_A)^2}
//
//       // return barycentric;
//    }
//    public static int cross(Vec2f a, Vec2f b){
//
//        return ;
//    }


    public void drawTriangle(Vec2f A, Vec2f B, Vec2f C) {
        // dla każdego punktu obrazu this.render:
        //      oblicz współrzędne baryc.
        //      jeśli punkt leży wewnątrz, zamaluj (patrz wykład)
    }

        public void drawLineBresenham(int x0, int y0, int x1, int y1) {
            int white = 255 | (255 << 8) | (255 << 16) | (255 << 24);

            int dx = x1-x0;
            int dy = y1-y0;
            float derr = Math.abs(dy/(float)(dx));
            float err = 0;

            int y = y0;

            for (int x=x0; x<=x1; x++) {
                render.setRGB(x, y, white);
                err += derr;
                if (err > 0.5) {
                    y += (y1 > y0 ? 1 : -1);
                    err -= 1.;
                }
            } // Oktanty:
        }

    public static BufferedImage verticalFlip(BufferedImage img) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage flippedImage = new BufferedImage(w, h, img.getColorModel().getTransparency());
        Graphics2D g = flippedImage.createGraphics();
        g.drawImage(img, 0, 0, w, h, 0, h, w, 0, null);
        g.dispose();
        return flippedImage;
    }

        public void drawTriangle(Vec2i A, Vec2i B, Vec2i C, int rgb) {
            int[] bounds = bbox(A, B, C);
            for(int x = bounds[0]; x < bounds[1]; x++) {
                for(int y = bounds[2]; y < bounds[3]; y++) {
                    Vec2i P = new Vec2i(x, y);
                    Vec3f bc = barycentric(A, B, C, P);
                    float z = //policz wspołrzędną z dla punktu jako interpolację
//współrzędnych z wierzchołków ABC z wspórzędnymi barycentrycznymi
                    if(bc.x() >= 0 && bc.x() <= 1 && bc.y() >= 0 && bc.y() <= 1 && bc.z() >= 0 && bc.z() <= 1) {
//jesli wspórzedna z w buforze jest mniejsza niż nasze z
// (im mniejsza tym dalej, oś -z jest "za ekran") to:
                        {
                            render.setRGB(x, y, rgb);
// ustaw zbuffer(x,y) = z;
                        }
                    }
                }
            }
        }
}
