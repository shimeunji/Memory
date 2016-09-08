package com.example.android.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by appcreator37 on 2016. 9. 6..
 */
public class FriendsFragment extends Fragment{

    ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9;
    FragmentManager manager;
    FragmentTransaction tran;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_friends,container,false);

        i1=(ImageButton)view.findViewById(R.id.img1);
        i1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img1:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i2=(ImageButton)view.findViewById(R.id.img2);
        i2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img2:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i3=(ImageButton)view.findViewById(R.id.img3);
        i3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img3:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i4=(ImageButton)view.findViewById(R.id.img4);
        i4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img4:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i5=(ImageButton)view.findViewById(R.id.img5);
        i5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img5:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i6=(ImageButton)view.findViewById(R.id.img6);
        i6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img6:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i7=(ImageButton)view.findViewById(R.id.img7);
        i7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img7:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i8=(ImageButton)view.findViewById(R.id.img8);
        i8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img8:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i9=(ImageButton)view.findViewById(R.id.img9);
        i9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.img9:
                        tran=manager.beginTransaction();
                        Fragment frag=new FriendsFragment();
                        tran.replace(R.id.friends,frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });

        return view;
    }

}
