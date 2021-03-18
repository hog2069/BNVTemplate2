package com.hog2020.bnvtemplate2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Tab2Fragment extends Fragment {

    TabLayout tabLayout;
    ViewPager pager;
    Tab2PagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab2,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //여기서 xml 의 뷰들을 findView 에 대한 find 참조
        tabLayout= view.findViewById(R.id.layout_tab);
        pager =view.findViewById(R.id.pager);
        pagerAdapter= new Tab2PagerAdapter(getFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pager.setAdapter(pagerAdapter);

        //텝레이아웃과 연동 하기
        tabLayout.setupWithViewPager(pager);
    }
}
