package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite_OpenHelper extends SQLiteOpenHelper{


    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creamos la tabla  usuarios
        String query="create table usuarios(_ID integer primary key autoincrement,Nombre text,Password txt,Correo txt);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



    //METODO QUE MEPERMITE ABRIR LA BD
    public void abrir(){
        this.getWritableDatabase();


    }

    //METODO QUE ME PERMITE CERRAR LA BD

    public void cerrar(){
        this.close();

    }

    //METODO QUE ME PERMITE INSERTAR REGISTRO EN LA TABLA USUARIO
    public void insertarReg(String nom,String pa,String cor){
        ContentValues valores=new ContentValues();
        valores.put("Nombre",nom);
        valores.put("Password",pa);
        valores.put("Correo",cor);

        this.getWritableDatabase().insert("usuarios",null,valores);


    }

    //metodo que me permite validar si el usuario existe

    public Cursor consultarUsuario(String usu,String pas) throws SQLException{

        Cursor mcursor=null;
        mcursor=this.getReadableDatabase().query("usuarios",new String[]{"_ID","Nombre","Password","Correo"},"Nombre like'"+usu+"'and Password like '"+pas+"'",null,null,null,null);


        return mcursor;
    }







}
