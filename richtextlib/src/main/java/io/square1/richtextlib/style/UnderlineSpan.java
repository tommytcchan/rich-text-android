package io.square1.richtextlib.style;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public class UnderlineSpan extends CharacterStyle implements UpdateAppearance, P2ParcelableSpan {

 public static final Parcelable.Creator<UnderlineSpan> CREATOR  = P2ParcelableCreator.get(UnderlineSpan.class);

   public static final int TYPE = 12;

   @Override
   public int getType() {
      return TYPE;
   }

    public UnderlineSpan() {
    }
    
    public UnderlineSpan(Parcel src) {
        readFromParcel(src);
    }

    
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        P2ParcelUtils.writeType(dest,this);
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(true);
    }

    @Override
    public void readFromParcel(Parcel src) {

    }
}
