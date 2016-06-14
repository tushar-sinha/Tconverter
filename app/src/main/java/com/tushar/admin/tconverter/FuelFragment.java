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


/**
 * A simple {@link Fragment} subclass.
 */
public class FuelFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4;
    EditText et1, et2, et3, et4;
    protected TextWatcher myTextWatcher = new TextWatcher() {
        //bug->app crashes on starting with decimal.
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et1.setText("0.");
                et1.setSelection(et1.getText().length());
            }
            if (s.toString().length() > 0) {
                et2.setText("" + Double.parseDouble(et1.getText().toString()) * 1.20095);
                et3.setText("" + Double.parseDouble(et1.getText().toString()) * 0.4251437);
                et4.setText("" + Double.parseDouble(et1.getText().toString()) * 235.2146);
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
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et2.setText("0.");
                et2.setSelection(et2.getText().length());
            }
            if (s.toString().length() > 0) {
                et1.setText("" + Double.parseDouble(et2.getText().toString()) * 0.8326738);
                et3.setText("" + Double.parseDouble(et2.getText().toString()) * 0.354006);
                et4.setText("" + Double.parseDouble(et2.getText().toString()) * 282.4811);
            } else {
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
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et3.setText("0.");
                et3.setSelection(et3.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et3.getText().toString()) * 2.352146);
                et2.setText("" + Double.parseDouble(et3.getText().toString()) * 2.824811);
                et4.setText("" + Double.parseDouble(et3.getText().toString()) * 100);
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
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et4.setText("0.");
                et4.setSelection(et4.getText().length());
            }
            if (s.toString().length() > 0) {
                et1.setText("" + Double.parseDouble(et4.getText().toString()) * 235.2146);
                et2.setText("" + Double.parseDouble(et4.getText().toString()) * 282.4811);
                et3.setText("" + Double.parseDouble(et4.getText().toString()) * 100);
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
    CardView c1, c2, c3, c4;

    public FuelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_fuel, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0d47a1")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Fuel Consumption");
        c1 = (CardView) fragView.findViewById(R.id.card_view1);
        c2 = (CardView) fragView.findViewById(R.id.card_view2);
        c3 = (CardView) fragView.findViewById(R.id.card_view3);
        c4 = (CardView) fragView.findViewById(R.id.card_view4);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv1.setText(Html.fromHtml("mpg(US)"));
        tv2.setText(Html.fromHtml("mpg(I)"));
        tv3.setText(Html.fromHtml("km/L"));
        tv4.setText(Html.fromHtml("L/100km"));
        c1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        c2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        c3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        c4.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et4 = (EditText) fragView.findViewById(R.id.edit4);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
                    et1.removeTextChangedListener(myTextWatcher);
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.addTextChangedListener(myTextWatcher3);
                }
            }
        });


        return fragView;
    }
}
