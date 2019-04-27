package com.ctapk.pitomnikhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPage = getArguments().getInt(ARG_PAGE);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_page, container, false);
        //        TextView textView = (TextView) view;
//        textView.setText("Fragment #" + mPage);


        ImageFilterView imageFilterView = view.findViewById(R.id.pitomnik_iv);
        TextView textView = view.findViewById(R.id.about_content_tv);
        if (mPage == 1) {
            textView.setText(R.string.lukashev1);
            imageFilterView.setImageResource(R.drawable.lukashev);
        } else if (mPage == 2) {
            textView.setText(R.string.halfcenter);
            imageFilterView.setImageResource(R.drawable.lukashev1);
        } else if (mPage == 3) {
            textView.setText(R.string.large_text_3);
            imageFilterView.setImageResource(R.drawable.timoshin_color);
        } else if (mPage == 4) {
            textView.setText(R.string.large_text_4);
            imageFilterView.setImageResource(R.drawable.swiming);
        } else if (mPage == 5) {
            textView.setText(R.string.large_text_5);
            imageFilterView.setImageResource(R.drawable.shkolniky);
        }else if (mPage == 6) {
            textView.setText(R.string.nitins);
            imageFilterView.setImageResource(R.drawable.koteji);
        } else if (mPage == 7) {
            textView.setText(R.string.garbage);
            imageFilterView.setImageResource(R.drawable.musor);
        } else if (mPage == 8) {
            textView.setText(R.string.now);
            imageFilterView.setImageResource(R.drawable.best);
        }

//        view.findViewById(R.id.btn_info).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MotionLayout motionLayout=view.findViewById(R.id.motionLayout);
//                if (motionLayout.getProgress() > 0.5f) {
//                    motionLayout.transitionToStart();
//                } else {
//                    motionLayout.transitionToEnd();
//                }
//            }
//        });

        return view;
    }

}