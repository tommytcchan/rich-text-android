package io.square1.richtextlib.style;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public class BackgroundColorSpan extends CharacterStyle implements UpdateAppearance, P2ParcelableSpan {

    public static final int TYPE = 14;

    private int mColor;

    public static final Parcelable.Creator<BackgroundColorSpan> CREATOR  = P2ParcelableCreator.get(BackgroundColorSpan.class);

    public BackgroundColorSpan(int color) {
        mColor = color;
    }

    public BackgroundColorSpan(Parcel src) {
        readFromParcel(src);
    }

    public BackgroundColorSpan(){}

    
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        P2ParcelUtils.writeType(dest, this);
        dest.writeInt(mColor);
    }

    public int getBackgroundColor() {
        return mColor;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.bgColor = mColor;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @Override
    public void readFromParcel(Parcel src) {
        mColor = src.readInt();
    }
}