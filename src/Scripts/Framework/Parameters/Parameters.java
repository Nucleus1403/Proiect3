package Scripts.Framework.Parameters;

public class Parameters implements IParameters {

    // The size in pixels for the main frame.
    private static final int MAINSCREANPIXELSIZE = 600;

    private static final int PIXELSIZE = 64;

    public int getMainPixelSize() {
        return MAINSCREANPIXELSIZE;
    }


    public int getPixelSize() {
        return PIXELSIZE;
    }
}
