package com.charis_united.lmd.cac16.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.charis_united.lmd.cac16.R;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class SlideShow extends android.support.v4.app.Fragment
{
    private static final String TAG = null;
    MediaPlayer player;

    ImageView demoImage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate(R.layout.fragment_two, null);
        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.sound);
        player.start();
        player.getDuration();

        //slide show code

        ImageView demoImage = (ImageView) v.findViewById(R.id.DemoImage);
        int imagesToShow[] =
                {

                        R.drawable.adeyeluolumide,
                        R.drawable.abegundesamuelayodejioluwafemi,
                        R.drawable.abiodunkehindedavid,
                        R.drawable.abioyeakinkunmisamuel,
                        R.drawable.adedipefeliciaoluwatosin,
                        R.drawable.adegboyegaadebkolachristianah,
                        R.drawable.adedipefeliciaoluwatosin,
                        R.drawable.adenijistephenadebisi,
                        R.drawable.adeobaopeyemidaniel,
                        R.drawable.adeoladamilolaesther,
                        R.drawable.adeoti,
                        R.drawable.adesugba,
                        R.drawable.akinlabi,
                        R.drawable.adeyeyeadetunjia,
                        R.drawable.aduloju,
                        R.drawable.adulojusundayjoseph,
                        R.drawable.afowowerachealabiodun,
                        R.drawable.agboolaemmanuelolawale,
                        R.drawable.ajakayeoluwatimilehins,
                        R.drawable.ajaoemmanuel,
                        R.drawable.ajaoidowuphilip,
                        R.drawable.ajeigbedamilolajames,
                        R.drawable.akejumiracleoluwaseun,
                        R.drawable.akinbusolaomolaratheresa,
                        R.drawable.akinde,
                        R.drawable.akinwaleayoolaoluyinka,
                        R.drawable.akomolafedorcasoluwaseyi,
                        R.drawable.aladegbamiademolavictor,
                        R.drawable.aladeyeluoluwatobiprecious,
                        R.drawable.alebiowumotunrayoa,
                        R.drawable.apalara,
                        R.drawable.apatadamilola,
                        R.drawable.asaoluvictorolalekan,
                        R.drawable.asogbon,
                        R.drawable.awobusuyi,
                        R.drawable.awodeleoluwaseun,
                        R.drawable.babalola,
                        R.drawable.bamisay,
                        R.drawable.dada,
                        R.drawable.daramola,
                        R.drawable.egbedeyijumokedamilola,
                        R.drawable.ehinfunjowoayodelep,
                        R.drawable.elehinafetemitayo,
                        R.drawable.elufuwoju,
                        R.drawable.esosehumphreyehiz,
                        R.drawable.fadodun,
                        R.drawable.adeleyetunde,
                        R.drawable.falodunabell,
                        R.drawable.fasanyamarquisadedire,
                        R.drawable.fatoyinbo,
                        R.drawable.fatoyinboluwakemiesther,
                        R.drawable.folorunsho,
                        R.drawable.gbajuola,
                        R.drawable.georgekehindeomolayo,
                        R.drawable.igepeter,
                        R.drawable.ilumokaoluwabunmim,
                        R.drawable.kolawoleaderonkegrace,
                        R.drawable.libamoyoojomicheal,
                        R.drawable.mabigunadesholaesther,
                        R.drawable.mogajitoyin,
                        R.drawable.noname,
                        R.drawable.odewunmiyinkasamuel,
                        R.drawable.odeyinkakayodetobi,
                        R.drawable.ogbiyerachealoluwakemi,
                        R.drawable.ogundele,
                        R.drawable.ogundiniyi,
                        R.drawable.olanipekuntobilobaemmanuel,
                        R.drawable.ogungbadeaanuoluwapotosin,
                        R.drawable.ogunronbioluwatoyinjudith,
                        R.drawable.ogunsinatemitopesamuel,
                        R.drawable.ojooluwaseyi,
                        R.drawable.okeowo,
                        R.drawable.okoilu,
                        R.drawable.olabodephebeinioluwa,
                        R.drawable.oladimejieniolam,
                        R.drawable.olaitanopeyemig,
                        R.drawable.olaoluwaseune,
                        R.drawable.oluwafemiayobamidamilola,
                        R.drawable.oluwaseyib,
                        R.drawable.omokehindetayo,
                        R.drawable.omololarichardniyi,
                        R.drawable.oridupayetundesusan,
                        R.drawable.orotayo,
                        R.drawable.oyedeji,
                        R.drawable.popoolaoluwagbengamathew,
                        R.drawable.qazxsw,
                        R.drawable.samee,
                        R.drawable.shittuadewalerichard,
                        R.drawable.familusioluwaseunabayomi,
                        R.drawable.sylvester,
                        R.drawable.iyuntitilayodorcas,
                        R.drawable.aweebenezergbenga,
                        R.drawable.tijani,


                };

               animate(demoImage, imagesToShow, 0, false);






        return  v;
    }


    private void animate(final ImageView imageView, final int images[], final int imageIndex,
                         final boolean forever) {

        //imageView <-- The View which displays the images
        //images[] <-- Holds R references to the images to display
        //imageIndex <-- index of the first image to show in images[]
        //forever <-- If equals true then after the last image it starts all over again with the first image resulting in an infinite loop. You have been warned.

        int fadeInDuration = 1000; // Configure time values here
        int timeBetween = 2000;
        int fadeOutDuration = 20;

        imageView.setVisibility(View.INVISIBLE);    //Visible or invisible by default - this will apply when the animation ends
        imageView.setImageResource(images[imageIndex]);

        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new DecelerateInterpolator()); // add this
        fadeIn.setDuration(fadeInDuration);

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator()); // and this
        fadeOut.setStartOffset(fadeInDuration + timeBetween);
        fadeOut.setDuration(fadeOutDuration);

        AnimationSet animation = new AnimationSet(false); // change to false
        animation.addAnimation(fadeIn);
        animation.addAnimation(fadeOut);
        animation.setRepeatCount(1);
        imageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                if (images.length - 1 > imageIndex) {
                    animate(imageView, images, imageIndex + 1, forever); //Calls itself until it gets to the end of the array
                } else {
                    animate(imageView, images, 0, forever);  //Calls itself to start the animation all over again in a loop if forever = true
                }
            }

            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public String toString ()
    {
        return "Gallery";

    }

  @Override
    public void onPause()
    {
      super.onPause();
    }
}
