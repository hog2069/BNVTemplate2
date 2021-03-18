package com.hog2020.bnvtemplate2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Tab3Fragment extends Fragment {

    ArrayList<Tab3Recycleritem> items= new ArrayList<>();
    RecyclerView recyclerView;
    Tab3RecyclerAdapter recyclerAdapter;

    ArrayList<Tab3Recycleritem> items2= new ArrayList<>();
    RecyclerView recyclerView2;
    Tab3RecyclerAdapter recyclerAdapter2;

    //프레그먼트가 처음 만들어 질때
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        loadData();
        return inflater.inflate(R.layout.fragment_tab3,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //여기서 xml 의 뷰들을 findView 에 대한 find 참조
        recyclerView= view.findViewById(R.id.recycler);
        recyclerAdapter= new Tab3RecyclerAdapter(getActivity(),items);
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView2= view.findViewById(R.id.recycler2);
        recyclerAdapter2= new Tab3RecyclerAdapter(getActivity(),items2);
        recyclerView2.setAdapter(recyclerAdapter2);
    }

    //서버에서 데이터를 불러들이는 메소드
    void loadData(){
        items.add(new Tab3Recycleritem());
        items.add(new Tab3Recycleritem());
        items.add(new Tab3Recycleritem());
        items.add(new Tab3Recycleritem());
        items.add(new Tab3Recycleritem());
        items.add(new Tab3Recycleritem());



        items2.add(new Tab3Recycleritem());
        items2.add(new Tab3Recycleritem());
        items2.add(new Tab3Recycleritem());
        items2.add(new Tab3Recycleritem());
        items2.add(new Tab3Recycleritem());
        items2.add(new Tab3Recycleritem());
    }
}
