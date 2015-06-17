
package io.square1.richtextlib.style;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class SubscriptSpan extends MetricAffectingSpan implements P2ParcelableSpan {

    public static final Parcelable.Creator<SubscriptSpan> CREATOR  = P2ParcelableCreator.get(SubscriptSpan.class);

    public static final int TYPE = 8;

    @Override
    public int getType() {
        return TYPE;
    }

    public SubscriptSpan() {
    }
    
    public SubscriptSpan(Parcel src) {
    }
    

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        P2ParcelUtils.writeType(dest,this);
    }


    @Override
    public void updateDrawState(TextPaint tp) {
        tp.baselineShift -= (int) (tp.ascent() / 2);
    }

    @Override
    public void updateMeasureState(TextPaint tp) {
        tp.baselineShift -= (int) (tp.ascent() / 2);
    }

    @Override
    public void readFromParcel(Parcel src) {

    }
}
