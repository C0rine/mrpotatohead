package corine.mrpotatohead;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    // Declare all elements
    private ImageView body;

    private ImageView arms;
    private CheckBox checkArms;
    private ImageView ears;
    private CheckBox checkEars;
    private ImageView eyebrows;
    private CheckBox checkEyebrows;
    private ImageView eyes;
    private CheckBox checkEyes;
    private ImageView glasses;
    private CheckBox checkGlasses;
    private ImageView hat;
    private CheckBox checkHat;
    private ImageView mouth;
    private CheckBox checkMouth;
    private ImageView mustache;
    private CheckBox checkMustache;
    private ImageView nose;
    private CheckBox checkNose;
    private ImageView shoes;
    private CheckBox checkShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize body of mr potato head and set it to VISIBLE
        body = (ImageView) findViewById(R.id.body);
        body.setVisibility(View.VISIBLE);

        // Initialize all other bodyparts and set these to INVISIBLE
        arms = (ImageView) findViewById(R.id.arms);
        arms.setVisibility(View.INVISIBLE);

        ears = (ImageView) findViewById(R.id.ears);
        ears.setVisibility(View.INVISIBLE);

        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyebrows.setVisibility(View.INVISIBLE);

        eyes = (ImageView) findViewById(R.id.eyes);
        eyes.setVisibility(View.INVISIBLE);

        glasses = (ImageView) findViewById(R.id.glasses);
        glasses.setVisibility(View.INVISIBLE);

        hat = (ImageView) findViewById(R.id.hat);
        hat.setVisibility(View.INVISIBLE);

        mouth = (ImageView) findViewById(R.id.mouth);
        mouth.setVisibility(View.INVISIBLE);

        mustache = (ImageView) findViewById(R.id.mustache);
        mustache.setVisibility(View.INVISIBLE);

        nose = (ImageView) findViewById(R.id.nose);
        nose.setVisibility(View.INVISIBLE);

        shoes = (ImageView) findViewById(R.id.shoes);
        shoes.setVisibility(View.INVISIBLE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // make arms appear when arms checkbox is checked, make then disappear when unchecked
    public void onCheckingArms(View view){

        if (arms.getVisibility() == view.INVISIBLE){
            arms.setVisibility(View.VISIBLE);
        }
        else {
            arms.setVisibility(View.INVISIBLE);
        }


    }

    // repeat for all other bodyparts...

    public void onCheckingEars(View view){

        if (ears.getVisibility() == view.INVISIBLE){
            ears.setVisibility(View.VISIBLE);
        }
        else {
            ears.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingEyebrows(View view){

        if (eyebrows.getVisibility() == view.INVISIBLE){
            eyebrows.setVisibility(View.VISIBLE);
        }
        else {
            eyebrows.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingEyes(View view){

        if (eyes.getVisibility() == view.INVISIBLE){
            eyes.setVisibility(View.VISIBLE);
        }
        else {
            eyes.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingGlasses(View view){

        if (glasses.getVisibility() == view.INVISIBLE){
            glasses.setVisibility(View.VISIBLE);
        }
        else {
            glasses.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingHat(View view){

        if (hat.getVisibility() == view.INVISIBLE){
            hat.setVisibility(View.VISIBLE);
        }
        else {
            hat.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingMouth(View view){

        if (mouth.getVisibility() == view.INVISIBLE){
            mouth.setVisibility(View.VISIBLE);
        }
        else {
            mouth.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingMustache(View view){

        if (mustache.getVisibility() == view.INVISIBLE){
            mustache.setVisibility(View.VISIBLE);
        }
        else {
            mustache.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingNose(View view){

        if (nose.getVisibility() == view.INVISIBLE){
            nose.setVisibility(View.VISIBLE);
        }
        else {
            nose.setVisibility(View.INVISIBLE);
        }


    }

    public void onCheckingShoes(View view){

        if (shoes.getVisibility() == view.INVISIBLE){
            shoes.setVisibility(View.VISIBLE);
        }
        else {
            shoes.setVisibility(View.INVISIBLE);
        }


    }

}
