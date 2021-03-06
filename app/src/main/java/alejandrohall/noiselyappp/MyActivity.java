package alejandrohall.noiselyappp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;


public class MyActivity extends Activity {

    static Button fire;
    static Button garden;
    static Button rain;
    static Button seaside;
    static Button storm;
    static Button stormRain;
    static Button night;
    static Button water;
    static Button wind;
    Button comingSoon;
    static boolean fire_s;
    static boolean garden_s;
    static boolean rain_s;
    static boolean seaside_s;
    static boolean storm_s;
    static boolean stormRain_s;
    static boolean night_s;
    static boolean water_s;
    static boolean wind_s;
    static MediaPlayer firePlayer, gardenPlayer, rainPlayer, seasidePlayer, stormPlayer, stormRainPlayer, nightPlayer, waterPlayer, windPlayer;
    ScrollView scrollView;
    String[] colores = {"#8ADCB3", "#345773", "#BD3559", "#34495E", "#72BDC2", "#FED156", "#F47D43", "#076BB6", "#FFD602", "#AE70AF", "#CDB48C", "#A9B2B1", "#9ECEB4", "#9295CA", "#ACCBE8", "#F05C5E"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Inicializamos todas las variables de los elementos

        fire = (Button) findViewById(R.id.fire);
        garden = (Button) findViewById(R.id.garden);
        rain = (Button) findViewById(R.id.rain);
        seaside = (Button) findViewById(R.id.seaside);
        storm = (Button) findViewById(R.id.storm);
        stormRain = (Button) findViewById(R.id.stormrain);
        night = (Button) findViewById(R.id.night);
        water = (Button) findViewById(R.id.water);
        wind = (Button) findViewById(R.id.wind);
        comingSoon = (Button) findViewById(R.id.comingsoon);
        scrollView = (ScrollView) findViewById(R.id.scrollView);

        //Inicializamos todos los mediaPlayer

        firePlayer = MediaPlayer.create(MyActivity.this, R.raw.fire);
        gardenPlayer = MediaPlayer.create(MyActivity.this, R.raw.garden);
        rainPlayer = MediaPlayer.create(MyActivity.this, R.raw.rain);
        seasidePlayer = MediaPlayer.create(MyActivity.this, R.raw.seaside);
        stormPlayer = MediaPlayer.create(MyActivity.this, R.raw.storm);
        stormRainPlayer = MediaPlayer.create(MyActivity.this, R.raw.stormwithrain);
        nightPlayer = MediaPlayer.create(MyActivity.this, R.raw.summernight);
        waterPlayer = MediaPlayer.create(MyActivity.this, R.raw.waterstream);
        windPlayer = MediaPlayer.create(MyActivity.this, R.raw.wind);


        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fire_s == false){
                    fire_s = true;
                    fire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fireplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.fire), Toast.LENGTH_SHORT).show();
                    firePlayer = MediaPlayer.create(MyActivity.this, R.raw.fire);
                    firePlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            firePlayer.start();
                        }

                    });
                    firePlayer.start();
                }else {
                    fire_s = false;
                    fire.setBackgroundDrawable(getResources().getDrawable(R.drawable.firepause));
                    firePlayer.release();
                }
            }
        });
        garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (garden_s == false) {
                    garden_s = true;
                    garden.setBackgroundDrawable(getResources().getDrawable(R.drawable.gardenplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.garden), Toast.LENGTH_SHORT).show();
                    gardenPlayer = MediaPlayer.create(MyActivity.this, R.raw.garden);
                    gardenPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            gardenPlayer.start();
                        }

                    });
                    gardenPlayer.start();
                } else {
                    garden_s = false;
                    garden.setBackgroundDrawable(getResources().getDrawable(R.drawable.gardenpause));
                    gardenPlayer.release();
                }
            }
        });

        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rain_s == false) {
                    rain_s = true;
                    rain.setBackgroundDrawable(getResources().getDrawable(R.drawable.rainplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.rain), Toast.LENGTH_SHORT).show();
                    rainPlayer = MediaPlayer.create(MyActivity.this, R.raw.rain);
                    rainPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            rainPlayer.start();
                        }

                    });
                    rainPlayer.start();
                } else {
                    rain_s = false;
                    rain.setBackgroundDrawable(getResources().getDrawable(R.drawable.rainpause));
                    rainPlayer.release();
                }

            }
        });
        seaside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (seaside_s == false) {
                    seaside_s = true;
                    seaside.setBackgroundDrawable(getResources().getDrawable(R.drawable.seasideplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.seaside), Toast.LENGTH_SHORT).show();
                    seasidePlayer = MediaPlayer.create(MyActivity.this, R.raw.seaside);
                    seasidePlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            seasidePlayer.start();
                        }

                    });
                    seasidePlayer.start();
                } else {
                    seaside_s = false;
                    seaside.setBackgroundDrawable(getResources().getDrawable(R.drawable.seasidepause));
                    seasidePlayer.release();
                }
            }
        });
        storm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storm_s == false) {
                    storm_s = true;
                    storm.setBackgroundDrawable(getResources().getDrawable(R.drawable.stormplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.storm), Toast.LENGTH_SHORT).show();
                    stormPlayer = MediaPlayer.create(MyActivity.this, R.raw.storm);
                    stormPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stormPlayer.start();
                        }

                    });
                    stormPlayer.start();
                } else {
                    storm_s = false;
                    storm.setBackgroundDrawable(getResources().getDrawable(R.drawable.stormpause));
                    stormPlayer.release();
                }
            }
        });
        stormRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stormRain_s == false){
                    stormRain_s = true;
                    stormRain.setBackgroundDrawable(getResources().getDrawable(R.drawable.stormrainplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.stormRain), Toast.LENGTH_SHORT).show();
                    stormRainPlayer = MediaPlayer.create(MyActivity.this, R.raw.stormwithrain);
                    stormRainPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stormRainPlayer.start();
                        }

                    });
                    stormRainPlayer.start();
                }else {
                    stormRain_s = false;
                    stormRain.setBackgroundDrawable(getResources().getDrawable(R.drawable.stormrainpause));
                    stormRainPlayer.release();
                }
            }
        });

        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (night_s == false) {
                    night_s = true;
                    night.setBackgroundDrawable(getResources().getDrawable(R.drawable.summernightplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.night), Toast.LENGTH_SHORT).show();
                    nightPlayer = MediaPlayer.create(MyActivity.this, R.raw.summernight);
                    nightPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            nightPlayer.start();
                        }

                    });
                    nightPlayer.start();
                } else {
                    night_s = false;
                    night.setBackgroundDrawable(getResources().getDrawable(R.drawable.summernightpause));
                    nightPlayer.release();
                }
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (water_s == false) {
                    water_s = true;
                    water.setBackgroundDrawable(getResources().getDrawable(R.drawable.waterstreamplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.water), Toast.LENGTH_SHORT).show();
                    waterPlayer = MediaPlayer.create(MyActivity.this, R.raw.waterstream);
                    waterPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            waterPlayer.start();
                        }

                    });
                    waterPlayer.start();
                } else {
                    water_s = false;
                    water.setBackgroundDrawable(getResources().getDrawable(R.drawable.waterstreampause));
                    waterPlayer.release();
                }
            }
        });
        wind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wind_s == false){
                    wind_s = true;
                    wind.setBackgroundDrawable(getResources().getDrawable(R.drawable.windplay));
                    Toast.makeText(getApplicationContext(),getResources().getText(R.string.wind), Toast.LENGTH_SHORT).show();
                    windPlayer = MediaPlayer.create(MyActivity.this, R.raw.wind);
                    windPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            windPlayer.start();
                        }

                    });
                    windPlayer.start();
                }else {
                    wind_s = false;
                    wind.setBackgroundDrawable(getResources().getDrawable(R.drawable.windpause));
                    windPlayer.release();
                }
            }
        });
        comingSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),getResources().getText(R.string.comingSoon), Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

        int index = (int) Math.abs(Math.random()*16);
        scrollView.setBackgroundColor(Color.parseColor(colores[index]));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.share) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.sharingtext));
            startActivity(Intent.createChooser(intent, getResources().getString(R.string.share)));
            return true;
        }else if (id == R.id.rate_app){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=alejandrohall.noiselyappp"));
            startActivity(intent);

            return true;
        }else if (id == R.id.about_creator){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(R.string.infoapp)
                    .setTitle("Info!")
                    .setCancelable(false)
                    .setNeutralButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
            return true;
        }else if (id == R.id.Temp){


            AlertDialog.Builder timerAdvisor = new AlertDialog.Builder(this);
            timerAdvisor.setMessage(getResources().getString(R.string.dialogText))
                    .setTitle(getResources().getString(R.string.dialogTitle))
                    .setCancelable(false)
                    .setNeutralButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    DialogFragment newFragment = new CountTimeDialog();
                                    newFragment.show(getFragmentManager(), "timePicker");
                                }
                            });
            AlertDialog alert = timerAdvisor.create();
            alert.show();


        }

        return super.onOptionsItemSelected(item);
    }


    public static void StopPlayers(){



        fire_s = false;
        fire.setBackgroundDrawable(fire.getContext().getResources().getDrawable(R.drawable.firepause));
        firePlayer.release();


        garden_s = false;
        garden.setBackgroundDrawable(garden.getContext().getResources().getDrawable(R.drawable.gardenpause));
        gardenPlayer.release();

        rain_s = false;
        rain.setBackgroundDrawable(rain.getContext().getResources().getDrawable(R.drawable.rainpause));
        rainPlayer.release();

        seaside_s = false;
        seaside.setBackgroundDrawable(seaside.getContext().getResources().getDrawable(R.drawable.seasidepause));
        seasidePlayer.release();

        storm_s = false;
        storm.setBackgroundDrawable(storm.getContext().getResources().getDrawable(R.drawable.stormpause));
        stormPlayer.release();

        stormRain_s = false;
        stormRain.setBackgroundDrawable(stormRain.getContext().getResources().getDrawable(R.drawable.stormrainpause));
        stormRainPlayer.release();

        night_s = false;
        night.setBackgroundDrawable(night.getContext().getResources().getDrawable(R.drawable.summernightpause));
        nightPlayer.release();

        water_s = false;
        water.setBackgroundDrawable(water.getContext().getResources().getDrawable(R.drawable.waterstreampause));
        waterPlayer.release();

        wind_s = false;
        wind.setBackgroundDrawable(wind.getContext().getResources().getDrawable(R.drawable.windpause));
        windPlayer.release();



    }




}

