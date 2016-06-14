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
public class ShoeFragment extends Fragment {
    TextView tv1, tv2, tv3, tv4, tv5;
    EditText et1, et2, et3, et4, et5;
    protected TextWatcher myTextWatcher = new TextWatcher() {
        //bug-app crashes on starting with decimal.
        double val;
        @Override
        public void afterTextChanged(Editable s) {

            if(s.toString().startsWith("."))
            {
                et1.setText("0");
                et1.setSelection(et1.getText().length());
                et1.setError("Enter size between 6 and 16");
            }
            if (s.toString().length() > 0 ) {
                val = Double.parseDouble(et1.getText().toString());
                if(val>=6&&val<=16){
                    et2.setText("" + (val - 1));
                    //for euro size
                    switch(String.valueOf(val))
                    {
                        case "6.0":
                            et3.setText("38");
                            et4.setText("24");
                            et5.setText("9.25");
                            break;

                        case "6.5":
                            et3.setText("38.5");
                            et4.setText("24.5");
                            et5.setText("9.5");
                            break;
                        case "7.0":
                            et3.setText("39");
                            et4.setText("25");
                            et5.setText("9.625");
                            break;
                        case "7.5":
                            et3.setText("40");
                            et4.setText("25.5");
                            et5.setText("9.75");
                            break;
                        case "8.0":
                            et3.setText("40.5");
                            et4.setText("26");
                            et5.setText("9.9375");
                            break;
                        case "8.5":
                            et3.setText("41");
                            et4.setText("26.5");
                            et5.setText("10.125");
                            break;
                        case "9.0":
                            et3.setText("42");
                            et4.setText("27");
                            et5.setText("10.25");
                            break;
                        case "9.5":
                            et3.setText("42.5");
                            et4.setText("27.5");
                            et5.setText("10.4375");
                            break;
                        case "10.0":
                            et3.setText("43");
                            et4.setText("28");
                            et5.setText("10.5625");
                            break;
                        case "10.5":
                            et3.setText("44");
                            et4.setText("28.5");
                            et5.setText("10.75");
                            break;
                        case "11.0":
                            et3.setText("44.5");
                            et4.setText("29");
                            et5.setText("10.9375");
                            break;
                        case "11.5":
                            et3.setText("45");
                            et4.setText("29.5");
                            et5.setText("11.125");
                            break;
                        case "12.0":
                            et3.setText("46");
                            et4.setText("30");
                            et5.setText("11.25");
                            break;
                        case "12.5":
                            et3.setText("46.5");
                            et4.setText("30.5");
                            et5.setText("11.4175");
                            break;
                        case "13.0":
                            et3.setText("47");
                            et4.setText("31");
                            et5.setText("11.5625");
                            break;
                        case "13.5":
                            et3.setText("48");
                            et4.setText("31.5");
                            et5.setText("11.61");
                            break;
                        case "14.0":
                            et3.setText("48.5");
                            et4.setText("32");
                            et5.setText("11.875");
                            break;
                        case "14.5":
                            et3.setText("49");
                            et4.setText("32.5");
                            et5.setText("12");
                            break;
                        case "15.0":
                            et3.setText("50");
                            et4.setText("33");
                            et5.setText("12.1875");
                            break;
                        case "15.5":
                            et3.setText("50.5");
                            et4.setText("33.5");
                            et5.setText("12.4");
                            break;
                        case "16.0":
                            et3.setText("51");
                            et4.setText("34");
                            et5.setText("12.5");
                            break;
                        default:
                            et1.setError("Enter valid US size number between 6 and 16!");
                    }
                }
                else
                    et1.setError("Enter size between 6 and 16!");
            } else{
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");

            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher1 = new TextWatcher() {
        double val;
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et2.setText("0");
                et2.setSelection(et2.getText().length());
                et2.setError("Enter size between 5 and 15");
            }
            if (s.toString().length() > 0) {

                val = Double.parseDouble(et2.getText().toString());
                if(val>=5&&val<=15){
                    et1.setText("" + (val + 1));
                    //for euro size
                    switch(String.valueOf(val))
                    {
                        case "5.0":
                            et3.setText("38");
                            et4.setText("24");
                            et5.setText("9.25");
                            break;

                        case "5.5":
                            et3.setText("38.5");
                            et4.setText("24.5");
                            et5.setText("9.5");
                            break;
                        case "6.0":
                            et3.setText("39");
                            et4.setText("25");
                            et5.setText("9.625");
                            break;
                        case "6.5":
                            et3.setText("40");
                            et4.setText("25.5");
                            et5.setText("9.75");
                            break;
                        case "7.0":
                            et3.setText("40.5");
                            et4.setText("26");
                            et5.setText("9.9375");
                            break;
                        case "7.5":
                            et3.setText("41");
                            et4.setText("26.5");
                            et5.setText("10.125");
                            break;
                        case "8.0":
                            et3.setText("42");
                            et4.setText("27");
                            et5.setText("10.25");
                            break;
                        case "8.5":
                            et3.setText("42.5");
                            et4.setText("27.5");
                            et5.setText("10.4375");
                            break;
                        case "9.0":
                            et3.setText("43");
                            et4.setText("28");
                            et5.setText("10.5625");
                            break;
                        case "9.5":
                            et3.setText("44");
                            et4.setText("28.5");
                            et5.setText("10.75");
                            break;
                        case "10.0":
                            et3.setText("44.5");
                            et4.setText("29");
                            et5.setText("10.9375");
                            break;
                        case "10.5":
                            et3.setText("45");
                            et4.setText("29.5");
                            et5.setText("11.125");
                            break;
                        case "11.0":
                            et3.setText("46");
                            et4.setText("30");
                            et5.setText("11.25");
                            break;
                        case "11.5":
                            et3.setText("46.5");
                            et4.setText("30.5");
                            et5.setText("11.4175");
                            break;
                        case "12.0":
                            et3.setText("47");
                            et4.setText("31");
                            et5.setText("11.5625");
                            break;
                        case "12.5":
                            et3.setText("48");
                            et4.setText("31.5");
                            et5.setText("11.61");
                            break;
                        case "13.0":
                            et3.setText("48.5");
                            et4.setText("32");
                            et5.setText("11.875");
                            break;
                        case "13.5":
                            et3.setText("49");
                            et4.setText("32.5");
                            et5.setText("12");
                            break;
                        case "14.0":
                            et3.setText("50");
                            et4.setText("33");
                            et5.setText("12.1875");
                            break;
                        case "14.5":
                            et3.setText("50.5");
                            et4.setText("33.5");
                            et5.setText("12.4");
                            break;
                        case "15.0":
                            et3.setText("51");
                            et4.setText("34");
                            et5.setText("12.5");
                            break;
                        default:
                            et2.setError("Enter valid UK size number between 5 and 15!");
                    }
                }
                else
                    et2.setError("Enter size between 5 and 15!");

            } else {
                et1.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");

            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher2 = new TextWatcher() {
        double val;
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et3.setText("0");
                et3.setSelection(et3.getText().length());
                et3.setError("Enter size between 38 and 52");
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et3.getText().toString());
                if(val>=38&&val<=52){
                    //for euro size
                    switch(String.valueOf(val))
                    {
                        case "38.0":
                            et1.setText("6.0");
                            et2.setText("5.0");
                            et4.setText("24.0");
                            et5.setText("9.25");
                            break;

                        case "38.5":
                            et1.setText("6.5");
                            et2.setText("5.5");
                            et4.setText("24.5");
                            et5.setText("9.5");
                            break;
                        case "39":
                            et1.setText("7");
                            et2.setText("6");
                            et4.setText("25");
                            et5.setText("9.625");
                            break;
                        case "40":
                            et1.setText("7.5");
                            et2.setText("6.5");
                            et4.setText("25.5");
                            et5.setText("9.75");
                            break;
                        case "40.5":
                            et1.setText("8.0");
                            et2.setText("7.0");
                            et4.setText("26");
                            et5.setText("9.9375");
                            break;
                        case "41":
                            et1.setText("8.5");
                            et2.setText("7.5");
                            et4.setText("26.5");
                            et5.setText("10.125");
                            break;
                        case "42":
                            et1.setText("9.0");
                            et2.setText("8.0");
                            et4.setText("27");
                            et5.setText("10.25");
                            break;
                        case "42.5":
                            et1.setText("9.5");
                            et2.setText("8.5");
                            et4.setText("27.5");
                            et5.setText("10.4375");
                            break;
                        case "43.0":
                            et1.setText("10.0");
                            et2.setText("9.0");
                            et4.setText("28");
                            et5.setText("10.5625");
                            break;
                        case "44":
                            et1.setText("10.5");
                            et2.setText("9.5");
                            et4.setText("28.5");
                            et5.setText("10.75");
                            break;
                        case "44.5":
                            et1.setText("11.0");
                            et2.setText("10.0");
                            et4.setText("29");
                            et5.setText("10.9375");
                            break;
                        case "45":
                            et1.setText("11.5");
                            et2.setText("10.5");
                            et4.setText("29.5");
                            et5.setText("11.125");
                            break;
                        case "46.0":
                            et1.setText("12.0");
                            et2.setText("11.0");
                            et4.setText("30");
                            et5.setText("11.25");
                            break;
                        case "46.5":
                            et1.setText("12.5");
                            et2.setText("11.5");
                            et4.setText("30.5");
                            et5.setText("11.4175");
                            break;
                        case "47.0":
                            et1.setText("13.0");
                            et2.setText("12.0");
                            et4.setText("31");
                            et5.setText("11.5625");
                            break;
                        case "48.0":
                            et1.setText("11.5");
                            et2.setText("12.5");
                            et4.setText("31.5");
                            et5.setText("11.61");
                            break;
                        case "48.5":
                            et1.setText("14.0");
                            et2.setText("13.0");
                            et4.setText("32");
                            et5.setText("11.875");
                            break;
                        case "49.0":
                            et1.setText("14.5");
                            et2.setText("13.5");
                            et4.setText("32.5");
                            et5.setText("12");
                            break;
                        case "50.0":
                            et1.setText("15.0");
                            et2.setText("14.0");
                            et4.setText("33");
                            et5.setText("12.1875");
                            break;
                        case "50.5":
                            et1.setText("15.5");
                            et2.setText("14.5");
                            et4.setText("33.5");
                            et5.setText("12.4");
                            break;
                        case "51.0":
                            et1.setText("14.0");
                            et2.setText("15.0");
                            et4.setText("34");
                            et5.setText("12.5");
                            break;
                        default:
                            et3.setError("Enter valid Euro size number between 38 and 52!");
                    }
                }
                else
                    et3.setError("Enter size number between 38 and 52!");

            } else {
                et1.setText("");
                et2.setText("");
                et4.setText("");
                et5.setText("");

            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher3 = new TextWatcher() {
        double val;
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et4.setText("0");
                et4.setSelection(et4.getText().length());
                et4.setError("Enter size between 24 and 34");
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et4.getText().toString());
                if(val>=24&&val<=34){
                    //for euro size
                    switch(String.valueOf(val))
                    {
                        case "24.0":
                            et1.setText("6.0");
                            et2.setText("5.0");
                            et3.setText("38.0");
                            et5.setText("9.25");
                            break;

                        case "24.5":
                            et1.setText("6.5");
                            et2.setText("5.5");
                            et3.setText("38.5");
                            et5.setText("9.5");
                            break;
                        case "25":
                            et1.setText("7");
                            et2.setText("6");
                            et3.setText("39");
                            et5.setText("9.625");
                            break;
                        case "25.5":
                            et1.setText("7.5");
                            et2.setText("6.5");
                            et3.setText("40.0");
                            et5.setText("9.75");
                            break;
                        case "26":
                            et1.setText("8.0");
                            et2.setText("7.0");
                            et3.setText("40.5");
                            et5.setText("9.9375");
                            break;
                        case "26.5":
                            et1.setText("8.5");
                            et2.setText("7.5");
                            et3.setText("41");
                            et5.setText("10.125");
                            break;
                        case "27":
                            et1.setText("9.0");
                            et2.setText("8.0");
                            et3.setText("42");
                            et5.setText("10.25");
                            break;
                        case "27.5":
                            et1.setText("9.5");
                            et2.setText("8.5");
                            et3.setText("42.5");
                            et5.setText("10.4375");
                            break;
                        case "28.0":
                            et1.setText("10.0");
                            et2.setText("9.0");
                            et3.setText("43.0");
                            et5.setText("10.5625");
                            break;
                        case "28.5":
                            et1.setText("10.5");
                            et2.setText("9.5");
                            et3.setText("44.0");
                            et5.setText("10.75");
                            break;
                        case "29.0":
                            et1.setText("11.0");
                            et2.setText("10.0");
                            et3.setText("44.5");
                            et5.setText("10.9375");
                            break;
                        case "29.5":
                            et1.setText("11.5");
                            et2.setText("10.5");
                            et3.setText("45.0");
                            et5.setText("11.125");
                            break;
                        case "30.0":
                            et1.setText("12.0");
                            et2.setText("11.0");
                            et3.setText("46.0");
                            et5.setText("11.25");
                            break;
                        case "30.5":
                            et1.setText("12.5");
                            et2.setText("11.5");
                            et3.setText("46.5");
                            et5.setText("11.4175");
                            break;
                        case "31.0":
                            et1.setText("13.0");
                            et2.setText("12.0");
                            et3.setText("47.0");
                            et5.setText("11.5625");
                            break;
                        case "31.5":
                            et1.setText("11.5");
                            et2.setText("12.5");
                            et3.setText("48.0");
                            et5.setText("11.61");
                            break;
                        case "32.0":
                            et1.setText("14.0");
                            et2.setText("13.0");
                            et3.setText("48.5");
                            et5.setText("11.875");
                            break;
                        case "32.5":
                            et1.setText("14.5");
                            et2.setText("13.5");
                            et3.setText("49.0");
                            et5.setText("12");
                            break;
                        case "33.0":
                            et1.setText("15.0");
                            et2.setText("14.0");
                            et3.setText("50.0");
                            et5.setText("12.1875");
                            break;
                        case "33.5":
                            et1.setText("15.5");
                            et2.setText("14.5");
                            et3.setText("50.5");
                            et5.setText("12.4");
                            break;
                        case "34.0":
                            et1.setText("14.0");
                            et2.setText("15.0");
                            et3.setText("51.0");
                            et5.setText("12.5");
                            break;
                        default:
                            et4.setError("Enter valid size in cm between 24 and 34!");
                    }
                }
                else
                    et4.setError("Enter size number between 24 and 34!");

            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et5.setText("");

            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    protected TextWatcher myTextWatcher4 = new TextWatcher() {
        double val;
        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().startsWith("."))
            {
                et5.setText("0");
                et5.setSelection(et5.getText().length());
                et5.setError("Enter size between 9.25 and 12.5");
            }
            if (s.toString().length() > 0) {
                val = Double.parseDouble(et5.getText().toString());
                if(val>=9.25&&val<=12.5){
                    //for euro size
                    switch(String.valueOf(val))
                    {
                        case "9.25":
                            et1.setText("6.0");
                            et2.setText("5.0");
                            et3.setText("38.0");
                            et4.setText("24.0");
                            break;

                        case "9.5":
                            et1.setText("6.5");
                            et2.setText("5.5");
                            et3.setText("38.5");
                            et4.setText("24.5");
                            break;
                        case "9.625":
                            et1.setText("7.0");
                            et2.setText("6.0");
                            et3.setText("39");
                            et4.setText("25.0");
                            break;
                        case "9.75":
                            et1.setText("7.5");
                            et2.setText("6.5");
                            et3.setText("40.0");
                            et4.setText("25.5");
                            break;
                        case "9.9375":
                            et1.setText("8.0");
                            et2.setText("7.0");
                            et3.setText("40.5");
                            et4.setText("26.0");
                            break;
                        case "10.125":
                            et1.setText("8.5");
                            et2.setText("7.5");
                            et3.setText("41");
                            et4.setText("26.5");
                            break;
                        case "10.25":
                            et1.setText("9.0");
                            et2.setText("8.0");
                            et3.setText("42");
                            et4.setText("27.0");
                            break;
                        case "10.4":
                            et1.setText("9.5");
                            et2.setText("8.5");
                            et3.setText("42.5");
                            et4.setText("27.5");
                            break;
                        case "10.5":
                            et1.setText("10.0");
                            et2.setText("9.0");
                            et3.setText("43.0");
                            et4.setText("28.0");
                            break;
                        case "10.75":
                            et1.setText("10.5");
                            et2.setText("9.5");
                            et3.setText("44.0");
                            et4.setText("28.5");
                            break;
                        case "10.9":
                            et1.setText("11.0");
                            et2.setText("10.0");
                            et3.setText("44.5");
                            et4.setText("29.0");
                            break;
                        case "11.125":
                            et1.setText("11.5");
                            et2.setText("10.5");
                            et3.setText("45.0");
                            et4.setText("29.5");
                            break;
                        case "11.25":
                            et1.setText("12.0");
                            et2.setText("11.0");
                            et3.setText("46.0");
                            et4.setText("30.0");
                            break;
                        case "11.4":
                            et1.setText("12.5");
                            et2.setText("11.5");
                            et3.setText("46.5");
                            et4.setText("30.5");
                            break;
                        case "11.5625":
                            et1.setText("13.0");
                            et2.setText("12.0");
                            et3.setText("47.0");
                            et4.setText("31.0");
                            break;
                        case "11.6":
                            et1.setText("11.5");
                            et2.setText("12.5");
                            et3.setText("48.0");
                            et4.setText("31.5");
                            break;
                        case "11.875":
                            et1.setText("14.0");
                            et2.setText("13.0");
                            et3.setText("48.5");
                            et4.setText("32.0");
                            break;
                        case "12.0":
                            et1.setText("14.5");
                            et2.setText("13.5");
                            et3.setText("49.0");
                            et4.setText("32.5");
                            break;
                        case "12.1":
                            et1.setText("15.0");
                            et2.setText("14.0");
                            et3.setText("50.0");
                            et4.setText("33.0");
                            break;
                        case "12.4":
                            et1.setText("15.5");
                            et2.setText("14.5");
                            et3.setText("50.5");
                            et4.setText("33.5");
                            break;
                        case "12.5":
                            et1.setText("14.0");
                            et2.setText("15.0");
                            et3.setText("51.0");
                            et4.setText("34.0");
                            break;
                        default:
                            et5.setError("Enter valid size in inch between 9.25 and 12.5!");
                    }
                }
                else
                    et5.setError("Enter size number between 9.25 and 12.5!");

            } else {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");

            }
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
    };
    CardView l1, l2, l3, l4, l5;

    public ShoeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.fragment_shoe, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0d47a1")));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Shoe Size");
        l1 = (CardView) fragView.findViewById(R.id.card_view1);
        l2 = (CardView) fragView.findViewById(R.id.card_view2);
        l3 = (CardView) fragView.findViewById(R.id.card_view3);
        l4 = (CardView) fragView.findViewById(R.id.card_view4);
        l5 = (CardView) fragView.findViewById(R.id.card_view5);

        tv1 = (TextView) fragView.findViewById(R.id.txt1);
        tv2 = ((TextView) fragView.findViewById(R.id.txt2));
        tv3 = (TextView) fragView.findViewById(R.id.txt3);
        tv4 = (TextView) fragView.findViewById(R.id.txt4);
        tv5 = (TextView) fragView.findViewById(R.id.txt5);

        tv1.setText(Html.fromHtml("US"));
        tv2.setText(Html.fromHtml("UK"));
        tv3.setText(Html.fromHtml("Eu"));
        tv4.setText(Html.fromHtml("cm"));
        tv5.setText(Html.fromHtml("in"));

        l1.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l2.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l3.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l4.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));
        l5.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left));

        et1 = (EditText) fragView.findViewById(R.id.edit1);
        et2 = (EditText) fragView.findViewById(R.id.edit2);
        et3 = (EditText) fragView.findViewById(R.id.edit3);
        et4 = (EditText) fragView.findViewById(R.id.edit4);
        et5 = (EditText) fragView.findViewById(R.id.edit5);

        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    et2.removeTextChangedListener(myTextWatcher1);
                    et3.removeTextChangedListener(myTextWatcher2);
                    et4.removeTextChangedListener(myTextWatcher3);
                    et5.removeTextChangedListener(myTextWatcher4);

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

                    et5.addTextChangedListener(myTextWatcher4);
                }
            }
        });

        return fragView;
    }
}
