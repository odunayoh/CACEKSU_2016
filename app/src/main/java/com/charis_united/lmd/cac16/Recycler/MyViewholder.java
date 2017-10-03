package com.charis_united.lmd.cac16.Recycler;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.charis_united.lmd.cac16.Details_Activity.ABEGUN;
import com.charis_united.lmd.cac16.Details_Activity.ABIODUN_KEHINDE_DAVID;
import com.charis_united.lmd.cac16.Details_Activity.ABIOYE;
import com.charis_united.lmd.cac16.Details_Activity.ADEDIPE;
import com.charis_united.lmd.cac16.Details_Activity.ADEGBOYEGA;
import com.charis_united.lmd.cac16.Details_Activity.ADELEYE;
import com.charis_united.lmd.cac16.Details_Activity.ADENIJI_ADEDOYIN;
import com.charis_united.lmd.cac16.Details_Activity.ADENIJI_STEPHEN;
import com.charis_united.lmd.cac16.Details_Activity.ADEOBA_OPEYEMI;
import com.charis_united.lmd.cac16.Details_Activity.ADEOLA_DAMILOLA;
import com.charis_united.lmd.cac16.Details_Activity.ADEOTI;
import com.charis_united.lmd.cac16.Details_Activity.ADESUGBA_ADEJOKE;
import com.charis_united.lmd.cac16.Details_Activity.ADEYELU;
import com.charis_united.lmd.cac16.Details_Activity.ADEYEYE;
import com.charis_united.lmd.cac16.Details_Activity.ADULOJU;
import com.charis_united.lmd.cac16.Details_Activity.AFOWOWE;
import com.charis_united.lmd.cac16.Details_Activity.AGBOOLA;
import com.charis_united.lmd.cac16.Details_Activity.AJAKAYE;
import com.charis_united.lmd.cac16.Details_Activity.AJAO;
import com.charis_united.lmd.cac16.Details_Activity.AJAO_IDOWU;
import com.charis_united.lmd.cac16.Details_Activity.AJEIGBE;
import com.charis_united.lmd.cac16.Details_Activity.AKINBUSOLA;
import com.charis_united.lmd.cac16.Details_Activity.AKINYELE;
import com.charis_united.lmd.cac16.Details_Activity.AKOMOLAFE;
import com.charis_united.lmd.cac16.Details_Activity.ALADEGBAMI;
import com.charis_united.lmd.cac16.Details_Activity.ALADEYELU;
import com.charis_united.lmd.cac16.Details_Activity.ALEBIOWU;
import com.charis_united.lmd.cac16.Details_Activity.APALARA;
import com.charis_united.lmd.cac16.Details_Activity.APATA;
import com.charis_united.lmd.cac16.Details_Activity.ASAOLU;
import com.charis_united.lmd.cac16.Details_Activity.ASOGBON;
import com.charis_united.lmd.cac16.Details_Activity.AWE;
import com.charis_united.lmd.cac16.Details_Activity.AWOBUSUYI;
import com.charis_united.lmd.cac16.Details_Activity.AWODELE;
import com.charis_united.lmd.cac16.Details_Activity.AWONUSI;
import com.charis_united.lmd.cac16.Details_Activity.BABALOLA;
import com.charis_united.lmd.cac16.Details_Activity.BAMISAYE;
import com.charis_united.lmd.cac16.Details_Activity.DADA;
import com.charis_united.lmd.cac16.Details_Activity.DARAMOLA;
import com.charis_united.lmd.cac16.Details_Activity.EGBEDEYI;
import com.charis_united.lmd.cac16.Details_Activity.EHINFUNJOWO;
import com.charis_united.lmd.cac16.Details_Activity.ELEHINAFE;
import com.charis_united.lmd.cac16.Details_Activity.ELUFOWOJU;
import com.charis_united.lmd.cac16.Details_Activity.ESOSE;
import com.charis_united.lmd.cac16.Details_Activity.FADODUN;
import com.charis_united.lmd.cac16.Details_Activity.FALODUN;
import com.charis_united.lmd.cac16.Details_Activity.FAMILUSI;
import com.charis_united.lmd.cac16.Details_Activity.FASANYA;
import com.charis_united.lmd.cac16.Details_Activity.FATOYINBO;
import com.charis_united.lmd.cac16.Details_Activity.FATOYINBO_OPEYEMI;
import com.charis_united.lmd.cac16.Details_Activity.FOLORUNSO;
import com.charis_united.lmd.cac16.Details_Activity.GBAJUOLA;
import com.charis_united.lmd.cac16.Details_Activity.GEORGE;
import com.charis_united.lmd.cac16.Details_Activity.IGE;
import com.charis_united.lmd.cac16.Details_Activity.ILUMOKA;
import com.charis_united.lmd.cac16.Details_Activity.IYUN;
import com.charis_united.lmd.cac16.Details_Activity.KOLAWOLE;
import com.charis_united.lmd.cac16.Details_Activity.LIBAMOYO;
import com.charis_united.lmd.cac16.Details_Activity.MABIGUN;
import com.charis_united.lmd.cac16.Details_Activity.MOGAJI;
import com.charis_united.lmd.cac16.Details_Activity.ODEBUNMI;
import com.charis_united.lmd.cac16.Details_Activity.ODEYINKA;
import com.charis_united.lmd.cac16.Details_Activity.OGBIYE;
import com.charis_united.lmd.cac16.Details_Activity.OGUNDELE;
import com.charis_united.lmd.cac16.Details_Activity.OGUNDINIYI;
import com.charis_united.lmd.cac16.Details_Activity.OGUNGBADE;
import com.charis_united.lmd.cac16.Details_Activity.OGUNMOYIN;
import com.charis_united.lmd.cac16.Details_Activity.OGUNRONBI;
import com.charis_united.lmd.cac16.Details_Activity.OGUNROTIMI;
import com.charis_united.lmd.cac16.Details_Activity.OGUNSINA;
import com.charis_united.lmd.cac16.Details_Activity.OJELADE;
import com.charis_united.lmd.cac16.Details_Activity.OJO;
import com.charis_united.lmd.cac16.Details_Activity.OKEOWO;
import com.charis_united.lmd.cac16.Details_Activity.OKOILU;
import com.charis_united.lmd.cac16.Details_Activity.OLABODE;
import com.charis_united.lmd.cac16.Details_Activity.OLADELOYE;
import com.charis_united.lmd.cac16.Details_Activity.OLADIMEJI;
import com.charis_united.lmd.cac16.Details_Activity.OLAITAN;
import com.charis_united.lmd.cac16.Details_Activity.OLANIPEKUN;
import com.charis_united.lmd.cac16.Details_Activity.OLAOLUWA;
import com.charis_united.lmd.cac16.Details_Activity.OLUWAFEMI;
import com.charis_united.lmd.cac16.Details_Activity.OLUWASEYI_B;
import com.charis_united.lmd.cac16.Details_Activity.OMOJOLAGBE;
import com.charis_united.lmd.cac16.Details_Activity.OMOKEHINDE;
import com.charis_united.lmd.cac16.Details_Activity.OMOLOLA;
import com.charis_united.lmd.cac16.Details_Activity.ORIDUPA;
import com.charis_united.lmd.cac16.Details_Activity.OROTAYO;
import com.charis_united.lmd.cac16.Details_Activity.OYEDEJI;
import com.charis_united.lmd.cac16.Details_Activity.OYEJOLA;
import com.charis_united.lmd.cac16.Details_Activity.POPOOLA;
import com.charis_united.lmd.cac16.Details_Activity.SHITTU;
import com.charis_united.lmd.cac16.Details_Activity.TIJANI;
import com.charis_united.lmd.cac16.R;

