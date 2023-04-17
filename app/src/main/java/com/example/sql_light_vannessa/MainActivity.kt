package com.example.sql_light_vannessa

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edt_name: EditText
    private lateinit var edt_email: EditText
    private lateinit var edt_id: EditText
    private lateinit var btn_save: Button
    private lateinit var btn_view: Button
    private lateinit var btn_delete: Button
    private lateinit var db:SQLiteDatabase
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_name = findViewById(R.id.edtname)
        edt_email = findViewById(R.id.edtemail)
        edt_id = findViewById(R.id.edtid)
        btn_delete = findViewById(R.id.btndelete)
        btn_save = findViewById(R.id.btnsave)
        btn_view = findViewById(R.id.btnview)
        
        db = openOrCreateDatabase("emobilisvee", Context.MODE_PRIVATE, null)

        db.execSQL("CREATE TABLE IF NOT EXISTS users( jina VARCHAR, arafa VARCHAR, kitambulisho VARCHAR)")


        btn_save.setOnClickListener {
            var jina_edt = edt_name.text.toString().trim()
            var arafa_edt = edt_email.text.toString().trim()
            var kitambulisho_edt = edt_id.text.toString().trim()

            if (jina_edt.isEmpty()|| kitambulisho_edt.isEmpty()|| arafa_edt.isEmpty()){
                    Toast.makeText(this, "Cannot Submit", Toast.LENGTH_SHORT).show()
                }

            else {
                    db.execSQL("INSERT INTO users VALUES('\"+jina_edt+\"',  '\"+arafa_edt+\"', '\"+kitambulisho_edt+\"')")
                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()


            }

        }

    }
}

git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/vannessambithe/sql.git
git push -u origin main
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
