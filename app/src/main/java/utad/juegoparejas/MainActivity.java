package utad.juegoparejas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    public int contador=0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        img1 = (ImageView) this.findViewById(R.id.imageView1);
        img2 = (ImageView) this.findViewById(R.id.imageView2);
        img3 = (ImageView) this.findViewById(R.id.imageView3);
        img4 = (ImageView) this.findViewById(R.id.imageView4);
        img5 = (ImageView) this.findViewById(R.id.imageView5);
        img6 = (ImageView) this.findViewById(R.id.imageView6);
        img7 = (ImageView) this.findViewById(R.id.imageView7);
        img8 = (ImageView) this.findViewById(R.id.imageView8);


/*
        int[] images = new int[] {R.drawable.apple,R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
        int imageId2 = (int)(Math.random() * images.length);


        int imageId3 = (int)(Math.random() * images.length);
        int imageId4 = (int)(Math.random() * images.length);


        int imageId5 = (int)(Math.random() * images.length);
        int imageId6 = (int)(Math.random() * images.length);



        int imageId7 = (int)(Math.random() * images.length);
        int imageId8 = (int)(Math.random() * images.length);
*/


            if(contador >= 2 ){
                img1.setImageResource(R.drawable.asd);
                img2.setImageResource(R.drawable.asd);
                img3.setImageResource(R.drawable.asd);
                img4.setImageResource(R.drawable.asd);
                img5.setImageResource(R.drawable.asd);
                img6.setImageResource(R.drawable.asd);
                img7.setImageResource(R.drawable.asd);
                img8.setImageResource(R.drawable.asd);
                contador=0;

            }else {
                img1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                        int imageId1 = (int) (Math.random() * images.length);
                        img1.setImageResource(images[imageId1]);
                        contador++;

                    }
                });
            }





            if (contador >= 2) {
                img1.setImageResource(R.drawable.asd);
                img2.setImageResource(R.drawable.asd);
                img3.setImageResource(R.drawable.asd);
                img4.setImageResource(R.drawable.asd);
                img5.setImageResource(R.drawable.asd);
                img6.setImageResource(R.drawable.asd);
                img7.setImageResource(R.drawable.asd);
                img8.setImageResource(R.drawable.asd);
                contador = 0;
            } else {
                img2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                        int imageId2 = (int) (Math.random() * images.length);
                        img2.setImageResource(images[imageId2]);
                        contador++;
                    }
                });
            }





        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId3 = (int) (Math.random() * images.length);
                    img3.setImageResource(images[imageId3]);
                }
            });
        }


        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId4 = (int) (Math.random() * images.length);
                    img4.setImageResource(images[imageId4]);
                }
            });
        }


        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId5 = (int) (Math.random() * images.length);
                    img5.setImageResource(images[imageId5]);
                }
            });
        }


        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId6 = (int) (Math.random() * images.length);
                    img6.setImageResource(images[imageId6]);
                }
            });
        }



        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId7 = (int) (Math.random() * images.length);
                    img7.setImageResource(images[imageId7]);
                }
            });
        }




        if(contador >= 2 ){
            img1.setImageResource(R.drawable.asd);
            img2.setImageResource(R.drawable.asd);
            img3.setImageResource(R.drawable.asd);
            img4.setImageResource(R.drawable.asd);
            img5.setImageResource(R.drawable.asd);
            img6.setImageResource(R.drawable.asd);
            img7.setImageResource(R.drawable.asd);
            img8.setImageResource(R.drawable.asd);
            contador=0;
        }else {
            img8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int[] images = new int[]{R.drawable.apple, R.drawable.elephant, R.drawable.gellow, R.drawable.gorilla};
                    int imageId8 = (int) (Math.random() * images.length);
                    img8.setImageResource(images[imageId8]);
                }
            });
        }







    }
}
