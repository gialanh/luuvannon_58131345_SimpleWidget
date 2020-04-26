package vn.ntu.edu.vannon.luuvannon_58131345_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      EditText nhapten ;
      EditText nhapngaysinh ;
      EditText nhapsothickhac ;
      Button xacnhan ;
       RadioGroup groupgioitinh ;
       RadioButton nam ;
       RadioButton nu ;
       CheckBox chetbox1;
       CheckBox chetbox2;
      CheckBox chetbox3;
      CheckBox chetbox4;
      CheckBox chetbox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
        addEvents();



    }
    private  void addViews(){
          nhapten =findViewById(R.id.nhapten) ;
          nhapsothickhac =findViewById(R.id.nhapsothichkhac) ;
          nhapngaysinh = findViewById(R.id.nhapngaysinh) ;
          xacnhan =findViewById(R.id.xacnhan) ;
          groupgioitinh =findViewById(R.id.groupgt) ;
          nam =findViewById(R.id.nam) ;
          nu =findViewById(R.id.nu);
          chetbox1 =findViewById(R.id.checkBox) ;
          chetbox2 =findViewById(R.id.checkBox2);
          chetbox3 = findViewById(R.id.checkBox3) ;
          chetbox4 =findViewById(R.id.checkBox4);
          chetbox5 =findViewById(R.id.checkBox5) ;
    }

    private  void addEvents(){
         xacnhan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 inranamhinh();
             }
         });


    }
    private  void inranamhinh() {

           String ten  = nhapten.getText().toString().trim();
           String tuoi =nhapngaysinh.getText().toString().trim();
           String sothic = nhapsothickhac.getText().toString().trim();
            String xuat =null ;
           if (ten.length()>0)

               xuat ="tên : " +ten + " \n " ;
           if (tuoi.length()>0)

               xuat += "ngày sinh" +tuoi+ "\n" ;
            switch (groupgioitinh.getCheckedRadioButtonId()) {
                case R.id.nam :
                    xuat += "giới tính : nam \n Sở thích :" ;
                    break;

                case  R.id.nu :
                    xuat +=  "giới tính : nữ \n Sở thích :" ;
                    break;
            }
            if (chetbox1.isChecked())
                xuat +=chetbox1.getText()+ ","   ;

            if (chetbox2.isChecked())
                xuat += chetbox2.getText()+" ," ;

            if (chetbox3.isChecked())
               xuat += chetbox3.getText()+" ," ;

            if (chetbox4.isChecked())
              xuat += chetbox4.getText()+" ," ;

            if (chetbox5.isChecked())
               xuat += chetbox5.getText()+" ," ;

             if (sothic.length() > 0)
                 xuat += sothic ;
             Toast.makeText(MainActivity.this,xuat,Toast.LENGTH_SHORT).show();
    }

    //cuoi
}
