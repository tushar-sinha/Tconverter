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
public class TimeFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    protected TextWatcher myTextWatcher5 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et6.setText("0.");
                et6.setSelection(et6.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et6.getText().toString()) * 2.628e+6);
                et2.setText("" + Double.parseDouble(et6.getText().toString()) * 43800);
                et3.setText("" + Double.parseDouble(et6.getText().toString()) * 730.001);
                et4.setText("" + Double.parseDouble(et6.getText().toString()) * 30);
                et5.setText("" + Double.parseDouble(et6.getText().toString()) * 4.348121);
                et7.setText("" + Double.parseDouble(et6.getText().toString()) * 0.0833334);
                et8.setText("" + Double.parseDouble(et6.getText().toString()) * 0.000833334);
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher6 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et7.setText("0.");
                et7.setSelection(et7.getText().length());
            }
            if (s.toString().length() > 0) {
                et1.setText("" + Double.parseDouble(et7.getText().toString()) * 3.154e+7);
                et2.setText("" + Double.parseDouble(et7.getText().toString()) * 525600);
                et3.setText("" + Double.parseDouble(et7.getText().toString()) * 8760);
                et4.setText("" + Double.parseDouble(et7.getText().toString()) * 365);
                et5.setText("" + Double.parseDouble(et7.getText().toString()) * 52.1429);
                et6.setText("" + Double.parseDouble(et7.getText().toString()) * 12);
                et8.setText("" + Double.parseDouble(et7.getText().toString()) * 0.01);
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher7 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et8.setText("0.");
                et8.setSelection(et8.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et8.getText().toString()) * 3.154e+9);
                et2.setText("" + Double.parseDouble(et8.getText().toString()) * 5.256e+7);
                et3.setText("" + Double.parseDouble(et8.getText().toString()) * 876000);
                et4.setText("" + Double.parseDouble(et8.getText().toString()) * 36500);
                et5.setText("" + Double.parseDouble(et8.getText().toString()) * 5214.29);
                et6.setText("" + Double.parseDouble(et8.getText().toString()) * 1200);
                et7.setText("" + Double.parseDouble(et8.getText().toString()) * 100);
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    CardView l1, l2, l3, l4, l5, l6, l7, l8;
    NumberFormat formatter = new DecimalFormat();
    protected TextWatcher myTextWatcher = new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et1.setText("0.");
                et1.setSelection(et1.getText().length());
            }
            if (s.toString().length() > 0) {

                formatter = new DecimalFormat("0.######E0");

                et2.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / 60));
                et3.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / 3600));
                et4.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (60 * 60 * 24)));
                et5.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (60 * 60 * 24 * 7)));
                et6.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (60 * 60 * 24 * 30)));
                et7.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (60 * 60 * 24 * 28 * 12)));
                et8.setText("" + formatter.format(Double.parseDouble(et1.getText().toString()) / (60 * 60 * 24 * 30 * 12 * 100)));
            } else {
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher1 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et2.setText("0.");
                et2.setSelection(et2.getText().length());
            }
            if (s.toString().length() > 0) {
                formatter = new DecimalFormat("0.######E0");
                et1.setText(Double.toString((Double.parseDouble(et2.getText().toString()) * 60)));
                et3.setText(String.format("%.8f", Double.parseDouble(et2.getText().toString()) / 60));
                et4.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (60 * 24)));
                et5.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (60 * 24 * 7)));
                et6.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (60 * 24 * 30)));
                et7.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (60 * 24 * 30 * 12)));
                et8.setText("" + formatter.format(Double.parseDouble(et2.getText().toString()) / (60 * 24 * 30 * 12 * 100)));
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher2 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et3.setText("0.");
                et3.setSelection(et3.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et3.getText().toString()) * 60 * 60);
                et2.setText("" + Double.parseDouble(et3.getText().toString()) * 60);
                et4.setText("" + Double.parseDouble(et3.getText().toString()) / 24);
                et5.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (24 * 7)));
                et6.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (24 * 30)));
                et7.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (24 * 30 * 12)));
                et8.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (24 * 30 * 12 * 100)));
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher3 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et4.setText("0.");
                et4.setSelection(et4.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et4.getText().toString()) * 24 * 60 * 60);
                et2.setText("" + Double.parseDouble(et4.getText().toString()) * 24 * 60);
                et3.setText("" + Double.parseDouble(et4.getText().toString()) * 24);
                et5.setText("" + Double.parseDouble(et4.getText().toString()) / 7);
                et6.setText("" + Double.parseDouble(et4.getText().toString()) / 30);
                et7.setText("" + formatter.format(Double.parseDouble(et4.getText().toString()) / (30 * 12)));
                et8.setText("" + formatter.format(Double.parseDouble(et4.getText().toString()) / (30 * 12 * 100)));
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };
    protected TextWatcher myTextWatcher4 = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            if (s.toString().startsWith(".")) {
                et5.setText("0.");
                et5.setSelection(et5.getText().length());
            }
            if (s.toString().length() > 0) {

                et1.setText("" + Double.parseDouble(et5.getText().toString()) * 7 * 24 * 60 * 60);
                et2.setText("" + Double.parseDouble(et5.getText().toString()) * 7 * 24 * 60);
                et3.setText("" + Double.parseDouble(et5.getText().toString()) * 7 * 24);
                et4.setText("" + Double.parseDouble(et5.getText().toString()) * 7);
                et6.setText("" + Double.parseDouble(et5.getText().toString()) / 4);
                et7.setText("" + formatter.format(Double.parseDouble(et5.getText().toString()) / (4 * 12)));
                et8.setText("" + formatter.format(Double.parseDouble(et3.getText().toString()) / (4 * 12 * 100)));
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
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };

    public TimeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragView = inflater.inflate(R.layout.fragment_time, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0d47a1")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Time");
        l1 = (CardView) fragView.findViewById(R.id.card_view1);
        l2 = (CardView) fragView.findViewById(R.id.card_view2);
        l3 = (CardView) fragView.findViewById(R.id.card_view3);
        l4 = (CardView) fragView.findViewById(R.id.card_view4);
        l5 = (CardView) fragView.findViewById(R.id.card_view5);
        l6 = (CardView) fragView.findViewById(R.id.card_view6);
        l7 = (CardView) fragView.findViewById(R.id.card_view7);
        l8 = (CardView) fragView.findViewById(R.id.card_view8);
        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv5 = (TextView) fragView.findViewById(R.id.txt5);
        tv6 = (TextView) fragView.findViewById(R.id.txt6);
        tv7 = (TextView) fragView.findViewById(R.id.txt7);
        tv8 = (TextView) fragView.findViewById(R.id.txt8);
        tv1.setText(Html.fromHtml("sec"));
        tv2.setText(Html.fromHtml("min"));
        tv3.setText(Html.fromHtml("hr"));
        tv4.setText(Html.fromHtml("day"));
        tv5.setText(Html.fromHtml("week"));
        tv6.setText(Html.fromHtml("month"));
        tv7.setText(Html.fromHtml("year"));
        tv8.setText(Html.fromHtml("century"));
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
                if (hasFocus) {
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
}
