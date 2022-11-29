package ac.kr.jun.gur710.simplecalculator_2017070709;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView result;
    EditText db1,db2,db3,db4;
    EditText jsp1,jsp2,jsp3,jsp4;
    EditText os1,os2,os3,os4;
    EditText mobile1,mobile2,mobile3,mobile4;
    EditText java1,java2,java3,java4;
    EditText vc1,vc2,vc3,vc4;
    EditText system1,system2,system3,system4;
    LinearLayout linear;

    void hideKeyboard()
    {
        InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear);
        linear.setOnTouchListener(linearL);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(btnL);
        result = findViewById(R.id.result);

        db1 = findViewById(R.id.db1);
        db2 = findViewById(R.id.db2);
        db3 = findViewById(R.id.db3);
        db4 = findViewById(R.id.db4);

        jsp1 = findViewById(R.id.jsp1);
        jsp2 = findViewById(R.id.jsp2);
        jsp3 = findViewById(R.id.jsp3);
        jsp4 = findViewById(R.id.jsp4);

        os1 = findViewById(R.id.os1);
        os2 = findViewById(R.id.os2);
        os3 = findViewById(R.id.os3);
        os4 = findViewById(R.id.os4);

        mobile1 = findViewById(R.id.mobile1);
        mobile2 = findViewById(R.id.mobile2);
        mobile3 = findViewById(R.id.mobile3);
        mobile4 = findViewById(R.id.mobile4);

        java1 = findViewById(R.id.java1);
        java2 = findViewById(R.id.java2);
        java3 = findViewById(R.id.java3);
        java4 = findViewById(R.id.java4);

        vc1 = findViewById(R.id.vc1);
        vc2 = findViewById(R.id.vc2);
        vc3 = findViewById(R.id.vc3);
        vc4 = findViewById(R.id.vc4);

        system1 = findViewById(R.id.system1);
        system2 = findViewById(R.id.system2);
        system3 = findViewById(R.id.system3);
        system4 = findViewById(R.id.system4);


    }


    View.OnTouchListener linearL = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            hideKeyboard();
            return false;
        }
    };



    View.OnClickListener btnL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double calc = 0;
            double calcdb = 0,calcjsp = 0,calcos = 0,calcmobile = 0,calcjava = 0,calcvc = 0,calcsystem = 0;
            String gradedb = null,gradejsp = null,gradeos = null,grademobile = null,gradejava = null,gradevc = null,gradesystem = null;

                        try {


                            String strdb1 = db1.getText().toString();
                            String strdb2 = db2.getText().toString();
                            String strdb3 = db3.getText().toString();
                            String strdb4 = db4.getText().toString();

                            double ndb1 = Double.parseDouble(strdb1);
                            double ndb2 = Double.parseDouble(strdb2);
                            double ndb3 = Double.parseDouble(strdb3);
                            double ndb4 = Double.parseDouble(strdb4);


                            int checkdb = 0;


                            if (ndb4 >= 12)
                                gradedb = "F";

                            else {
                                if (ndb4 == 0)
                                    checkdb = 20;
                                else if (ndb4 > 0 && ndb4 <= 3)
                                    checkdb = 19;
                                else if (ndb4 > 3 && ndb4 <= 6)
                                    checkdb = 18;
                                else if (ndb4 > 6 && ndb4 <= 9)
                                    checkdb = 17;

                                calcdb = ndb1 + ndb2 + ndb3 + checkdb;
                                calc = calcdb + calc;

                                if (calcdb > 95 && calcdb <= 100)
                                    gradedb = "A+";
                                else if (calcdb > 90 && calcdb <= 95)
                                    gradedb = "A0";
                                else if (calcdb > 85 && calcdb <= 90)
                                    gradedb = "B+";
                                else if (calcdb > 80 && calcdb <= 85)
                                    gradedb = "B0";
                                else if (calcdb > 75 && calcdb <= 80)
                                    gradedb = "C+";
                                else if (calcdb > 70 && calcdb <= 75)
                                    gradedb = "C0";
                                else if (calcdb > 65 && calcdb <= 70)
                                    gradedb = "D+";
                                else if (calcdb > 60 && calcdb <= 65)
                                    gradedb = "D0";
                                else if (calcdb <= 60)
                                    gradedb = "F";
                            }


                        String strjsp1 = jsp1.getText().toString();
                        String strjsp2 = jsp2.getText().toString();
                        String strjsp3 = jsp3.getText().toString();
                        String strjsp4 = jsp4.getText().toString();

                        double njsp1 = Double.parseDouble(strjsp1);
                        double njsp2 = Double.parseDouble(strjsp2);
                        double njsp3 = Double.parseDouble(strjsp3);
                        double njsp4 = Double.parseDouble(strjsp4);

                        int checkjsp = 0;

                            if (njsp4 >= 12)
                                gradejsp = "F";

                            else {
                                if (njsp4 == 0)
                                    checkjsp = 20;
                                else if (njsp4 > 0 && njsp4 <= 3)
                                    checkjsp = 19;
                                else if (njsp4 > 3 && njsp4 <= 6)
                                    checkjsp = 18;
                                else if (njsp4 > 6 && njsp4 <= 9)
                                    checkjsp = 17;

                                calcjsp = njsp1 + njsp2 + njsp3 + checkjsp;
                                   calc = calcjsp + calc;

                                if (calcjsp > 95 && calcjsp <= 100)
                                    gradejsp = "A+";
                                else if (calcjsp > 90 && calcjsp <= 95)
                                    gradejsp = "A0";
                                else if (calcjsp > 85 && calcjsp <= 90)
                                    gradejsp = "B+";
                                else if (calcjsp > 80 && calcjsp <= 85)
                                    gradejsp = "B0";
                                else if (calcjsp > 75 && calcjsp <= 80)
                                    gradejsp = "C+";
                                else if (calcjsp > 70 && calcjsp <= 75)
                                    gradejsp = "C0";
                                else if (calcjsp > 65 && calcjsp <= 70)
                                    gradejsp = "D+";
                                else if (calcjsp > 60 && calcjsp <= 65)
                                    gradejsp = "D0";
                                else if (calcjsp <= 60)
                                    gradejsp = "F";
                            }

                        String stros1 = os1.getText().toString();
                        String stros2 = os2.getText().toString();
                        String stros3 = os3.getText().toString();
                        String stros4 = os4.getText().toString();

                        double nos1 = Double.parseDouble(stros1);
                        double nos2 = Double.parseDouble(stros2);
                        double nos3 = Double.parseDouble(stros3);
                        double nos4 = Double.parseDouble(stros4);

                            int checkos = 0;

                            if (nos4 >= 12)
                                gradeos = "F";

                            else {
                                if (nos4 == 0)
                                    checkos = 20;
                                else if (nos4 > 0 && nos4 <= 3)
                                    checkos = 19;
                                else if (nos4 > 3 && nos4 <= 6)
                                    checkos = 18;
                                else if (nos4 > 6 && nos4 <= 9)
                                    checkos = 17;

                                calcos = nos1 + nos2 + nos3 + checkos;
                                calc = calcos + calc;

                                if (calcos > 95 && calcos <= 100)
                                    gradeos = "A+";
                                else if (calcos > 90 && calcos <= 95)
                                    gradeos = "A0";
                                else if (calcos > 85 && calcos <= 90)
                                    gradeos = "B+";
                                else if (calcos > 80 && calcos <= 85)
                                    gradeos = "B0";
                                else if (calcos > 75 && calcos <= 80)
                                    gradeos = "C+";
                                else if (calcos > 70 && calcos <= 75)
                                    gradeos = "C0";
                                else if (calcos > 65 && calcos <= 70)
                                    gradeos = "D+";
                                else if (calcos > 60 && calcos <= 65)
                                    gradeos = "D0";
                                else if (calcos <= 60)
                                    gradeos = "F";
                            }
                            String strmobile1 = mobile1.getText().toString();
                            String strmobile2 = mobile2.getText().toString();
                            String strmobile3 = mobile3.getText().toString();
                            String strmobile4 = mobile4.getText().toString();

                            double nmobile1 = Double.parseDouble(strmobile1);
                            double nmobile2 = Double.parseDouble(strmobile2);
                            double nmobile3 = Double.parseDouble(strmobile3);
                            double nmobile4 = Double.parseDouble(strmobile4);

                            int checkmobile = 0;

                            if (nmobile4 >= 12)
                                grademobile = "F";

                            else {
                                if (nmobile4 == 0)
                                    checkmobile = 20;
                                else if (nmobile4 > 0 && nmobile4 <= 3)
                                    checkmobile = 19;
                                else if (nmobile4 > 3 && nmobile4 <= 6)
                                    checkmobile = 18;
                                else if (nmobile4 > 6 && nmobile4 <= 9)
                                    checkmobile = 17;

                                calcmobile = nmobile1 + nmobile2 + nmobile3 + checkmobile;
                                calc = calcmobile + calc;

                                if (calcmobile > 95 && calcmobile <= 100)
                                    grademobile = "A+";
                                else if (calcmobile > 90 && calcmobile <= 95)
                                    grademobile = "A0";
                                else if (calcmobile > 85 && calcmobile <= 90)
                                    grademobile = "B+";
                                else if (calcmobile > 80 && calcmobile <= 85)
                                    grademobile = "B0";
                                else if (calcmobile > 75 && calcmobile <= 80)
                                    grademobile = "C+";
                                else if (calcmobile > 70 && calcmobile <= 75)
                                    grademobile = "C0";
                                else if (calcmobile > 65 && calcmobile <= 70)
                                    grademobile = "D+";
                                else if (calcmobile > 60 && calcmobile <= 65)
                                    grademobile = "D0";
                                else if (calcmobile <= 60)
                                    grademobile = "F";
                            }

                            String strjava1 = java1.getText().toString();
                            String strjava2 = java2.getText().toString();
                            String strjava3 = java3.getText().toString();
                            String strjava4 = java4.getText().toString();

                            double njava1 = Double.parseDouble(strjava1);
                            double njava2 = Double.parseDouble(strjava2);
                            double njava3 = Double.parseDouble(strjava3);
                            double njava4 = Double.parseDouble(strjava4);

                            int checkjava = 0;

                            if (njava4 >= 12)
                                gradejava = "F";

                            else {
                                if (njava4 == 0)
                                    checkjava = 20;
                                else if (njava4 > 0 && njava4 <= 3)
                                    checkjava = 19;
                                else if (njava4 > 3 && njava4 <= 6)
                                    checkjava = 18;
                                else if (njava4 > 6 && njava4 <= 9)
                                    checkjava = 17;

                                calcjava = njava1 + njava2 + njava3 + checkjava;
                                calc = calcjava + calc;

                                if (calcjava > 95 && calcjava <= 100)
                                    gradejava = "A+";
                                else if (calcjava > 90 && calcjava <= 95)
                                    gradejava = "A0";
                                else if (calcjava > 85 && calcjava <= 90)
                                    gradejava = "B+";
                                else if (calcjava > 80 && calcjava <= 85)
                                    gradejava = "B0";
                                else if (calcjava > 75 && calcjava <= 80)
                                    gradejava = "C+";
                                else if (calcjava > 70 && calcjava <= 75)
                                    gradejava = "C0";
                                else if (calcjava > 65 && calcjava <= 70)
                                    gradejava = "D+";
                                else if (calcjava > 60 && calcjava <= 65)
                                    gradejava = "D0";
                                else if (calcjava <= 60)
                                    gradejava = "F";
                            }

                            String strvc1 = vc1.getText().toString();
                            String strvc2 = vc2.getText().toString();
                            String strvc3 = vc3.getText().toString();
                            String strvc4 = vc4.getText().toString();

                            double nvc1 = Double.parseDouble(strvc1);
                            double nvc2 = Double.parseDouble(strvc2);
                            double nvc3 = Double.parseDouble(strvc3);
                            double nvc4 = Double.parseDouble(strvc4);

                            int checkvc = 0;

                            if (nvc4 >= 12)
                                gradevc = "F";

                            else {
                                if (nvc4 == 0)
                                    checkvc = 20;
                                else if (nvc4 > 0 && nvc4 <= 3)
                                    checkvc = 19;
                                else if (nvc4 > 3 && nvc4 <= 6)
                                    checkvc = 18;
                                else if (nvc4 > 6 && nvc4 <= 9)
                                    checkvc = 17;

                                calcvc = nvc1 + nvc2 + nvc3 + checkvc;
                                calc = calcvc + calc;

                                if (calcvc > 95 && calcvc <= 100)
                                    gradevc = "A+";
                                else if (calcvc > 90 && calcvc <= 95)
                                    gradevc = "A0";
                                else if (calcvc > 85 && calcvc <= 90)
                                    gradevc = "B+";
                                else if (calcvc > 80 && calcvc <= 85)
                                    gradevc = "B0";
                                else if (calcvc > 75 && calcvc <= 80)
                                    gradevc = "C+";
                                else if (calcvc > 70 && calcvc <= 75)
                                    gradevc = "C0";
                                else if (calcvc > 65 && calcvc <= 70)
                                    gradevc = "D+";
                                else if (calcvc > 60 && calcvc <= 65)
                                    gradevc = "D0";
                                else if (calcvc <= 60)
                                    gradevc = "F";
                            }

                            String strsystem1 = system1.getText().toString();
                            String strsystem2 = system2.getText().toString();
                            String strsystem3 = system3.getText().toString();
                            String strsystem4 = system4.getText().toString();

                            double nsystem1 = Double.parseDouble(strsystem1);
                            double nsystem2 = Double.parseDouble(strsystem2);
                            double nsystem3 = Double.parseDouble(strsystem3);
                            double nsystem4 = Double.parseDouble(strsystem4);

                            int checksystem = 0;

                            if (nsystem4 >= 12)
                                gradesystem = "F";

                            else {
                                if (nsystem4 == 0)
                                    checksystem = 20;
                                else if (nsystem4 > 0 && nsystem4 <= 3)
                                    checksystem = 19;
                                else if (nsystem4 > 3 && nsystem4 <= 6)
                                    checksystem = 18;
                                else if (nsystem4 > 6 && nsystem4 <= 9)
                                    checksystem = 17;

                                calcsystem = nsystem1 + nsystem2 + nsystem3 + checksystem;
                                calc = calcsystem + calc;

                                if (calcsystem > 95 && calcsystem <= 100)
                                    gradesystem = "A+";
                                else if (calcsystem > 90 && calcsystem <= 95)
                                    gradesystem = "A0";
                                else if (calcsystem > 85 && calcsystem <= 90)
                                    gradesystem = "B+";
                                else if (calcsystem > 80 && calcsystem <= 85)
                                    gradesystem = "B0";
                                else if (calcsystem > 75 && calcsystem <= 80)
                                    gradesystem = "C+";
                                else if (calcsystem > 70 && calcsystem <= 75)
                                    gradesystem = "C0";
                                else if (calcsystem > 65 && calcsystem <= 70)
                                    gradesystem = "D+";
                                else if (calcsystem > 60 && calcsystem <= 65)
                                    gradesystem = "D0";
                                else if (calcsystem <= 60)
                                    gradesystem = "F";

                                calc = (calc/7) * 0.045;
                            }
                            result.setText("데이터베이스: "+calcdb+ "점 "+gradedb+"\n" + "JSP: "+ calcjsp +"점 "+ gradejsp +"\n" +"운영체제: "+calcos+
                                    "점 "+gradeos+"\n" + "모바일프로그래밍: "+ calcmobile +"점 "+ grademobile+"\n" + "JAVA 프로그래밍 응용: " +calcjava+ "점 " + gradejava +"\n");
                            result.append("VC++ 실습: " + calcvc + "점 " + gradevc + "\n"+ "시스템 분석 및 설계: " +calcsystem+"점 "+gradesystem +"\n" + "학점: (약)" +String.format("%.1f",calc) +"점");
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(getApplicationContext(), "점수를 입력해 주세요", Toast.LENGTH_SHORT).show();
                        }



        }
    };

}