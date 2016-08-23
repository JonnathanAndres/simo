package com.jari.example.navigationdrawer.utilidades;

/**
 * Created by admin on 12/08/2016.
 */
public class UtilidadesSharedPreferences {
    public static final String PROPIEDAD_REG_ID = "registration_id";
    public static final String TAG_GCM = "ContactarGcm";
    public static final String PROPIEDAD_APP_VERSION = "appVersion";
    public static final String PROPIEDAD_EXPIRATION_TIME = "onServerExpirationTimeMs";
    public static final long TIEMPO_EXPIRACION_MS = 1000 * 3600 * 24 * 7;//TODO: SEMANA

//    public static void GuardaVariablesGenerales(VariablesGenerales variablesGenerales, Context context)
//    {
//        SharedPreferences sharedPref = context.getSharedPreferences(context.getString(R.string.variables_generales ), Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//
//        editor.putString(context.getString(R.string.variable_usuario),variablesGenerales.getUsuario());
////        editor.putString(context.getString(R.string.variable_session_token),variablesGenerales.getSessionToken());
////        editor.putString(context.getString(R.string.variable_nombre_usuario),variablesGenerales.getNombreUsuario());
////        editor.putInt(context.getString(R.string.variable_secuencial_empresa_usuario), variablesGenerales.getSecuencialEmpresaUsuario());
////        editor.putString(context.getString(R.string.variable_nombre_empresa_usuario), variablesGenerales.getNombreEmpresaUsuario());
////        editor.putString(context.getString(R.string.variable_siglas_empresa_usuario), variablesGenerales.getSiglasEmpresaUsuario());
////        editor.putString(context.getString(R.string.variable_codigo_pais_empresa), variablesGenerales.getCodigoPaisEmpresa());
////        editor.putString(context.getString(R.string.variable_nombre_pais_empresa), variablesGenerales.getNombrePaisEmpresa());
////        editor.putInt(context.getString(R.string.variable_secuencial_oficina), variablesGenerales.getSecuencialOficina());
////        editor.putString(context.getString(R.string.variable_nombre_oficina), variablesGenerales.getNombreOficina());
////        editor.putString(context.getString(R.string.variable_ciudad_oficina), variablesGenerales.getCiudadOficina());
////        editor.putInt(context.getString(R.string.variable_secuencial_division_politica_oficina), variablesGenerales.getSecuencialDivisionPoliticaOficina());
////        editor.putString(context.getString(R.string.variable_nombre_division_politica_oficina), variablesGenerales.getNombreDivisionPoliticaOficina());
////        editor.putInt(context.getString(R.string.variable_secuencial_moneda_oficial_empresa), variablesGenerales.getSecuencialMonedaOficialEmpresa());
////        editor.putString(context.getString(R.string.variable_nombre_moneda_oficial_empresa), variablesGenerales.getNombreMonedaOficialEmpresa());
////        editor.putString(context.getString(R.string.variable_simbolo_moneda_oficial_empresa), variablesGenerales.getSimboloMonedaOficialEmpresa());
////        editor.putLong(context.getString(R.string.variable_fecha_sistema), variablesGenerales.getFechaSistema().getTime());
////        editor.putFloat(context.getString(R.string.variable_porcentaje_iva), variablesGenerales.getPorcentajeIVA());
////        editor.putString(context.getString(R.string.variable_identificacion_empresa), variablesGenerales.getIdentificacionEmpresa());
//        editor.commit();
//    }

//    public static VariablesGenerales DevuelveVariablesGenerales(Context context)
//    {
//        SharedPreferences sharedPref = context.getSharedPreferences(context.getString(R.string.variables_generales), Context.MODE_PRIVATE);
//
//        VariablesGenerales variablesGenerales = new VariablesGenerales(
//                sharedPref.getString(context.getString(R.string.variable_usuario),""),
//                sharedPref.getString(context.getString(R.string.variable_session_token),""),
//                sharedPref.getString(context.getString(R.string.variable_nombre_usuario),""),
//                sharedPref.getInt(context.getString(R.string.variable_secuencial_empresa_usuario), 0),
//                sharedPref.getString(context.getString(R.string.variable_nombre_empresa_usuario),""),
//                sharedPref.getString(context.getString(R.string.variable_siglas_empresa_usuario),""),
//                sharedPref.getString(context.getString(R.string.variable_codigo_pais_empresa),""),
//                sharedPref.getString(context.getString(R.string.variable_nombre_pais_empresa),""),
//                sharedPref.getInt(context.getString(R.string.variable_secuencial_oficina), 0),
//                sharedPref.getString(context.getString(R.string.variable_nombre_oficina),""),
//                sharedPref.getString(context.getString(R.string.variable_ciudad_oficina),""),
//                sharedPref.getInt(context.getString(R.string.variable_secuencial_division_politica_oficina),0),
//                sharedPref.getString(context.getString(R.string.variable_nombre_division_politica_oficina),""),
//                sharedPref.getInt(context.getString(R.string.variable_secuencial_moneda_oficial_empresa), 0),
//                sharedPref.getString(context.getString(R.string.variable_nombre_moneda_oficial_empresa),""),
//                sharedPref.getString(context.getString(R.string.variable_simbolo_moneda_oficial_empresa),""),
//                new Date(sharedPref.getLong(context.getString(R.string.variable_fecha_sistema), -1)),
//                sharedPref.getFloat(context.getString(R.string.variable_porcentaje_iva),0),
//                sharedPref.getString(context.getString(R.string.variable_identificacion_empresa),""));
//
//        return  variablesGenerales;
//    }
}
