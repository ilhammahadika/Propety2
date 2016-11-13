package com.example.zeilin.myapplication;

        import android.content.Context;
        import android.support.v4.view.LayoutInflaterCompat;
        import android.support.v4.view.PagerAdapter;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

/**
 * Created by ilham on 14/11/2016.
 */

public class SwipeAdapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.p0, R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4};
    private int[] teks_resources = {R.string.k0, R.string.k1, R.string.k2, R.string.k3, R.string.k4};
    private int[] mak_resources = {R.string.m0, R.string.m1, R.string.m2, R.string.m3, R.string.m4};
    private Context ctx;
    private LayoutInflater inflater;

    public SwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = inflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_pager);
        TextView textView = (TextView) item_view.findViewById(R.id.teksBgn);
        TextView textView1 = (TextView) item_view.findViewById(R.id.teksKet);
        imageView.setImageResource(image_resources[position]);

        textView1.setText(teks_resources[position]);
        textView.setText(mak_resources[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
