package com.example.rajpu.illnessdetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class symptoms extends AppCompatActivity {
    CheckBox a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,vv,w,x,y,z,aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt;

Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        a=(CheckBox)findViewById(R.id.checkBox17);
        b=(CheckBox)findViewById(R.id.checkBox24);
        c=(CheckBox)findViewById(R.id.checkBox26);
        d=(CheckBox)findViewById(R.id.checkBox21);
        e=(CheckBox)findViewById(R.id.checkBox11);
        f=(CheckBox)findViewById(R.id.checkBox25);
        g=(CheckBox)findViewById(R.id.checkBox19);
        h=(CheckBox)findViewById(R.id.checkBox23);
        i=(CheckBox)findViewById(R.id.checkBox35);
        j=(CheckBox)findViewById(R.id.checkBox44);

        j=(CheckBox)findViewById(R.id.checkBox47);
        k=(CheckBox)findViewById(R.id.checkBox36);
        l=(CheckBox)findViewById(R.id.checkBox45);
        m=(CheckBox)findViewById(R.id.checkBox41);
        n=(CheckBox)findViewById(R.id.checkBox46);
        o=(CheckBox)findViewById(R.id.checkBox43);
        p=(CheckBox)findViewById(R.id.checkBox37);
        q=(CheckBox)findViewById(R.id.checkBox39);
        r=(CheckBox)findViewById(R.id.checkBox22);
        s=(CheckBox)findViewById(R.id.checkBox42);
        t=(CheckBox)findViewById(R.id.checkBox38);
        u=(CheckBox)findViewById(R.id.checkBox20);
        vv=(CheckBox)findViewById(R.id.checkBox33);
        w=(CheckBox)findViewById(R.id.checkBox34);
        x=(CheckBox)findViewById(R.id.checkBox9);
        y=(CheckBox)findViewById(R.id.checkBox58);
        z=(CheckBox)findViewById(R.id.checkBox56);
        aa=(CheckBox)findViewById(R.id.checkBox55);
        bb=(CheckBox)findViewById(R.id.checkBox57);
        cc=(CheckBox)findViewById(R.id.checkBox32);
        dd=(CheckBox)findViewById(R.id.checkBox40);
        ee=(CheckBox)findViewById(R.id.checkBox54);
        ff=(CheckBox)findViewById(R.id.checkBox30);
        gg=(CheckBox)findViewById(R.id.checkBox53);
        hh=(CheckBox)findViewById(R.id.checkBox52);
        ii=(CheckBox)findViewById(R.id.checkBox51);
        jj=(CheckBox)findViewById(R.id.checkBox31);
        kk=(CheckBox)findViewById(R.id.checkBox50);
        ll=(CheckBox)findViewById(R.id.checkBox49);
        mm=(CheckBox)findViewById(R.id.checkBox29);
        nn=(CheckBox)findViewById(R.id.checkBox18);
        oo=(CheckBox)findViewById(R.id.checkBox13);
        pp=(CheckBox)findViewById(R.id.checkBox48);
        qq=(CheckBox)findViewById(R.id.checkBox15);
        rr=(CheckBox)findViewById(R.id.checkBox16);
        ss=(CheckBox)findViewById(R.id.checkBox10);
        tt=(CheckBox)findViewById(R.id.checkBox14);
        b1=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a.isChecked() && b.isChecked() && c.isChecked() && d.isChecked()&& e.isChecked()){
            Toast.makeText(getApplicationContext(), "you are suffering from addison's disease", Toast.LENGTH_LONG).show();

        }
        else if(
                f.isChecked()&& g.isChecked() && h.isChecked() && i.isChecked() && j.isChecked()&& k.isChecked() &&l.isChecked()
                )
        {
            Toast.makeText(getApplicationContext(), "you are suffering from alcohol poisoning", Toast.LENGTH_LONG).show();

        }else if(
                        m.isChecked()&& n.isChecked() && o.isChecked() && p.isChecked() && q.isChecked()&& r.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from allergies", Toast.LENGTH_LONG).show();
                }
                else if(
                        s.isChecked()&& t.isChecked() && u.isChecked() && w.isChecked() && vv.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from blood cancer", Toast.LENGTH_LONG).show();
                }else if(
                        w.isChecked()&& x.isChecked() && y.isChecked() && z.isChecked() && aa.isChecked()                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from blood poisoning", Toast.LENGTH_LONG).show();
                }else if(
                            bb.isChecked()&& cc.isChecked() && dd.isChecked() && ee.isChecked() && i.isChecked()
                            ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from brain tumours", Toast.LENGTH_LONG).show();
                }
                else if(
                        ff.isChecked()&& l.isChecked() && m.isChecked() && o.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from common cold", Toast.LENGTH_LONG).show();
                }else if(
                        gg.isChecked()&& hh.isChecked() && ii.isChecked() && jj.isChecked() && kk.isChecked()&& ll.isChecked()                         ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from diabetes", Toast.LENGTH_LONG).show();

                }else if(
                        mm.isChecked()&& nn.isChecked() && oo.isChecked() && pp.isChecked() && i.isChecked()&& d.isChecked() &&w.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from food poisoning", Toast.LENGTH_LONG).show();
                }

                else if(
                        qq.isChecked()&& rr.isChecked() && ss.isChecked() && tt.isChecked() && w.isChecked()&& i.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from malaria", Toast.LENGTH_LONG).show();
                }else if(
                        i.isChecked()&& d.isChecked() && w.isChecked() && rr.isChecked() && ss.isChecked()
                        ) {
                    Toast.makeText(getApplicationContext(), "you are suffering from yellow fever", Toast.LENGTH_LONG).show();
                }






                        else {
                    Toast.makeText(getApplicationContext(), "select appropriate symptoms", Toast.LENGTH_LONG).show();

                }
}
        });
    }}











