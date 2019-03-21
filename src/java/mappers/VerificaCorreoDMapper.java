package mappers;


import beans.DatosBean;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerificaCorreoDMapper implements Mapper {

    public Object mapRow(ResultSet rs) throws SQLException {
        DatosBean dat = new DatosBean();
        
        if (rs.getString("CUENTA_CONSTRUIDA") != null) {
            dat.setCORREO(rs.getString("CUENTA_CONSTRUIDA").trim());
        } else {
            dat.setCORREO(rs.getString("CUENTA_CONSTRUIDA"));
        }
        if (rs.getString("CURP") != null) {
            dat.setCURPA(rs.getString("CURP").trim());
        } else {
            dat.setCURPA(rs.getString("CURP"));
        }
        
        return dat;
    }

}
