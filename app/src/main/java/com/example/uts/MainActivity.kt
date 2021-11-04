package com.example.uts

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView

Public class MainActivity : AppCompatActivity() {
    ImageView iPicture;
    Button bCamera;

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        Button bCamera =(Button) findViewByid (R.id.btntakepicture);
        ImageView iPicture =(ImageView) findViewByid (R.id.imgpicture);

        bCamera.setOnClickListener(new View . OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityFromFragment(intent, 0);
            }
        });
    }
    @Override
    protected void onActivityResult(int reqCode, int resCode, Intent data){
        Bitmap = (Bitmap) data.getExtras().get("data");
        iPicture.setImageBitmap(Bitmap);
    }

}