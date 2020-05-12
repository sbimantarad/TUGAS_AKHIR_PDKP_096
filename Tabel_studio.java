package BookingMusicStudio;
import javax.swing.table.DefaultTableModel;
public class Tabel_studio { 
private DefaultTableModel tabel = new DefaultTableModel();
        
        public Tabel_studio(){

            getTabel().addColumn("Tipe Studio");
            getTabel().addColumn("Tanggal");
            getTabel().addColumn("Durasi");
            getTabel().addColumn("Nama Pemesan");
            getTabel().addColumn("Nama Band");
            getTabel().addColumn("No Telepon");
       
    }
    public DefaultTableModel getTabel() {
        return tabel;
    }
    
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }     
}