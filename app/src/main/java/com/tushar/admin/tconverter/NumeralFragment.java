package com.tushar.admin.tconverter;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
public class NumeralFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4;
    EditText et1, et2, et3, et4;
    LinearLayout l1,l2,l3,l4;

    public NumeralFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_numeral, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6700ff")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Numeral Systems");
        l1 = (LinearLayout)fragView.findViewById(R.id.layout1);
        l2 = (LinearLayout)fragView.findViewById(R.id.layout2);
        l3 = (LinearLayout)fragView.findViewById(R.id.layout3);
        l4 = (LinearLayout)fragView.findViewById(R.id.layout4);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv1.setText(Html.fromHtml("dec"));
        tv2.setText(Html.fromHtml("bin"));
        tv3.setText(Html.fromHtml("oct"));
        tv4.setText(Html.fromHtml("hex"));
        l1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l4.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et4 = (EditText) fragView.findViewById(R.id.edit4);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
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
                    et4.addTextChangedListener(myTextWatcher3);
                }
            }
        });


        return fragView;
    }
    protected TextWatcher myTextWatcher = new TextWatcher() {
        int val;

        @Override
        public void afterTextChanged(Editable s) {


            if (s.toString().length() > 0) {
                try {
                    val = Integer.parseInt(et1.getText().toString());
                    et2.setText(Integer.toBinaryString(val));
                    et3.setText(Integer.toOctalString(val));
                    et4.setText(Integer.toHexString(val));
                }
                catch(NumberFormatException ne){
                    et2.setText("0");
                    et3.setText("0");
                    et4.setText("0");
                    et1.setError("Integer limit reached!");
                }
            } else{
                et2.setText("");
                et3.setText("");
                et4.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
    };
    protected TextWatcher myTextWatcher1 = new TextWatcher() {
        int val;
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().length() > 0) {
                try {
                    val = Integer.parseInt(et2.getText().toString(), 2);
                    et1.setText("" + val);
                    et3.setText(Integer.toOctalString(val));
                    et4.setText(Integer.toHexString(val));
                }
                catch(NumberFormatException ne) {
                    et1.setText("0");
                    et3.setText("0");
                    et4.setText("0");
                    et2.setError("Input limit reached!");
                }
                }

        else {
                et1.setText("");
                et3.setText("");
                et4.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher2 = new TextWatcher() {
        int val;
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et3.setText("0.");
                et3.setSelection(et3.getText().length());
            }
            if (s.toString().length() > 0) {
                try{
                    val=Integer.parseInt(et3.getText().toString(),8);
                    et1.setText("" + val);
                    et2.setText(Integer.toBinaryString(val));
                    et4.setText(Integer.toHexString(val));
                }catch(NumberFormatException ne){
                    et1.setText("0");
                    et2.setText("0");
                    et4.setText("0");
                    et3.setError("Enter valid octal number!");
                }
            } else {
                et1.setText("");
                et2.setText("");
                et4.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher3 = new TextWatcher() {
        int val;
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().length() > 0) {
                try{
                    val=Integer.parseInt(et4.getText().toString(),16);
                    et1.setText(""+val);
                    et2.setText(Integer.toBinaryString(val));
                    et3.setText(Integer.toOctalString(val));
                }
                catch(NumberFormatException ne){
                    et1.setText("0");
                    et2.setText("0");
                    et3.setText("0");
                    et4.setError("Enter valid hexadecimal number!");
                }
            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
}
