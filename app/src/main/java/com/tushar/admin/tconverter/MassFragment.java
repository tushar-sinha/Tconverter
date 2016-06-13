package com.tushar.admin.tconverter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MassFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    LinearLayout l1, l2, l3, l4, l5, l6, l7, l8;

    public MassFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView =inflater.inflate(R.layout.fragment_mass, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Mass");
        l1 = (LinearLayout)fragView.findViewById(R.id.layout1);
        l2 = (LinearLayout)fragView.findViewById(R.id.layout2);
        l3 = (LinearLayout)fragView.findViewById(R.id.layout3);
        l4 = (LinearLayout)fragView.findViewById(R.id.layout4);
        l5 = (LinearLayout)fragView.findViewById(R.id.layout5);
        l6 = (LinearLayout)fragView.findViewById(R.id.layout6);
        l7 = (LinearLayout)fragView.findViewById(R.id.layout7);
        l8 = (LinearLayout)fragView.findViewById(R.id.layout8);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv5 = (TextView) fragView.findViewById(R.id.txt5);
        tv6 = (TextView) fragView.findViewById(R.id.txt6);
        tv7 = (TextView) fragView.findViewById(R.id.txt7);
        tv8 = (TextView) fragView.findViewById(R.id.txt8);
        tv1.setText(Html.fromHtml("t"));
        tv2.setText(Html.fromHtml("g"));
        tv3.setText(Html.fromHtml("(L)t"));
        tv4.setText(Html.fromHtml("(S)t"));
        tv5.setText(Html.fromHtml("st"));
        tv6.setText(Html.fromHtml("lb"));
        tv7.setText(Html.fromHtml("oz"));
        tv8.setText(Html.fromHtml("oz t"));
        l1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l4.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l5.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l6.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l7.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l8.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et4 = (EditText) fragView.findViewById(R.id.edit4);
        et5 = (EditText) fragView.findViewById(R.id.edit5);
        et6 = (EditText) fragView.findViewById(R.id.edit6);
        et7 = (EditText) fragView.findViewById(R.id.edit7);
        et8 = (EditText) fragView.findViewById(R.id.edit8);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et1.addTextChangedListener(myTextWatcher);
                }
            }
        });
        et2.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et2.addTextChangedListener(myTextWatcher1);
                }
            }
        });
        et3.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et3.addTextChangedListener(myTextWatcher2);
                }
            }
        });
        et4.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et4.addTextChangedListener(myTextWatcher3);
                }
            }
        });
        et5.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et5.addTextChangedListener(myTextWatcher4);
                }
            }
        });
        et6.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et6.addTextChangedListener(myTextWatcher5);
                }
            }
        });
        et7.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et8.removeTextChangedListener(myTextWatcher7);
                    et7.addTextChangedListener(myTextWatcher6);
                }
            }
        });
        et8.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et7.removeTextChangedListener(myTextWatcher6);
                    et8.addTextChangedListener(myTextWatcher7);
                }
            }
        });


        return fragView;
    }
    protected TextWatcher myTextWatcher = new TextWatcher() {
        //bug-app crashes on starting with decimal.
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et1.setText("0.");
                et1.setSelection(et1.getText().length());
            }
            if (s.toString().length() > 0) {
                et2.setText("" + Double.parseDouble(et1.getText().toString()) * 1000000);
                et3.setText("" + Double.parseDouble(et1.getText().toString()) * 0.9842065);
                et4.setText("" + Double.parseDouble(et1.getText().toString()) * 1.102311);
                et5.setText("" + Double.parseDouble(et1.getText().toString()) * 157.473);
                et6.setText("" + Double.parseDouble(et1.getText().toString()) * 2204.623);
                et7.setText("" + Double.parseDouble(et1.getText().toString()) * 35273.96);
                et8.setText("" + Double.parseDouble(et1.getText().toString()) * 32150.75);
            } else{
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher1 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et2.setText("0.");
                et2.setSelection(et2.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et2.getText().toString()) * 0.000001);
                et3.setText("" + Double.parseDouble(et2.getText().toString()) * 0.0000009842065);
                et4.setText("" + Double.parseDouble(et2.getText().toString()) * 0.000001102311);
                et5.setText("" + Double.parseDouble(et2.getText().toString()) * 0.000157473);
                et6.setText("" + Double.parseDouble(et2.getText().toString()) * 0.002204623);
                et7.setText("" + Double.parseDouble(et2.getText().toString()) * 0.03527396);
                et8.setText("" + Double.parseDouble(et2.getText().toString()) * 0.03215075);
            } else {
                et1.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher2 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et3.setText("0.");
                et3.setSelection(et3.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et3.getText().toString()) * 1.016047);
                et2.setText("" + Double.parseDouble(et3.getText().toString()) * 1016047);
                et4.setText("" + Double.parseDouble(et3.getText().toString()) * 1.12);
                et5.setText("" + Double.parseDouble(et3.getText().toString()) * 160);
                et6.setText("" + Double.parseDouble(et3.getText().toString()) * 2240);
                et7.setText("" + Double.parseDouble(et3.getText().toString()) * 35840);
                et8.setText("" + Double.parseDouble(et3.getText().toString()) * 32666.67);
            } else {
                et1.setText("");
                et2.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher3 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et4.setText("0.");
                et4.setSelection(et4.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et4.getText().toString()) * 0.9071847);
                et2.setText("" + Double.parseDouble(et4.getText().toString()) * 907184.7);
                et3.setText("" + Double.parseDouble(et4.getText().toString()) * 0.8928571);
                et5.setText("" + Double.parseDouble(et4.getText().toString()) * 142.8571);
                et6.setText("" + Double.parseDouble(et4.getText().toString()) * 2000);
                et7.setText("" + Double.parseDouble(et4.getText().toString()) * 32000);
                et8.setText("" + Double.parseDouble(et4.getText().toString()) * 29166.67);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et5.setText("");
                et6.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher4 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et5.setText("0.");
                et5.setSelection(et5.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et5.getText().toString()) * 0.006350293);
                et2.setText("" + Double.parseDouble(et5.getText().toString()) * 6350.293);
                et3.setText("" + Double.parseDouble(et5.getText().toString()) * 0.00625);
                et4.setText("" + Double.parseDouble(et5.getText().toString()) * 0.007);
                et6.setText("" + Double.parseDouble(et5.getText().toString()) * 14);
                et7.setText("" + Double.parseDouble(et5.getText().toString()) * 224);
                et8.setText("" + Double.parseDouble(et5.getText().toString()) * 204.1667);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et6.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher5 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et6.setText("0.");
                et6.setSelection(et6.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et6.getText().toString()) * 0.0004535924);
                et2.setText("" + Double.parseDouble(et6.getText().toString()) * 453.5924);
                et3.setText("" + Double.parseDouble(et6.getText().toString()) * 0.0004464286);
                et4.setText("" + Double.parseDouble(et6.getText().toString()) * 0.0005);
                et5.setText("" + Double.parseDouble(et6.getText().toString()) * 0.07142857);
                et7.setText("" + Double.parseDouble(et6.getText().toString()) * 16);
                et8.setText("" + Double.parseDouble(et6.getText().toString()) * 14.58333);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et7.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher6 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et7.setText("0.");
                et7.setSelection(et7.getText().length());
            }
            if (s.toString().length() > 0) {
                et1.setText("" + Double.parseDouble(et7.getText().toString()) * 0.00002834952);
                et2.setText("" + Double.parseDouble(et7.getText().toString()) * 28.34952);
                et3.setText("" + Double.parseDouble(et7.getText().toString()) * 0.00002790179);
                et4.setText("" + Double.parseDouble(et7.getText().toString()) * 0.00003125);
                et5.setText("" + Double.parseDouble(et7.getText().toString()) * 0.004464286);
                et6.setText("" + Double.parseDouble(et7.getText().toString()) * 0.0625);
                et8.setText("" + Double.parseDouble(et7.getText().toString()) * 0.9114583);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                et8.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher7 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et8.setText("0.");
                et8.setSelection(et8.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et8.getText().toString()) * 0.00003110348);
                et2.setText("" + Double.parseDouble(et8.getText().toString()) * 31.10348);
                et3.setText("" + Double.parseDouble(et8.getText().toString()) * 0.00003061224);
                et4.setText("" + Double.parseDouble(et8.getText().toString()) * 0.00003428571);
                et5.setText("" + Double.parseDouble(et8.getText().toString()) * 0.004897959);
                et6.setText("" + Double.parseDouble(et8.getText().toString()) * 0.06857143);
                et7.setText("" + Double.parseDouble(et8.getText().toString()) * 1.097143);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                et7.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
}
