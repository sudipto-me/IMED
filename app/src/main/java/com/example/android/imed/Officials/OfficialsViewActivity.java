package com.example.android.imed.Officials;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.imed.R;

public class OfficialsViewActivity extends AppCompatActivity {
    Button btn_downloadNumber, btn_callNumber,btn_giveEmail,btn_sendMessage;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officials_view);
        context = this;

        btn_downloadNumber = (Button) findViewById(R.id.btn_save_number);
        btn_callNumber = (Button) findViewById(R.id.btn_show_number);
        btn_giveEmail = (Button)findViewById(R.id.btn_show_email);
        btn_sendMessage = (Button)findViewById(R.id.btn_show_message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn_downloadNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //yes or no option is showing
                DialogInterface.OnClickListener dialogInterfaceOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        switch (which) {
                            case DialogInterface.BUTTON_POSITIVE:
                                //yes button is clicked
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //no button is clicked
                                break;

                        }

                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogInterfaceOnClickListener).setNegativeButton("No", dialogInterfaceOnClickListener).show();
            }
        });

        btn_callNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //yes or no option is showing
                DialogInterface.OnClickListener dialogInterfaceOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                //yes button is clicked
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //no button is clicked
                                break;
                        }
                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure to call?").setPositiveButton("Yes",dialogInterfaceOnClickListener).setNegativeButton("No",dialogInterfaceOnClickListener).show();
            }
        });

        btn_giveEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //yes or no option is showing
                DialogInterface.OnClickListener dialogInterfaceOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                //yes button is clicked
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //no button is clicked
                                break;
                        }
                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure to call?").setPositiveButton("Yes",dialogInterfaceOnClickListener).setNegativeButton("No",dialogInterfaceOnClickListener).show();
            }
        });

        btn_sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogInterface.OnClickListener dialogInterfaceOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                //yes button is clicked
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //no button is clicked
                                break;
                        }
                    }
                };
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure to call?").setPositiveButton("Yes",dialogInterfaceOnClickListener).setNegativeButton("No",dialogInterfaceOnClickListener).show();


            }
        });

            }




}
