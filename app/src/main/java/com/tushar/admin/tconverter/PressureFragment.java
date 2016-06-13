package com.tushar.admin.tconverter;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class PressureFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7,tv8;
    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    LinearLayout l1,l2,l3,l4, l5, l6, l7, l8;

    public PressureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView =inflater.inflate(R.layout.fragment_pressure, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Area");
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
        tv1.setText(Html.fromHtml("Pa"));
        tv2.setText(Html.fromHtml("B"));
        tv3.setText(Html.fromHtml("psi"));
        tv4.setText(Html.fromHtml("psf"));
        tv5.setText(Html.fromHtml("atm"));
        tv6.setText(Html.fromHtml("mmHg"));
        tv7.setText(Html.fromHtml("inHg"));
        tv8.setText(Html.fromHtml("T"));
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
                et2.setText("" + Double.parseDouble(et1.getText().toString()) * 0.00001);
                et3.setText("" + Double.parseDouble(et1.getText().toString()) * 0.0001450377);
                et4.setText("" + Double.parseDouble(et1.getText().toString()) * 0.02088543);
                et5.setText("" + Double.parseDouble(et1.getText().toString()) * 0.000009869233);
                et6.setText("" + Double.parseDouble(et1.getText().toString()) * 0.007500617);
                et7.setText("" + Double.parseDouble(et1.getText().toString()) * 0.000295301);
                et8.setText("" + Double.parseDouble(et1.getText().toString()) * 0.007500617);
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

                et1.setText("" + Double.parseDouble(et2.getText().toString()) * 100000);
                et3.setText("" + Double.parseDouble(et2.getText().toString()) * 14.50377);
                et4.setText("" + Double.parseDouble(et2.getText().toString()) * 2088.543);
                et5.setText("" + Double.parseDouble(et2.getText().toString()) * 0.9869233);
                et6.setText("" + Double.parseDouble(et2.getText().toString()) * 750.0617);
                et7.setText("" + Double.parseDouble(et2.getText().toString()) * 29.5301);
                et8.setText("" + Double.parseDouble(et2.getText().toString()) * 750.0617);
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

                et1.setText("" + Double.parseDouble(et3.getText().toString()) * 6894.757);
                et2.setText("" + Double.parseDouble(et3.getText().toString()) * 0.06894757);
                et4.setText("" + Double.parseDouble(et3.getText().toString()) * 144);
                et5.setText("" + Double.parseDouble(et3.getText().toString()) * 0.06804596);
                et6.setText("" + Double.parseDouble(et3.getText().toString()) * 51.71493);
                et7.setText("" + Double.parseDouble(et3.getText().toString()) * 2.036029);
                et8.setText("" + Double.parseDouble(et3.getText().toString()) * 51.71493);
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

                et1.setText("" + Double.parseDouble(et4.getText().toString()) * 47.88026);
                et2.setText("" + Double.parseDouble(et4.getText().toString()) * 0.0004788026);
                et3.setText("" + Double.parseDouble(et4.getText().toString()) * 0.00694444);
                et5.setText("" + Double.parseDouble(et4.getText().toString()) * 0.0004725414);
                et6.setText("" + Double.parseDouble(et4.getText().toString()) * 0.3591315);
                et7.setText("" + Double.parseDouble(et4.getText().toString()) * 0.01413909);
                et8.setText("" + Double.parseDouble(et4.getText().toString()) * 0.3591315);
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

                et1.setText("" + Double.parseDouble(et5.getText().toString()) * 101325);
                et2.setText("" + Double.parseDouble(et5.getText().toString()) * 1.01325);
                et3.setText("" + Double.parseDouble(et5.getText().toString()) * 14.69595);
                et4.setText("" + Double.parseDouble(et5.getText().toString()) * 2116.217);
                et6.setText("" + Double.parseDouble(et5.getText().toString()) * 760);
                et7.setText("" + Double.parseDouble(et5.getText().toString()) * 29.92137);
                et8.setText("" + Double.parseDouble(et5.getText().toString()) * 760);
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

                et1.setText("" + Double.parseDouble(et6.getText().toString()) * 133.3224);
                et2.setText("" + Double.parseDouble(et6.getText().toString()) * 0.0013332244);
                et3.setText("" + Double.parseDouble(et6.getText().toString()) * 0.01933677);
                et4.setText("" + Double.parseDouble(et6.getText().toString()) * 2.784496);
                et5.setText("" + Double.parseDouble(et6.getText().toString()) * 0.001315789);
                et7.setText("" + Double.parseDouble(et6.getText().toString()) * 0.03937023);
                et8.setText("" + Double.parseDouble(et6.getText().toString()) * 1);
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
                et1.setText("" + Double.parseDouble(et7.getText().toString()) * 3386.375);
                et2.setText("" + Double.parseDouble(et7.getText().toString()) * 0.03386375);
                et3.setText("" + Double.parseDouble(et7.getText().toString()) * 0.4911522);
                et4.setText("" + Double.parseDouble(et7.getText().toString()) * 70.72592);
                et5.setText("" + Double.parseDouble(et7.getText().toString()) * 0.03342093);
                et6.setText("" + Double.parseDouble(et7.getText().toString()) * 25.3999);
                et8.setText("" + Double.parseDouble(et7.getText().toString()) * 25.3999);
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

                et1.setText("" + Double.parseDouble(et8.getText().toString()) * 133.3224);
                et2.setText("" + Double.parseDouble(et8.getText().toString()) * 0.001333224);
                et3.setText("" + Double.parseDouble(et8.getText().toString()) * 0.01933677);
                et4.setText("" + Double.parseDouble(et8.getText().toString()) * 2.784496);
                et5.setText("" + Double.parseDouble(et8.getText().toString()) * 0.001315789);
                et6.setText("" + Double.parseDouble(et8.getText().toString()) * 1);
                et7.setText("" + Double.parseDouble(et8.getText().toString()) * 0.03937023);
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
