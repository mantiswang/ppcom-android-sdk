package com.ppmessage.sdk.core.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by ppmessage on 5/12/16.
 */
public interface IImageLoader {

    interface Callback {
        void onSuccess();
        void onError();
    }

    @Nullable Bitmap inMemory(String imageUri, int width, int height);

    @Nullable File imageFile(String imageUri);

    void loadImage(String imageUri, ImageView target);

    void loadImage(String imageUri, int width, int height, ImageView target);

    void loadImage(String imageUri, int width, int height, int placeHolder, ImageView target);

    void loadImage(String imageUri, int width, int height, Drawable placeHolder, ImageView target);

    void loadImage(String imageUri, int width, int height, Drawable placeHolder, ImageView target, Callback callback);

    void loadImage(String imageUri, int width, int height, boolean asGif, Drawable placeHolder, ImageView target, Callback callback);

    void clearMemory();

}
