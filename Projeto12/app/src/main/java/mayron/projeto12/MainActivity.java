package mayron.projeto12;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager vp;

    private int white = Color.argb(255,255,255,255);
    private int green = Color.argb(255,111,255,4);
    private int pink = Color.argb(255,255,0,210);
    private int blue = Color.argb(255,63,81,181);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        vp = (ViewPager) findViewById(R.id.viewPager);

        vp.setAdapter(new FragAdapter(this, getSupportFragmentManager()));
        tabLayout.setupWithViewPager(vp);



        tabLayout.setTabTextColors(white, green);
        tabLayout.setSelectedTabIndicatorColor(green);

        vp.setCurrentItem(0);

    }
}
