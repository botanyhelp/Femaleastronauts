/**Copyright (C) 2013 Thomas Maher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.jimsuplee.femaleastronauts;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;

//import android.app.ListActivity;
//import android.content.Intent;
//import android.widget.ListView;
//import android.widget.ArrayAdapter;
//import java.util.ArrayList;
//import java.util.List;
//import android.view.View;
//import android.content.Intent;
//import android.util.Log;
import android.widget.TextView;
import java.util.HashMap;
//import java.util.Map;
//import android.graphics.Color;
import android.widget.ImageView;
//import android.widget.TextView;

public class Astronaut extends Activity {
	HashMap<String,Integer> photoMap = new HashMap<String,Integer>();
	HashMap<String,Integer> astronautMap = new HashMap<String,Integer>();
	static final String TAG = "ASTRO";
	@Override
	public void onCreate(Bundle savedInstanceState) {
        //String astronautChoice = data.getData().toString();
		//Log.w(TAG, "In Astronaut, about to super.onCreate");
	    super.onCreate(savedInstanceState);
	    //Log.w(TAG, "In Astronaut, done super.onCreate, about to fill astronautMap");
	    //astronautMap.put("Shannon_Walker", R.string.Shannon_Walker);
		//astronautMap.put("Dorothy_Marie_Dottie_Metcalf_Lindenburger", R.string.Dorothy_Marie_Dottie_Metcalf_Lindenburger);
	    astronautMap.put("Valentina_Tereshkova", R.string.Valentina_Tereshkova);
	    astronautMap.put("Svetlana_Savitskaya", R.string.Svetlana_Savitskaya);
	    astronautMap.put("Sally_Ride", R.string.Sally_Ride);
	    astronautMap.put("Judith_Resnik", R.string.Judith_Resnik);
	    astronautMap.put("Kathryn_D_Sullivan", R.string.Kathryn_D_Sullivan);
	    astronautMap.put("Anna_Lee_Fisher", R.string.Anna_Lee_Fisher);
	    astronautMap.put("Margaret_Rhea_Seddon", R.string.Margaret_Rhea_Seddon);
	    astronautMap.put("Shannon_Lucid", R.string.Shannon_Lucid);
	    astronautMap.put("Bonnie_J_Dunbar", R.string.Bonnie_J_Dunbar);
	    astronautMap.put("Mary_L_Cleave", R.string.Mary_L_Cleave);
	    astronautMap.put("Ellen_S_Baker", R.string.Ellen_S_Baker);
	    astronautMap.put("Kathryn_C_Thornton", R.string.Kathryn_C_Thornton);
	    astronautMap.put("Marsha_Ivins", R.string.Marsha_Ivins);
	    astronautMap.put("Linda_M_Godwin", R.string.Linda_M_Godwin);
	    astronautMap.put("Helen_Sharman", R.string.Helen_Sharman);
	    astronautMap.put("Tamara_E_Jernigan", R.string.Tamara_E_Jernigan);
	    astronautMap.put("Millie_Hughes_Fulford", R.string.Millie_Hughes_Fulford);
	    astronautMap.put("Roberta_Bondar", R.string.Roberta_Bondar);
	    astronautMap.put("Jan_Davis", R.string.Jan_Davis);
	    astronautMap.put("Mae_Jemison", R.string.Mae_Jemison);
	    astronautMap.put("Susan_J_Helms", R.string.Susan_J_Helms);
	    astronautMap.put("Ellen_Ochoa", R.string.Ellen_Ochoa);
	    astronautMap.put("Janice_E_Voss", R.string.Janice_E_Voss);
	    astronautMap.put("Nancy_J_Currie", R.string.Nancy_J_Currie);
	    astronautMap.put("Chiaki_Mukai", R.string.Chiaki_Mukai);
	    astronautMap.put("Yelena_V_Kondakova", R.string.Yelena_V_Kondakova);
	    astronautMap.put("Eileen_Collins", R.string.Eileen_Collins);
	    astronautMap.put("Wendy_B_Lawrence", R.string.Wendy_B_Lawrence);
	    astronautMap.put("Mary_E_Weber", R.string.Mary_E_Weber);
	    astronautMap.put("Catherine_Coleman", R.string.Catherine_Coleman);
	    astronautMap.put("Claudie_Haignere", R.string.Claudie_Haignere);
	    astronautMap.put("Susan_Still_Kilrain", R.string.Susan_Still_Kilrain);
	    astronautMap.put("Kalpana_Chawla", R.string.Kalpana_Chawla);
	    astronautMap.put("Kathryn_P_Hire", R.string.Kathryn_P_Hire);
	    astronautMap.put("Janet_L_Kavandi", R.string.Janet_L_Kavandi);
	    astronautMap.put("Julie_Payette", R.string.Julie_Payette);
	    astronautMap.put("Pamela_Melroy", R.string.Pamela_Melroy);
	    astronautMap.put("Peggy_Whitson", R.string.Peggy_Whitson);
	    astronautMap.put("Sandra_Magnus", R.string.Sandra_Magnus);
	    astronautMap.put("Laurel_B_Clark", R.string.Laurel_B_Clark);
	    astronautMap.put("Stephanie_Wilson", R.string.Stephanie_Wilson);
	    astronautMap.put("Lisa_Nowak", R.string.Lisa_Nowak);
	    astronautMap.put("Heidemarie_M_Stefanyshyn_Piper", R.string.Heidemarie_M_Stefanyshyn_Piper);
	    astronautMap.put("Anousheh_Ansari", R.string.Anousheh_Ansari);
	    astronautMap.put("Sunita_Williams", R.string.Sunita_Williams);
	    astronautMap.put("Joan_Higginbotham", R.string.Joan_Higginbotham);
	    astronautMap.put("Tracy_Caldwell_Dyson", R.string.Tracy_Caldwell_Dyson);
	    astronautMap.put("Barbara_Morgan", R.string.Barbara_Morgan);
	    astronautMap.put("Yi_So_yeon", R.string.Yi_So_yeon);
	    astronautMap.put("Karen_L_Nyberg", R.string.Karen_L_Nyberg);
	    astronautMap.put("K_Megan_McArthur", R.string.K_Megan_McArthur);
	    astronautMap.put("Nicole_P_Stott", R.string.Nicole_P_Stott);
	    astronautMap.put("Dorothy_Metcalf_Lindenburger", R.string.Dorothy_Metcalf_Lindenburger);
	    astronautMap.put("Naoko_Yamazaki", R.string.Naoko_Yamazaki);
	    astronautMap.put("Shannon_Walker", R.string.Shannon_Walker);
	    astronautMap.put("Liu_Yang", R.string.Liu_Yang);
	    astronautMap.put("Wang_Yaping", R.string.Wang_Yaping);
        //photoMap.put("Shannon_Walker", R.drawable.shannon_walker);
		//photoMap.put("Dorothy_Marie_Dottie_Metcalf_Lindenburger", R.drawable.dorothy_marie_dottie_metcalf_lindenburger);
	    //Log.w(TAG, "In Astronaut, astronautMap done about to photoMap");
	    photoMap.put("Valentina_Tereshkova", R.drawable.valentina_tereshkova_big);
	    photoMap.put("Svetlana_Savitskaya", R.drawable.svetlana_savitskaya_big);
	    photoMap.put("Sally_Ride", R.drawable.sally_ride_big);
	    photoMap.put("Judith_Resnik", R.drawable.judith_resnik_big);
	    photoMap.put("Kathryn_D_Sullivan", R.drawable.kathryn_d_sullivan_big);
	    photoMap.put("Anna_Lee_Fisher", R.drawable.anna_lee_fisher_big);
	    photoMap.put("Margaret_Rhea_Seddon", R.drawable.margaret_rhea_seddon_big);
	    photoMap.put("Shannon_Lucid", R.drawable.shannon_lucid_big);
	    photoMap.put("Bonnie_J_Dunbar", R.drawable.bonnie_j_dunbar_big);
	    photoMap.put("Mary_L_Cleave", R.drawable.mary_l_cleave_big);
	    photoMap.put("Ellen_S_Baker", R.drawable.ellen_s_baker_big);
	    photoMap.put("Kathryn_C_Thornton", R.drawable.kathryn_c_thornton_big);
	    photoMap.put("Marsha_Ivins", R.drawable.marsha_ivins_big);
	    photoMap.put("Linda_M_Godwin", R.drawable.linda_m_godwin_big);
	    photoMap.put("Helen_Sharman", R.drawable.helen_sharman_big);
	    photoMap.put("Tamara_E_Jernigan", R.drawable.tamara_e_jernigan_big);
	    photoMap.put("Millie_Hughes_Fulford", R.drawable.millie_hughes_fulford_big);
	    photoMap.put("Roberta_Bondar", R.drawable.roberta_bondar_big);
	    photoMap.put("Jan_Davis", R.drawable.jan_davis_big);
	    photoMap.put("Mae_Jemison", R.drawable.mae_jemison_big);
	    photoMap.put("Susan_J_Helms", R.drawable.susan_j_helms_big);
	    photoMap.put("Ellen_Ochoa", R.drawable.ellen_ochoa_big);
	    photoMap.put("Janice_E_Voss", R.drawable.janice_e_voss_big);
	    photoMap.put("Nancy_J_Currie", R.drawable.nancy_j_currie_big);
	    photoMap.put("Chiaki_Mukai", R.drawable.chiaki_mukai_big);
	    photoMap.put("Yelena_V_Kondakova", R.drawable.yelena_v_kondakova_big);
	    photoMap.put("Eileen_Collins", R.drawable.eileen_collins_big);
	    photoMap.put("Wendy_B_Lawrence", R.drawable.wendy_b_lawrence_big);
	    photoMap.put("Mary_E_Weber", R.drawable.mary_e_weber_big);
	    photoMap.put("Catherine_Coleman", R.drawable.catherine_coleman_big);
	    photoMap.put("Claudie_Haignere", R.drawable.claudie_haignere_big);
	    photoMap.put("Susan_Still_Kilrain", R.drawable.susan_still_kilrain_big);
	    photoMap.put("Kalpana_Chawla", R.drawable.kalpana_chawla_big);
	    photoMap.put("Kathryn_P_Hire", R.drawable.kathryn_p_hire_big);
	    photoMap.put("Janet_L_Kavandi", R.drawable.janet_l_kavandi_big);
	    photoMap.put("Julie_Payette", R.drawable.julie_payette_big);
	    photoMap.put("Pamela_Melroy", R.drawable.pamela_melroy_big);
	    photoMap.put("Peggy_Whitson", R.drawable.peggy_whitson_big);
	    photoMap.put("Sandra_Magnus", R.drawable.sandra_magnus_big);
	    photoMap.put("Laurel_B_Clark", R.drawable.laurel_b_clark_big);
	    photoMap.put("Stephanie_Wilson", R.drawable.stephanie_wilson_big);
	    photoMap.put("Lisa_Nowak", R.drawable.lisa_nowak_big);
	    photoMap.put("Heidemarie_M_Stefanyshyn_Piper", R.drawable.heidemarie_m_stefanyshyn_piper_big);
	    photoMap.put("Anousheh_Ansari", R.drawable.anousheh_ansari_big);
	    photoMap.put("Sunita_Williams", R.drawable.sunita_williams_big);
	    photoMap.put("Joan_Higginbotham", R.drawable.joan_higginbotham_big);
	    photoMap.put("Tracy_Caldwell_Dyson", R.drawable.tracy_caldwell_dyson_big);
	    photoMap.put("Barbara_Morgan", R.drawable.barbara_morgan_big);
	    photoMap.put("Yi_So_yeon", R.drawable.yi_so_yeon_big);
	    photoMap.put("Karen_L_Nyberg", R.drawable.karen_l_nyberg_big);
	    photoMap.put("K_Megan_McArthur", R.drawable.k_megan_mcarthur_big);
	    photoMap.put("Nicole_P_Stott", R.drawable.nicole_p_stott_big);
	    photoMap.put("Dorothy_Metcalf_Lindenburger", R.drawable.dorothy_metcalf_lindenburger_big);
	    photoMap.put("Naoko_Yamazaki", R.drawable.naoko_yamazaki_big);
	    photoMap.put("Shannon_Walker", R.drawable.shannon_walker_big);
	    photoMap.put("Liu_Yang", R.drawable.liu_yang_big);
	    photoMap.put("Wang_Yaping", R.drawable.wang_yaping_big);
	    //Log.w(TAG, "In Astronaut, photoMap done");
	    
	    //Log.w(TAG, "In Astronaut, about to setContentView");
	    setContentView(R.layout.astronauts);
	    
	    //Log.w(TAG, "In Astronaut, about to getIntent().getExtras()");
        Bundle bundle = getIntent().getExtras();
        
        //Log.w(TAG, "In Astronaut, about to bundle.getString");
        String astronaut = bundle.getString("astronautChoice");
        
        //Log.w(TAG, "In Astronaut, about to findViewById(txt_astronautdata");
        TextView tv = (TextView) findViewById(R.id.txt_astronautdata);
        
        //Log.w(TAG, "In Astronaut, about to TextView.setText()");
        tv.setText(astronautMap.get(astronaut));
        
        //Log.w(TAG, "In Astronaut, about to findViewById(imagedetail");
        ImageView iv = (ImageView) findViewById(R.id.imagedetail);
        
        //Log.w(TAG, "In Astronaut, about to setImageResource");
        iv.setImageResource(photoMap.get(astronaut));
        
        //Log.w(TAG, "In Astronaut, done");
	}
}
