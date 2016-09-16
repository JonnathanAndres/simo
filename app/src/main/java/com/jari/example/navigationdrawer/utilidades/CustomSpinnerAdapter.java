//package com.jari.example.navigationdrawer.utilidades;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//
//import com.jari.example.navigationdrawer.models.parametros.Nivel;
//
///**
// * Created by Jonnathan on 11/09/2016.
// */
//public class CustomSpinnerAdapter {
//
//    public static CustomSpinnerAdapter<NIvel> DevuelveTipoPrestamoConYSinCondicionesEspecialesArrayAdapter(Context context, LayoutInflater inflater, int secuencialModalidadCreditoCliente, boolean tieneCondicionesEspeciales) throws  Exception
//    {
//
//        TipoPrestamoConYSinCondicionesEspecialesMS listaTipoPrestamoMS = new TipoPrestamoActor(context).DevuelveTipoPrestamoConYSinCondicionesEspecialesMS(
//                true,
//                true,
//                true,
//                secuencialModalidadCreditoCliente);
//
//        ArrayList<TipoPrestamoMSE> tipoPrestamoMSEList = new ArrayList<>();
//        String prompt = "";
//
//        if(tieneCondicionesEspeciales) {
//            prompt = "Condiciones Especiales";
//            tipoPrestamoMSEList.add(new TipoPrestamoMSE("0", "Condiciones Especiales"));
//            if(secuencialModalidadCreditoCliente!=0)
//                tipoPrestamoMSEList.addAll(listaTipoPrestamoMS.getListaTipoPrestamoConCondicionesEspeciales());
//        }
//        else {
//            prompt = "Tipo Producto y Crédito";
//            tipoPrestamoMSEList.add(new TipoPrestamoMSE("0", "Tipo Producto y Crédito"));
//            if(secuencialModalidadCreditoCliente!=0)
//                tipoPrestamoMSEList.addAll(listaTipoPrestamoMS.getListaTipoPrestamoSinCondicionesEspeciales());
//        }
//
//
//        CustomSpinnerAdapter tipoPrestamoAdapter = new CustomSpinnerAdapter(context, R.layout.custom_spinner,inflater,tipoPrestamoMSEList,prompt,"Codigo","Nombre");
//
//        return tipoPrestamoAdapter;
//    }
//
//}
