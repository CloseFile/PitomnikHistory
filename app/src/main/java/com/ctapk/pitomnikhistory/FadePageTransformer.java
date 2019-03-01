package com.ctapk.pitomnikhistory;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

class FadePageTransformer implements ViewPager.PageTransformer {



    @Override
    public void transformPage(View view, float position) {
        if (position <= -1.0F || position >= 1.0F) {
            view.setTranslationX(view.getWidth() * position);
            view.setAlpha(0.0F);
        } else if (position == 0.0F) {
            view.setTranslationX(view.getWidth() * position);
            view.setAlpha(1.0F);
        } else {
            // position is between -1.0F & 0.0F OR 0.0F & 1.0F
            view.setTranslationX(view.getWidth() * -position);
            view.setAlpha(1.0F - Math.abs(position));
        }
    }
}

//        //wokin with glitch
////            view.setAlpha(1 - Math.abs(position));
////            if (position < 0) {
////                view.setScrollX((int)((float)(view.getWidth()) * position));
////            } else if (position > 0) {
////                view.setScrollX(-(int) ((float) (view.getWidth()) * -position));
////            } else {
////                view.setScrollX(0);
////            }
//
//    }

//    private static final float MIN_SCALE = 0.75f;
//    @Override
//    public void transformPage(View view, float position) {
//        if (position <= 0f) {
//            view.setTranslationX(0f);
//            view.setScaleX(1f);
//            view.setScaleY(1f);
//        } else if (position <= 1f) {
//            final float scaleFactor = MIN_SCALE + (1 - MIN_SCALE) * (1 - Math.abs(position));
//            view.setAlpha(1 - position);
//            view.setPivotY(0.5f * view.getHeight());
//            view.setTranslationX(view.getWidth() * -position);
//            view.setScaleX(scaleFactor);
//            view.setScaleY(scaleFactor);
//        }
//    }