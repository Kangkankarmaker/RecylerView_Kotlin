package kangkan.developer.recylerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val exampleList=generateList(100)
        recylerView.adapter=ExampleAdapter(exampleList)
        recylerView.layoutManager=LinearLayoutManager(this)
        recylerView.setHasFixedSize(true)
    }

    private fun generateList(size: Int):List<ExampleItem>{

        val list=ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable=when(i%3){
                0-> R.drawable.ic_attachment_black_24dp
                1->R.drawable.ic_beach_access_black_24dp
                else->R.drawable.ic_hdr_weak_black_24dp
            }
            val item=ExampleItem(drawable,"Item $i","Line 2")
            list+=item
        }
        return list
    }

}