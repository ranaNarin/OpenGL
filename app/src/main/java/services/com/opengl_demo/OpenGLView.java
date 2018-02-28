package services.com.opengl_demo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by narinder on 28/02/18.
 */

public class OpenGLView extends GLSurfaceView {

    public OpenGLView(Context context) {
        super(context);
        init();
    }

    public OpenGLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setRenderer(new OpenGLRenderer());
    }


}
