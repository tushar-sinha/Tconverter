package com.tushar.admin.tconverter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class DigitalFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText et1, et2, et3, et4, et5, et6;
    protected TextWatcher myTextWatcher5 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et6.setText("0.");
                et6.setSelection(et6.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et6.getText().toString()) * 8 * 1024 * 1024 * 1024 * 1024);
                et2.setText("" + Double.parseDouble(et6.getText().toString()) * 1024 * 1024 * 1024 * 1024);
                et3.setText("" + Double.parseDouble(et6.getText().toString()) * 1024 * 1024 * 1024);
                et4.setText("" + Double.parseDouble(et6.getText().toString()) * 1024 * 1024);
                et5.setText("" + Double.parseDouble(et6.getText().toString()) * 1024);
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    CardView l1, l2, l3, l4, l5, l6;
    NumberFormat formatter = new DecimalFormat();
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
                formatter = new DecimalFormat("0.##########E0");
                et2.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / 8));
                et3.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (8 * 1024)));
                et4.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (8 * 1024 * 1024)));
                et5.setText("" + Double.parseDouble(et1.getText().toString()) * 1.25e-10);
                et6.setText("" + Double.parseDouble(et1.getText().toString()) * 1.25e-13);
            } else{
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
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
                formatter = new DecimalFormat("0.######E0");
                et1.setText("" + Double.parseDouble(et2.getText().toString()) * 8);
                et3.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (1024)));
                et4.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (1024 * 1024)));
                et5.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (1024 * 1024 * 1024)));
                et6.setText("" + Double.parseDouble(et2.getText().toString()) * 1e-12);
            } else {
                et1.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
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
                formatter = new DecimalFormat("0.######E0");
                et1.setText("" + Double.parseDouble(et3.getText().toString()) * 8 * 1024);
                et2.setText("" + Double.parseDouble(et3.getText().toString()) * 1024);
                et4.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (1024)));
                et5.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (1024 * 1024)));
                et6.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (1024 * 1024 * 1024)));
            } else {
                et1.setText("");
                et2.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
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
                formatter = new DecimalFormat("0.######E0");
                et1.setText("" + Double.parseDouble(et4.getText().toString()) * 8 * 1024 * 1024);
                et2.setText("" + Double.parseDouble(et4.getText().toString()) * 1024 * 1024);
                et3.setText("" + Double.parseDouble(et4.getText().toString()) * 1024);
                et5.setText("" + formatter.format(Double.parseDouble(et4.getText().toString()) / (1024)));
                et6.setText("" + formatter.format(Double.parseDouble(et4.getText().toString()) / (1024 * 1024)));
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et5.setText("");
                et6.setText("");
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
                formatter = new DecimalFormat("0.######E0");
                et1.setText("" + Double.parseDouble(et5.getText().toString()) * 8 * 1024 * 1024 * 1024);
                et2.setText("" + Double.parseDouble(et5.getText().toString()) * 1024 * 1024 * 1024);
                et3.setText("" + Double.parseDouble(et5.getText().toString()) * 1024 * 1024);
                et4.setText("" + Double.parseDouble(et5.getText().toString()) * 1024);
                et6.setText("" + formatter.format(Double.parseDouble(et5.getText().toString()) / (1024)));
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et6.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };

    public DigitalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_digital, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#aabb00")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Digital Storage");
        l1 = (CardView) fragView.findViewById(R.id.card_view1);
        l2 = (CardView) fragView.findViewById(R.id.card_view2);
        l3 = (CardView) fragView.findViewById(R.id.card_view3);
        l4 = (CardView) fragView.findViewById(R.id.card_view4);
        l5 = (CardView) fragView.findViewById(R.id.card_view5);
        l6 = (CardView) fragView.findViewById(R.id.card_view6);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv5 = (TextView) fragView.findViewById(R.id.txt5);
        tv6 = (TextView) fragView.findViewById(R.id.txt6);
        tv1.setText(Html.fromHtml("b"));
        tv2.setText(Html.fromHtml("B"));
        tv3.setText(Html.fromHtml("KB"));
        tv4.setText(Html.fromHtml("MB"));
        tv5.setText(Html.fromHtml("GB"));
        tv6.setText(Html.fromHtml("TB"));
        l1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l4.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l5.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l6.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et4 = (EditText) fragView.findViewById(R.id.edit4);
        et5 = (EditText) fragView.findViewById(R.id.edit5);
        et6 = (EditText) fragView.findViewById(R.id.edit6);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et1.addTextChangedListener(myTextWatcher);
                }
            }
        });
        et2.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et2.addTextChangedListener(myTextWatcher1);
                }
            }
        });
        et3.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et3.addTextChangedListener(myTextWatcher2);
                }
            }
        });
        et4.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et4.addTextChangedListener(myTextWatcher3);
                }
            }
        });
        et5.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et6.removeTextChangedListener(myTextWatcher5);
                    et5.addTextChangedListener(myTextWatcher4);
                }
            }
        });
        et6.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);
                    et6.addTextChangedListener(myTextWatcher5);
                }
            }
        });

        return fragView;
    }
}
