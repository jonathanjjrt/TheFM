package com.thecrazylab.ux.thefm.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.IntegerRes;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by federica on 25/01/16.
 */
public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {

    //La medida en pixeles del espacio
    private int mItemOffset;

    public ItemOffsetDecoration(Context contexto, @IntegerRes int integerResId){

     int itemOffsetDp = contexto.getResources().getInteger(integerResId);
        mItemOffset = convertToPixels(itemOffsetDp, contexto.getResources().getDisplayMetrics());
                //contexto.getResources().getDisplayMetrics().densityDpi
    }

    public int convertToPixels(int offsetDp, DisplayMetrics metrics){

        return offsetDp * (metrics.densityDpi / 160);

    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(mItemOffset, mItemOffset, mItemOffset, mItemOffset);
    }
}