/**
 * Created by Baba2nde on 9/28/2016.
 */
public class MyViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {


    ImageView img;
    TextView nameTxt;
    ItemClickListener itemClickListener;

    public MyViewholder(final View itemView)
    {
        super(itemView);

        nameTxt = (TextView) itemView.findViewById(R.id.tvVersionName);
        img = (ImageView)   itemView.findViewById(R.id.iconId);
                            itemView.setOnClickListener(this);

        itemView.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v)
            {
                switch (getAdapterPosition())
                {

                    case 0:
                        Intent intent = new Intent(itemView.getContext(), ABEGUN.class);
                        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(),v.getWidth());
                        itemView.getContext().startActivity(intent, optionsCompat.toBundle());
                        break;
                    case 1:
                        Intent q = new Intent(itemView.getContext(), ABIODUN_KEHINDE_DAVID.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(q, optionsCompat.toBundle());
                        break;
                    case 2:
                        Intent A = new Intent(itemView.getContext(), ABIOYE.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(A);
                        break;
                    case 3:
                        Intent AD = new Intent(itemView.getContext(), ADEDIPE.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(AD);
                        break;
                    case 4:
                        Intent qa = new Intent(itemView.getContext(), ADEGBOYEGA.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(qa);
                        break;
                    case 5:
                        Intent mk = new Intent(itemView.getContext(), ADELEYE.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(mk);
                        break;
                    case 6:
                        Intent MN = new Intent(itemView.getContext(), ADEOBA_OPEYEMI.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(MN);
                        break;
                    case 7:
                        Intent CV = new Intent(itemView.getContext(), ADEOLA_DAMILOLA.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(CV);
                        break;
                    case 8:
                        Intent CD = new Intent(itemView.getContext(), ADEOTI.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(CD);
                        break;
                    case 9:
                        Intent WE = new Intent(itemView.getContext(), ADESUGBA_ADEJOKE.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(WE);
                        break;
                    case 10:
                        Intent RE = new Intent(itemView.getContext(), ADEYELU.class);
                        optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, 0, 0, v.getHeight(), v.getWidth());
                        itemView.getContext().startActivity(RE);
                        break;
                    case 11:
                        Intent RT = new Intent(itemView.getContext(), ADEYEYE.class);
                        itemView.getContext().startActivity(RT);
                        break;
                    case 12:
                        Intent intentR = new Intent(itemView.getContext(), ADULOJU.class);
                        itemView.getContext().startActivity(intentR);
                        break;
                    case 13:
                        Intent intentE = new Intent(itemView.getContext(), AFOWOWE.class);
                        itemView.getContext().startActivity(intentE);
                        break;
                    case 14:
                        Intent BY = new Intent(itemView.getContext(), AGBOOLA.class);
                        itemView.getContext().startActivity(BY);
                        break;
                    case 15:
                        Intent VY = new Intent(itemView.getContext(), AJAKAYE.class);
                        itemView.getContext().startActivity(VY
                        );
                        break;
                    case 16:
                        Intent ZA = new Intent(itemView.getContext(), AJAO.class);
                        itemView.getContext().startActivity(ZA);
                        break;
                    case 17:
                        Intent RET = new Intent(itemView.getContext(), AJAO_IDOWU.class);
                        itemView.getContext().startActivity(RET);
                        break;
                    case 18:
                    Intent AJE = new Intent(itemView.getContext(), AJEIGBE.class);
                    itemView.getContext().startActivity(AJE);
                    break;
                    case 19:
                        Intent AKEJU = new Intent(itemView.getContext(), com.charis_united.lmd.cac16.Details_Activity.AKEJU.class);
                        itemView.getContext().startActivity(AKEJU);
                        break;
                    case 20:
                        Intent AKIN = new Intent(itemView.getContext(), AKINBUSOLA.class);
                        itemView.getContext().startActivity(AKIN);
                        break;
                    case 21:
                        Intent AKINDE = new Intent(itemView.getContext(), com.charis_united.lmd.cac16.Details_Activity.AKINDE.class);
                        itemView.getContext().startActivity(AKINDE);
                        break;
                    case 22:
                        Intent AKINLABI = new Intent(itemView.getContext(), com.charis_united.lmd.cac16.Details_Activity.AKINLABI.class);
                        itemView.getContext().startActivity(AKINLABI);
                        break;
                    case 23:
                        Intent AKINWALE = new Intent(itemView.getContext(), com.charis_united.lmd.cac16.Details_Activity.AKINWALE.class);
                        itemView.getContext().startActivity(AKINWALE);
                        break;
                    case 24:
                        Intent CDF = new Intent(itemView.getContext(), AKINYELE.class);
                        itemView.getContext().startActivity(CDF);
                        break;
                    case 25:
                        Intent AK = new Intent(itemView.getContext(), AKOMOLAFE.class);
                        itemView.getContext().startActivity(AK);
                        break;
                    case 26:
                        Intent AL = new Intent(itemView.getContext(), ALADEGBAMI.class);
                        itemView.getContext().startActivity(AL);
                        break;
                    case 27:
                        Intent ALEB = new Intent(itemView.getContext(), ALEBIOWU.class);
                        itemView.getContext().startActivity(ALEB);
                        break;
                    case 28:
                        Intent APA = new Intent(itemView.getContext(), APALARA.class);
                        itemView.getContext().startActivity(APA);
                        break;
                    case 29:
                        Intent APAT = new Intent(itemView.getContext(), APATA.class);
                        itemView.getContext().startActivity(APAT);
                        break;
                    case 30:
                        Intent ASA = new Intent(itemView.getContext(), ASAOLU.class);
                        itemView.getContext().startActivity(ASA);
                        break;
                    case 31:
                        Intent OP = new Intent(itemView.getContext(), ASOGBON.class);
                        itemView.getContext().startActivity(OP);
                        break;
                    case 32:
                        Intent AW = new Intent(itemView.getContext(), AWE.class);
                        itemView.getContext().startActivity(AW);
                        break;
                    case 33:
                        Intent AWO = new Intent(itemView.getContext(), AWOBUSUYI.class);
                        itemView.getContext().startActivity(AWO);
                        break;
                    case 34:
                        Intent AWOD = new Intent(itemView.getContext(), AWODELE.class);
                        itemView.getContext().startActivity(AWOD);
                        break;
                    case 35:
                        Intent AWON = new Intent(itemView.getContext(), AWONUSI.class);
                        itemView.getContext().startActivity(AWON);
                        break;
                    case 36:
                        Intent JI = new Intent(itemView.getContext(), BABALOLA.class);
                        itemView.getContext().startActivity(JI);
                        break;
                    case 37:
                        Intent KL = new Intent(itemView.getContext(), BAMISAYE.class);
                        itemView.getContext().startActivity(KL);
                        break;
                    case 38:
                        Intent ML = new Intent(itemView.getContext(), DADA.class);
                        itemView.getContext().startActivity(ML);
                        break;
                    case 39:
                        Intent GL = new Intent(itemView.getContext(), DARAMOLA.class);
                        itemView.getContext().startActivity(GL);
                        break;
                    case 40:
                        Intent VGH = new Intent(itemView.getContext(), EGBEDEYI.class);
                        itemView.getContext().startActivity(VGH);
                        break;
                    case 41:
                        Intent HJ = new Intent(itemView.getContext(), EHINFUNJOWO.class);
                        itemView.getContext().startActivity(HJ);
                        break;
                    case 42:
                        Intent NM = new Intent(itemView.getContext(), ELEHINAFE.class);
                        itemView.getContext().startActivity(NM);
                        break;
                    case 43:
                        Intent KOL = new Intent(itemView.getContext(), ELUFOWOJU.class);
                        itemView.getContext().startActivity(KOL);
                        break;
                    case 44:
                        Intent intentH = new Intent(itemView.getContext(), ESOSE.class);
                        itemView.getContext().startActivity(intentH);
                        break;
                    case 45:
                        Intent KIO = new Intent(itemView.getContext(), FADODUN.class);
                        itemView.getContext().startActivity(KIO);
                        break;
                    case 46:
                        Intent NIO = new Intent(itemView.getContext(), FALODUN.class);
                        itemView.getContext().startActivity(NIO);
                        break;
                    case 47:
                        Intent FAMI = new Intent(itemView.getContext(), FAMILUSI.class);
                        itemView.getContext().startActivity(FAMI);
                        break;
                    case 48:
                        Intent TYU = new Intent(itemView.getContext(), FASANYA.class);
                        itemView.getContext().startActivity(TYU);
                        break;
                    case 49:
                        Intent intentP= new Intent(itemView.getContext(), FATOYINBO.class);
                        itemView.getContext().startActivity(intentP);
                        break;
                    case 50:
                        Intent intentK = new Intent(itemView.getContext(), FATOYINBO_OPEYEMI.class);
                        itemView.getContext().startActivity(intentK);
                        break;
                    case 51:
                        Intent KLM = new Intent(itemView.getContext(), FOLORUNSO.class);
                        itemView.getContext().startActivity(KLM);
                        break;
                    case 52:
                        Intent MEN = new Intent(itemView.getContext(), GBAJUOLA.class);
                        itemView.getContext().startActivity(MEN);
                        break;
                    case 53:
                        Intent intentC = new Intent(itemView.getContext(), GEORGE.class);
                        itemView.getContext().startActivity(intentC);
                        break;
                    case 54:
                        Intent intentV = new Intent(itemView.getContext(), IGE.class);
                        itemView.getContext().startActivity(intentV);
                        break;
                    case 55:
                        Intent intentW = new Intent(itemView.getContext(), ILUMOKA.class);
                        itemView.getContext().startActivity(intentW);
                        break;
                    case 56:
                        Intent intentQ = new Intent(itemView.getContext(), IYUN.class);
                        itemView.getContext().startActivity(intentQ);
                        break;
                    case 57:
                        Intent NIOW = new Intent(itemView.getContext(), KOLAWOLE.class);
                        itemView.getContext().startActivity(NIOW);
                        break;
                    case 58:
                        Intent FAMIW = new Intent(itemView.getContext(), LIBAMOYO.class);
                        itemView.getContext().startActivity(FAMIW);
                        break;
                    case 59:
                        Intent TYUW = new Intent(itemView.getContext(), MABIGUN.class);
                        itemView.getContext().startActivity(TYUW);
                        break;
                    case 60:
                        Intent intentPW= new Intent(itemView.getContext(), MOGAJI.class);
                        itemView.getContext().startActivity(intentPW);
                        break;
                    case 61:
                        Intent intentKW = new Intent(itemView.getContext(), ODEBUNMI.class);
                        itemView.getContext().startActivity(intentKW);
                        break;
                    case 62:
                        Intent KLMW = new Intent(itemView.getContext(), ODEYINKA.class);
                        itemView.getContext().startActivity(KLMW);
                        break;
                    case 63:
                        Intent MENW = new Intent(itemView.getContext(), OGBIYE.class);
                        itemView.getContext().startActivity(MENW);
                        break;
                    case 64:
                        Intent intentCQ = new Intent(itemView.getContext(), OGUNDELE.class);
                        itemView.getContext().startActivity(intentCQ);
                        break;
                    case 65:
                        Intent intentVQ = new Intent(itemView.getContext(), OGUNDINIYI.class);
                        itemView.getContext().startActivity(intentVQ);
                        break;
                    case 66:
                    Intent intentWQ = new Intent(itemView.getContext(), OGUNGBADE.class);
                    itemView.getContext().startActivity(intentWQ);
                    break;
                    case 67:
                        Intent intentQQ = new Intent(itemView.getContext(), OGUNMOYIN.class);
                        itemView.getContext().startActivity(intentQQ);
                        break;
                    case 68:
                        Intent intentWQQ = new Intent(itemView.getContext(), OGUNRONBI.class);
                        itemView.getContext().startActivity(intentWQQ);
                        break;
                    case 69:
                        Intent intentQQQ = new Intent(itemView.getContext(), OGUNROTIMI.class);
                        itemView.getContext().startActivity(intentQQQ);
                        break;
                    case 70:
                        Intent intentWQW = new Intent(itemView.getContext(), OGUNSINA.class);
                        itemView.getContext().startActivity(intentWQW);
                        break;
                    case 71:
                        Intent intentQAQ = new Intent(itemView.getContext(), OJELADE.class);
                        itemView.getContext().startActivity(intentQAQ);
                        break;
                    case 72:
                        Intent intentWQZ = new Intent(itemView.getContext(), OJO.class);
                        itemView.getContext().startActivity(intentWQZ);
                        break;
                    case 73:
                        Intent intentQQS = new Intent(itemView.getContext(), OKEOWO.class);
                        itemView.getContext().startActivity(intentQQS);
                        break;
                    case 74:
                        Intent intentWQX = new Intent(itemView.getContext(), OKOILU.class);
                        itemView.getContext().startActivity(intentWQX);
                        break;
                    case 75:
                        Intent intentQQV = new Intent(itemView.getContext(), OLABODE.class);
                        itemView.getContext().startActivity(intentQQV);
                        break;
                    case 76:
                        Intent intentWQC = new Intent(itemView.getContext(), OLADELOYE.class);
                        itemView.getContext().startActivity(intentWQC);
                        break;
                    case 77:
                        Intent intenTYU = new Intent(itemView.getContext(), OLADIMEJI.class);
                        itemView.getContext().startActivity(intenTYU);
                        break;
                    case 78:
                        Intent intentWQT = new Intent(itemView.getContext(), OLAITAN.class);
                        itemView.getContext().startActivity(intentWQT);
                        break;
                    case 79:
                        Intent intentQQH = new Intent(itemView.getContext(), OLANIPEKUN.class);
                        itemView.getContext().startActivity(intentQQH);
                        break;
                    case 80:
                        Intent HUY = new Intent(itemView.getContext(), OLAOLUWA.class);
                        itemView.getContext().startActivity(HUY);
                        break;
                    case 81:
                        Intent UI = new Intent(itemView.getContext(), OLUWAFEMI.class);
                        itemView.getContext().startActivity(UI);
                        break;
                    case 82:
                        Intent intentWQB = new Intent(itemView.getContext(), OLUWASEYI_B.class);
                        itemView.getContext().startActivity(intentWQB);
                        break;
                    case 83:
                        Intent intentQQM = new Intent(itemView.getContext(), OMOJOLAGBE.class);
                        itemView.getContext().startActivity(intentQQM);
                        break;
                    case 84:
                        Intent intentWD = new Intent(itemView.getContext(), OMOKEHINDE.class);
                        itemView.getContext().startActivity(intentWD);
                        break;
                    case 85:
                        Intent intentQQI = new Intent(itemView.getContext(), OMOLOLA.class);
                        itemView.getContext().startActivity(intentQQI);
                        break;
                    case 86:
                        Intent intentWM = new Intent(itemView.getContext(), ORIDUPA.class);
                        itemView.getContext().startActivity(intentWM);
                        break;
                    case 87:
                        Intent intentQQL = new Intent(itemView.getContext(), OROTAYO.class);
                        itemView.getContext().startActivity(intentQQL);
                        break;
                    case 88:
                        Intent intentWQIO = new Intent(itemView.getContext(), OYEDEJI.class);
                        itemView.getContext().startActivity(intentWQIO);
                        break;
                    case 89:
                        Intent intentQQOP = new Intent(itemView.getContext(), OYEJOLA.class);
                        itemView.getContext().startActivity(intentQQOP);
                        break;
                    case 90:
                        Intent intentIO = new Intent(itemView.getContext(), POPOOLA.class);
                        itemView.getContext().startActivity(intentIO);
                        break;
                    case 91:
                        Intent BABS = new Intent(itemView.getContext(), SHITTU.class);
                        itemView.getContext().startActivity(BABS);
                        break;
                    case 92:
                    Intent YU = new Intent(itemView.getContext(), TIJANI.class);
                    itemView.getContext().startActivity(YU);
                    break;
                    case 93:
                        Intent BABSv = new Intent(itemView.getContext(), ADENIJI_ADEDOYIN.class);
                        itemView.getContext().startActivity(BABSv);
                        break;
                    case 94:
                        Intent YwU = new Intent(itemView.getContext(), ADENIJI_STEPHEN.class);
                        itemView.getContext().startActivity(YwU);
                        break;
                    case 95:
                        Intent YUv = new Intent(itemView.getContext(), ALADEYELU.class);
                        itemView.getContext().startActivity(YUv);
                        break;

                }
            }
        });



    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;


    }


    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());

    }
}
