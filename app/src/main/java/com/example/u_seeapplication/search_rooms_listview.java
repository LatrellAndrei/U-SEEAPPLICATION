package com.example.u_seeapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class search_rooms_listview extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_rooms_listview);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Search");

        title = new String[]
                {"M301",
                "M302(CITCS department)",
                "M303",
                "M304",
                "M305",
                "M306",
                "M307",
                "S312",
                "GYM",
                "M203(COA department)",
                "M210",
                "S214(CEA department)",
                "S216(CTE department)",
                "S220",
                "G204",
                "F802a(CHTM department)",
                "F802b(CBA department)",
                "5005(Nursing department)",
                "U605(Law department)",
                "4005(CAS department)",
                "U601(Moot Court)",
                "U204",
                "F503",
                "S107"};
        description = new String[]
                {
                "Main Building",
                "Main Building",
                "Main Building",
                "Main Building",
                "Main Building",
                "Main Building",
                "Main Building",
                "Science Building",
                "PE Building",
                "Main Building",
                "Main Building",
                "Science Building",
                "Science Building",
                "Science Building",
                "PE Building",
                "EDS Building",
                "EDS Building",
                "EDS Building",
                "BRS Building",
                "EDS Building",
                "BRS Building",
                "BRS Building",
                "EDS Building",
                "Science Building"};

        icon = new int[]
                        {R.drawable.m301,
                         R.drawable.m302,
                         R.drawable.m303,
                         R.drawable.m304,
                         R.drawable.m305,
                         R.drawable.m306,
                         R.drawable.m307,
                         R.drawable.s312,
                         R.drawable.gym,
                         R.drawable.coa,
                         R.drawable.m210,
                         R.drawable.cea,
                         R.drawable.cte,
                         R.drawable.s220,
                         R.drawable.g204,
                         R.drawable.chtm,
                         R.drawable.cba,
                         R.drawable.nursing,
                         R.drawable.col,
                         R.drawable.cas,
                         R.drawable.u601,
                         R.drawable.u204,
                         R.drawable.f503,
                        R.drawable.s107};



        listView = findViewById(R.id.listView);
        for(int i = 0; i<title.length; i++){
            Model model = new Model (title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }
        //pass result to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);
        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();

                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }


}
/* design row of listView
* Adding Menu to add searchview in actionbar
* add model class
*add adapter clas
* add some images in drawable folder
* Run Project and test the listview and searchview*/

