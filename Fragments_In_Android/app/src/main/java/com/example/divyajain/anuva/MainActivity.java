package com.example.divyajain.anuva;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioGroup;


public class MainActivity extends FragmentActivity {
    private RadioGroup radioFragmentsGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioFragmentsGroup = (RadioGroup) findViewById(R.id.fragmentsName);
        radioFragmentsGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();

                switch(checkedId){
                    case R.id.firstFragment:
                        // do operations specific to this selection
                        FirstFragmentImageList fr = new FirstFragmentImageList();
                        fragmentTransaction.replace(R.id.country_fragment, fr);
                       // fragmentTransaction.add(R.id.frag)
                        fragmentTransaction.commit();



                        break;

                    case R.id.secondFragment:
                        // do operations specific to this selection
                        Fragment fr2 = new SecondFragmentNumberList();
                        fragmentTransaction.replace(R.id.country_fragment, fr2);
                        // fragmentTransaction.add(R.id.frag)
                        fragmentTransaction.commit();
                        break;

                    case R.id.thirdFragment:
                        Fragment fr3 = new ThirdFragmentNameList();
                        fragmentTransaction.replace(R.id.country_fragment, fr3);
                        fragmentTransaction.commit();
                        // do operations specific to this selection
                        break;

                }


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
