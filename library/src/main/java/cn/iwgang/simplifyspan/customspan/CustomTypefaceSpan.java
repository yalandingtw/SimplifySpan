package cn.iwgang.simplifyspan.customspan;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/**
 * Created by Yalan Ding on 2018/12/27.
 */
public class CustomTypefaceSpan extends MetricAffectingSpan implements ParcelableSpan {
    private final Typeface mTypeface;

    public CustomTypefaceSpan(Typeface mTypeface) {
        this.mTypeface = mTypeface;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        if (mTypeface != null)
            applyCustomTypeFace(tp, mTypeface);
    }

    @Override
    public void updateMeasureState(TextPaint p) {
        if (mTypeface != null)
            applyCustomTypeFace(p, mTypeface);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    @Override
    public int getSpanTypeId() {
        return getSpanTypeIdInternal();
    }

    /** @hide */
    public int getSpanTypeIdInternal() {
        return 733;
    }

    private static void applyCustomTypeFace(Paint paint, Typeface tf) {
        paint.setTypeface(tf);
    }

}
