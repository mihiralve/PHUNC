package org.psiada.app.phunc;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by mihir on 3/6/2018.
 */

public class ViewPagerAdapter extends PagerAdapter {
    Activity activity;
    String[] images;
    LayoutInflater inflater;

    public ViewPagerAdapter(Activity activity, String[] images) {
        this.activity = activity;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View sponsorView = inflater.inflate(R.layout.sponsor_logo, container, false);

        ImageView image;
        image = (ImageView)sponsorView.findViewById(R.id.sponsorLogo);

        DisplayMetrics dis = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dis);
        int height = dis.heightPixels;
        int width = dis.widthPixels;
        image.setMinimumHeight(height);
        image.setMinimumWidth(width);
        Glide.with(activity.getApplicationContext()).load(images[position]).into(image);
        container.addView(sponsorView);
        return sponsorView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((View) object);
    }
}
