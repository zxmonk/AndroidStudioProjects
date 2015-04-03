package com.zxmonk.activitylifecycletest;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends BaseActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this,
                R.layout.fruit_item, fruitList);

        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(ListViewActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_view, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.apple);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.orange);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.pear);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.grape);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.cherry);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.mango);
        fruitList.add(mango);

        fruitList.add(apple);

        fruitList.add(banana);

        fruitList.add(orange);

        fruitList.add(watermelon);

        fruitList.add(pear);

        fruitList.add(grape);

        fruitList.add(pineapple);

        fruitList.add(strawberry);

        fruitList.add(cherry);

        fruitList.add(mango);
        fruitList.add(mango);

        fruitList.add(apple);

        fruitList.add(banana);

        fruitList.add(orange);

        fruitList.add(watermelon);

        fruitList.add(pear);

        fruitList.add(grape);

        fruitList.add(pineapple);

        fruitList.add(strawberry);

        fruitList.add(cherry);

        fruitList.add(mango);
        fruitList.add(mango);

        fruitList.add(apple);

        fruitList.add(banana);

        fruitList.add(orange);

        fruitList.add(watermelon);

        fruitList.add(pear);

        fruitList.add(grape);

        fruitList.add(pineapple);

        fruitList.add(strawberry);

        fruitList.add(cherry);

        fruitList.add(mango);
    }
}
