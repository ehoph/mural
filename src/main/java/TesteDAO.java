import java.sql.SQLException;

public class TesteDAO {
    public static void main(String[] args) throws SQLException{
        RecadoDAO dao = new RecadoDAO();

        dao.cadastrar(new Recado(0,"Professor", "Teste feito pelo console"));

        for (Recado recado : dao.listar()){
            System.out.println(recado.getAutor()+": "+ recado.getMensagem());
        }
    }
}
