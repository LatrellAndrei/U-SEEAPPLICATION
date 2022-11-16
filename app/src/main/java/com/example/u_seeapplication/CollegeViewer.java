package com.example.u_seeapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CollegeViewer extends AppCompatActivity {

    ListView listView;
    ListViewCollegeAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegeviewer);



        title = new String[]
                {"COLLEGE OF INFORMATION TECHNOLOGY AND COMPUTER SCIENCE",
                "COLLEGE OF ACCOUNTANCY",
                "COLLEGE OF ENGINEERING AND ARCHITECTURE",
                "COLLEGE OF TEACHER EDUCATION",
                "COLLEGE OF ARTS AND SCIENCES",
                "COLLEGE OF BUSINESS ADMINISTRATION",
                "COLLEGE OF HOSPITALITY AND TOURISM MANAGEMENT",
                        "COLLEGE OF NURSING,",
                        "COLLEGE OF LAW"};
        description = new String[]
                        {"CITCS",
                         "COA",
                         "CEA",
                         "CTE",
                        "CAS",
                          "CBA",
                        "CHTM",
                        "CON",
                        "COL"};

        icon = new int[]
                        {R.drawable.citcsbanner,
                         R.drawable.coabanner,
                         R.drawable.ceabanner,
                                R.drawable.ic_launcher_playstore,
                                R.drawable.ic_launcher_playstore,
                                R.drawable.ic_launcher_playstore,
                                R.drawable.ic_launcher_playstore,
                                R.drawable.ic_launcher_playstore,
                                R.drawable.ic_launcher_playstore,};



        listView = findViewById(R.id.listView);
        for(int i = 0; i<title.length; i++){
            Model model = new Model (title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }
        //pass result to listViewAdapter class
        adapter = new ListViewCollegeAdapter(this, arrayList);
        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

}
/* design row of listView
* Adding Menu to add searchview in actionbar
* add model class
*add adapter clas
* add some images in drawable folder
* Run Project and test the listview and searchview*/

