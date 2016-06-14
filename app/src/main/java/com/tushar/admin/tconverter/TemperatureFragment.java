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
public class TemperatureFragment extends Fragment {
    TextView tv1, tv2, tv3;
    EditText et1, et2, et3;
    protected TextWatcher myTextWatcher = new TextWatcher() {
        double val;

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et1.setText("0.");
                et1.setSelection(et1.getText().length());
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et1.getText().toString());
                et2.setText(String.valueOf(val * 1.8 + 32));
                et3.setText(String.valueOf(val + 273.15));
            } else {
                et2.setText("");
                et3.setText("");
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
        double val;

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et2.setText("0.");
                et2.setSelection(et2.getText().length());
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et2.getText().toString());
                et1.setText("" + ((val - 32.0) * (0.555555)));
                et3.setText("" + ((val - 32.0) * (0.555555)) + 273.15);
            } else {
                et1.setText("");
                et3.setText("");
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher2 = new TextWatcher() {
        double val;

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et3.setText("0.");
                et3.setSelection(et3.getText().length());
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et3.getText().toString());
                et1.setText(String.valueOf(val - 273.15));
                et2.setText(String.valueOf(val * 1.8 - 459.67));
            } else {
                et1.setText("");
                et2.setText("");
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    CardView l1, l2, l3;

    public TemperatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_temperature, container, false);

        //((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6700ff")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Temperature");
        l1 = (CardView) fragView.findViewById(R.id.card_view1);
        l2 = (CardView) fragView.findViewById(R.id.card_view2);
        l3 = (CardView) fragView.findViewById(R.id.card_view3);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv1.setText(Html.fromHtml("C<sup><small>o</small></sup>"));
        tv2.setText(Html.fromHtml("F<sup><small>o</small></sup>"));
        tv3.setText(Html.fromHtml("K"));
        l1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
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
                    et3.addTextChangedListener(myTextWatcher2);
                }
            }
        });


        return fragView;
    }
}
