package com.charis_united.lmd.cac16.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charis_united.lmd.cac16.R;
import com.charis_united.lmd.cac16.Recycler.Movie;
import com.charis_united.lmd.cac16.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class GradFragment extends android.support.v4.app.Fragment
{
   // SearchView sv;
    private MyRecyclerAdapter adapter;
    private ArrayList<Movie> movies;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate(R.layout.fragment_one, null);
        RecyclerView rv = (RecyclerView) v.findViewById(R.id.myFrag1);
        rv.setHasFixedSize(true);

        // ListView
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(), getGraduates()));
        rv.setItemAnimator(new DefaultItemAnimator());


        return v;
    }

    public ArrayList<Movie> getGraduates()
    {

        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie = new Movie("Abegunde Samuel Ayodeji Oluwafemi",R.drawable.abegundesamuelayodejioluwafemismall);
        movies.add(movie);
        movie = new Movie("Abiodun Kehinde David", R.drawable.abiodunkehindedavidsmall);
        movies.add(movie);
        movie = new Movie("Abioye Akinkunmi Samuel", R.drawable.abioyeakinkunmisamuelsmall);
        movies.add(movie);
        movie = new Movie("Adedipe Felicia Oluwatosin", R.drawable.adedipefeliciaoluwatosinsmall);
        movies.add(movie);
        movie = new Movie("Adegboyega Adebukola Christianah", R.drawable.adegboyegaadebukolachristianahsmall);
        movies.add(movie);

        movie = new Movie("Adeleye Tunde Jeremiah", R.drawable.adeleyetundesmall);
        movies.add(movie);

        movie = new Movie("Adeoba Opeyemi Daniel", R.drawable.adeobasmall);
        movies.add(movie);
        movie = new Movie("Adeola Damilola Esther", R.drawable.adeoladamilolaesthersmall);
        movies.add(movie);
        movie = new Movie("Adeoti Josiah Akinyemi", R.drawable.adeotismall);
        movies.add(movie);
        movie = new Movie("Adesugba Adejoke Adebusolami", R.drawable.adesugbasmall);
        movies.add(movie);
        //imcommplete data - data mismatch
        movie = new Movie("Adeyelu Olumide Samuel", R.drawable.adeyeluolumidesmall);
        movies.add(movie);
        movie = new Movie("Adeyeye Adetunji A", R.drawable.adeyeyeadetunjiasmall);
        movies.add(movie);
        movie = new Movie("Aduloju Sunday Joseph", R.drawable.adulojusundayjosephsmall);
        movies.add(movie);
        movie = new Movie("Afowowe Racheal Abiodun", R.drawable.afowowerachealabiodunsmall);
        movies.add(movie);
        movie = new Movie("Agboola Emmanuel Olawale", R.drawable.agboolaemmanuelolawalesmall);
        movies.add(movie);
        movie = new Movie("Ajakaye Oluwatimilehin .S ", R.drawable.ajakayeoluwatimilehinssmall);
        movies.add(movie);
        movie = new Movie("Ajao Emmanuel", R.drawable.ajaoemmanuelsmall);
        movies.add(movie);
        movie = new Movie("Ajao Idowu Philip", R.drawable.ajaoidowuphilipsmall);
        movies.add(movie);
        movie = new Movie("Ajeigbe Damilola James", R.drawable.ajeigbedamilolajamessmall);
        movies.add(movie);
        movie = new Movie("Akeju Miracle Oluwaseun", R.drawable.akejumiracleoluwaseunsmall);
        movies.add(movie);
        movie = new Movie("Akinbusola Omolara Theresa", R.drawable.akinbusolaomolaratheresasmall);
        movies.add(movie);
        movie = new Movie("Akinde Babatunde Samuel", R.drawable.akindesmall);
        movies.add(movie);
        movie = new Movie("Akinlabi Tobi Abraham", R.drawable.akinlabismall);
        movies.add(movie);
        movie = new Movie("Akinwale Ayoola Oluyinka", R.drawable.akinwaleayoolaoluyinkasmall);
        movies.add(movie);
        movie = new Movie("Akinyele Dare Damilola", R.drawable.akinyeledaredamilolasmall);
        movies.add(movie);
        movie = new Movie("Akomolafe Dorcas Oluwaseyi", R.drawable.akomolafedorcasoluwaseyismall);
        movies.add(movie);
        movie = new Movie("Aladegbami Ademola Victor ", R.drawable.aladegbamiademolavictorsmall);
        movies.add(movie);

        movie = new Movie("Alebiowu Motunrayo A", R.drawable.alebiowumotunrayoasmall);
        movies.add(movie);
        movie = new Movie("Apalara Oluwabusayo", R.drawable.apalarasmall);
        movies.add(movie);


        movie = new Movie("Apata Damilola Gabriel", R.drawable.apatadamilolasmall);
        movies.add(movie);
        movie = new Movie("Asaolu Victor Olalekan", R.drawable.asaoluvictorolalekansmall);
        movies.add(movie);
        movie = new Movie("Asogbon Samuel Oluwatimilehin", R.drawable.asogbonsmall);
        movies.add(movie);

        movie = new Movie("Awe Ebenezer Gbenga", R.drawable.aweebenezergbengasma);
        movies.add(movie);

        movie = new Movie("Awobusuyi Tobi Odunayo", R.drawable.awobusuyismall);
        movies.add(movie);
        movie = new Movie("Awodele Oluwaseun", R.drawable.awodeleoluwaseunsmall);
        movies.add(movie);

        movie = new Movie("Awonusi Michael Kolawole", R.drawable.awonisunsmall);
        movies.add(movie);
        movie = new Movie("Babalola Maryann", R.drawable.babalolasmall);
        movies.add(movie);
        movie = new Movie("Bamisaye Oluwafunmiilayo Ruth", R.drawable.bamisaysmall);
        movies.add(movie);
        movie = new Movie("Dada Oluwagbenga Peter", R.drawable.dadasmall);
        movies.add(movie);
        movie = new Movie("Daramola Olajumoke", R.drawable.daramolasmall);
        movies.add(movie);
        movie = new Movie("Egbedeyi Jumoke Damilola", R.drawable.egbedeyijumokedamilolasmall);
        movies.add(movie);
        movie = new Movie("Ehinfunjowo Ayodele P", R.drawable.ehinfunjowoayodelepsmall);
        movies.add(movie);
        movie = new Movie("Elehinafe Temitayo M.", R.drawable.elehinafetemitayosmall);
        movies.add(movie);
        movie = new Movie("Elufowoju Felicia Oluwabunmi", R.drawable.elufuwojusmall);
        movies.add(movie);
        movie = new Movie("Esose Humphrey Ehiz", R.drawable.esosehumphreyehizsmall);
        movies.add(movie);
        movie = new Movie("Fadodun Temitope Esther", R.drawable.fadodunsmall);
        movies.add(movie);
        movie = new Movie("Falodun Abel Odunayo", R.drawable.falodunabellsmall);
        movies.add(movie);
        movie = new Movie("Familusi Oluwaseun Abayomi", R.drawable.familusioluwaseunabayomismall);
        movies.add(movie);

        movie = new Movie("Fasanya Marquis Adedire", R.drawable.fasanyamarquisadediresmall);
        movies.add(movie);
        movie = new Movie("Fatoyinbo Oluwakemi Esther", R.drawable.fatoyinboluwakemiesthersmall);
        movies.add(movie);
        movie = new Movie("Fatoyinbo Opeyemi Promise", R.drawable.fatoyinbosmall);
        movies.add(movie);
        movie = new Movie("Folorunso Tolulope Isaac", R.drawable.folorunshosmall);
        movies.add(movie);
        movie = new Movie("Gbajuola Gideon O", R.drawable.gbajuolasmall);
        movies.add(movie);
        movie = new Movie("George Kehinde Omolayo", R.drawable.georgekehindeomolayosmall);
        movies.add(movie);

        movie = new Movie("Ige Peter Ayobami", R.drawable.igepetersmall);
        movies.add(movie);
        movie = new Movie("Ilumoka Oluwabunmi M", R.drawable.ilumokaoluwabunmimsmall);
        movies.add(movie);

        movie = new Movie("Iyun Titilayo Dorcas", R.drawable.iyuntitilayodorcassmall);
        movies.add(movie);
        movie = new Movie("Kolawole Aderonke Grace", R.drawable.kolawoleaderonkegracesmall);
        movies.add(movie);
        movie = new Movie("Libamoyo Ojo Micheal", R.drawable.libamoyoojomichealsmall);
        movies.add(movie);
        movie = new Movie("Mabigun Adeshola Esther", R.drawable.mabigunadesholaesthersmall);
        movies.add(movie);
        movie = new Movie("Mogaji Toyin ", R.drawable.mogajitoyinsmall);
        movies.add(movie);
        movie = new Movie("Odebunmi Yinka Samuel", R.drawable.odewunmiyinkasamuelsmall);
        movies.add(movie);
        movie = new Movie("Odeyinka Kayode Tobi", R.drawable.odeyinkakayodetobismall);
        movies.add(movie);
        movie = new Movie("Ogbiye Rachael Oluwakemi", R.drawable.ogbiyerachealoluwakemismall);
        movies.add(movie);
        movie = new Movie("Ogundele Ifedayo Olawumi", R.drawable.ogundelesmall);
        movies.add(movie);
        movie = new Movie("Ogundiniyi Abiodun Paul ", R.drawable.ogundiniyismall);
        movies.add(movie);
        movie = new Movie("Ogungbade Aanuoluwapo Tosin", R.drawable.ogungbadeaanuoluwapotosinsmall);
        movies.add(movie);
        movie = new Movie("Ogunmoyin Sylvester Olawale", R.drawable.sylvestersmall);
        movies.add(movie);
        movie = new Movie("Ogunronbi Oluwatoyin Judith", R.drawable.ogunronbioluwatoyinjudithsmall);
        movies.add(movie);
        movie = new Movie("Ogunrotimi Shina John", R.drawable.ogunrotimishinajohnsmall);
        movies.add(movie);
        movie = new Movie("Ogunsina Temitope Samuel", R.drawable.ogunsinatemitopesamuelsmall);
        movies.add(movie);
        //incomplete dataset for ojelade ifeoluwa
        movie = new Movie("Ojelade Ifeoluwa", R.drawable.nopicdisplay);
        movies.add(movie);

        movie = new Movie("Ojo Oluwaseyi Mercy ", R.drawable.ojooluwaseyismall);
        movies.add(movie);
        movie = new Movie("Okeowo Florence Ronke", R.drawable.okeowosmall);
        movies.add(movie);
        movie = new Movie("Okoilu Ayodeji D.", R.drawable.okoilusmall);

        movies.add(movie);
        movie = new Movie("Olabode Phebe Inioluwa", R.drawable.olabodephebeinioluwasmall);
        movies.add(movie);
        movie = new Movie("Oladeloye Olawumi Mabel", R.drawable.oladeloyesmall);
        movies.add(movie);
        movie = new Movie("Oladimeji Eniola M.", R.drawable.oladimejieniolamsmall);
        movies.add(movie);
        movie = new Movie("Olaitan Opeyemi G ", R.drawable.olaitanopeyemigsmall);
        movies.add(movie);

        movie = new Movie("Olanipekun Tobiloba Emmanuel", R.drawable.olanipekuntobilobaemmanuelsmall);
        movies.add(movie);

        movie = new Movie("Olaoluwa Seun E", R.drawable.olaoluwaseunesmall);
        movies.add(movie);
        movie = new Movie("Oluwafemi Ayobami Damilola", R.drawable.oluwafemiayobamidamilolasmall);
        movies.add(movie);
        movie = new Movie("Oluwaseyi B", R.drawable.oluwaseyibsmall);
        movies.add(movie);
        movie = new Movie("Omojolagbe Bamidele Samuel", R.drawable.omojolagbesmall);
        movies.add(movie);
        movie = new Movie("Omokehinde Tayo", R.drawable.omokehindetayosmall);
        movies.add(movie);
        movie = new Movie("Omolola Richard Niyi", R.drawable.omololarichardniyismall);
        movies.add(movie);
        movie = new Movie("Oridupa Yetunde Susan", R.drawable.oridupayetundesusansmall);
        movies.add(movie);
        movie = new Movie("Orotayo Adewale Thomas", R.drawable.orotayosmall);
        movies.add(movie);
        movie = new Movie("Oyedeji Oluwaferanmi Esther", R.drawable.oyedejismall);
        movies.add(movie);

        //wrong dataset for oyejola oluwakemisola adeola
        movie = new Movie("Oyejola Oluwakemisola Adeola", R.drawable.nopicdisplay);
        movies.add(movie);

        movie = new Movie("Popoola Oluwagbenga Matthew", R.drawable.popoolaoluwagbengamathewsmall);
        movies.add(movie);
        movie = new Movie("Shittu Adewale Richard", R.drawable.shittuadewalerichardsmall);
        movies.add(movie);
        movie = new Movie("Tijani Adeyinka Grace", R.drawable.tijanismall);
        movies.add(movie);
        movie = new Movie("Adeniji Adedoyin Ayodeji", R.drawable.adedoyinsmall);
        movies.add(movie);
        movie = new Movie("Adeniji Stephen Adebisi", R.drawable.adenijistephenadebisismall);
        movies.add(movie);
        movie = new Movie("Aladeyelu Oluwatobi Precious", R.drawable.aladeyeluoluwatobiprecioussmall);
        movies.add(movie);







        return movies;
    }


    @Override
    public String toString()
    {
        return "CAC Graduates";

    }





    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.menu_main, menu);

    }



}