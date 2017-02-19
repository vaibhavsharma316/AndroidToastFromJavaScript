package com.javascripttoast;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by vaibhav on 2/18/2017.
 */

public class JavaScriptAppInterface {

    Context context;

    JavaScriptAppInterface(Context context)
    {
        this.context=context;
    }

    @JavascriptInterface
    public void  showMessage(String message)
    {

        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }


    @JavascriptInterface
    private void showMyDialog(String message)
    {


        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setMessage(message);
        AlertDialog dialog=builder.create();
        dialog.show();


    }







}
