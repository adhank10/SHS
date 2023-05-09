package com.example.tamanna.shs;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    private String mButtonNumber = "0";
    private String pin = "";
    private String mode = "";
    private String baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin="+pin+"&output="+mode;
    private static String baseOffURL= "";

    private Button button1, button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
     ProgressBar spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.button18);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button19);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button20);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button21);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button22);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button23);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.button24);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button25);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button26);
        button9.setOnClickListener(this);

        button10 = (Button) findViewById(R.id.button27);
        button10.setOnClickListener(this);

        button11 = (Button) findViewById(R.id.button28);
        button11.setOnClickListener(this);

        button12 = (Button) findViewById(R.id.button29);
        button12.setOnClickListener(this);

        button13 = (Button) findViewById(R.id.button30);
        button13.setOnClickListener(this);

        button14 = (Button) findViewById(R.id.button31);
        button14.setOnClickListener(this);

        button15 = (Button) findViewById(R.id.button32);
        button15.setOnClickListener(this);

        button16 = (Button) findViewById(R.id.button33);
        button16.setOnClickListener(this);

        spinner = (ProgressBar) findViewById(R.id.progressBar);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button18 :
            {

                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=1&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button19 : {
                    try {
                        baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=1&output=0";
                        new ButtonTask().execute(new URL(baseOnURL));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
            }
            case R.id.button20 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=2&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button21 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=2&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button22 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=3&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button23 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=3&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button24 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=4&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button25 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=4&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button26 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=5&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button27 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=5&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button28 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=6&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button29 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=6&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button30 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=7&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button31 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=7&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button32 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=8&output=1";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.button33 : {
                try {
                    baseOnURL = "http://us01.proxy.teleduino.org/api/1.0/328.php?k={5713803E81BAA926BE4B97068D62BA1C}&r=setDigitalOutput&pin=8&output=0";
                    new ButtonTask().execute(new URL(baseOnURL));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            }

        }

    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }

    public class ButtonTask extends AsyncTask<URL, Void,String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            spinner.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(URL... params) {
            URL url = params[0];
            String response = "";
            try {
                 response = getResponseFromHttpUrl(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return response;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            spinner.setVisibility(View.INVISIBLE);
        }
    }


}

