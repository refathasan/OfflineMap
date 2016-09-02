package com.gmail.aiub.refat.offlinemap;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gmail.aiub.refat.offlinemap.test.TestDataSet;

public class LoginActivity extends Activity {

    EditText edt_userName, edt_password;
    Button btn_login, btn_exit;
    Context mContext = LoginActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializeWidget();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userVarification(edt_userName.getText().toString(),edt_password.getText().toString());
            }
        });
    }

    /**
     * @since version 1.0
     * <p>
     *     a method to initialize the widgets
     * </p>
     *
     */
    private void initializeWidget()
    {
        edt_userName = (EditText)findViewById(R.id.edt_userName);
        edt_password = (EditText)findViewById(R.id.edt_password);
        btn_login = (Button)findViewById(R.id.btnLogin);
        btn_exit =(Button)findViewById(R.id.btnExit);
    }

    public void userVarification(String userName, String password)
    {
        userName = edt_userName.getText().toString();
        password = edt_password.getText().toString();

        if(userName.equals("")|| password.equals(""))
        {
            Toast.makeText(LoginActivity.this, "EMPTY USER NAME AND PASSWORD", Toast.LENGTH_SHORT).show();

        }
        else if(!userName.equals(TestDataSet.USER_NAME)||!password.equals(TestDataSet.PASSWORD))
        {
            Toast.makeText(LoginActivity.this, "WRONG USER NAME AND PASSWORD", Toast.LENGTH_SHORT).show();

        }
        else if(userName.equals(TestDataSet.USER_NAME)&& password.equals(TestDataSet.PASSWORD))
        {
            //Toast.makeText(LoginActivity.this, "USER NAME AND PASSWORD IS CORRECT", Toast.LENGTH_SHORT).show();
            finish();
            Intent i = new Intent(mContext,HomeActivity.class);
            startActivity(i);
        }
    }
}
