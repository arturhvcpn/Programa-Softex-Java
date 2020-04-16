package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField textFieldCodigoMotocicleta;

    @FXML
    private TextField textFieldRenavamMotocicleta;

    @FXML
    private TextField textFieldChassiMotocicleta;

    @FXML
    private TextField textFieldModeloMotocicleta;

    @FXML
    private TextField textFieldPlacaMotocicleta;

    @FXML
    private TextField textFieldCorMotocicleta;

    @FXML
    private TextField textFieldAnoMotocicleta;

    @FXML
    private TextField textFieldValorCompra;

    @FXML
    private TextField textFieldValorVenda;

    @FXML
    private Button insertButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<Motocicleta> TableView;

    @FXML
    private TableColumn<Motocicleta, Integer> codigoColumn;

    @FXML
    private TableColumn<Motocicleta, String> renavamColumn;

    @FXML
    private TableColumn<Motocicleta, String> chassiColumn;

    @FXML
    private TableColumn<Motocicleta, String> modeloColumn;

    @FXML
    private TableColumn<Motocicleta, String> placaColumn;

    @FXML
    private TableColumn<Motocicleta, String> corColumn;

    @FXML
    private TableColumn<Motocicleta, Integer> anoColumn;

    @FXML
    private TableColumn<Motocicleta, BigDecimal> valorVendaColumn;

    @FXML
    private TableColumn<Motocicleta, BigDecimal> valorCompraColumn;

    @FXML
    private void insertButton() {
        String query = "insert into tableMotocicleta values("+idMotocicleta.getText()+",'"+textFieldRenavamMotocicleta.getText()+"','"+textFieldChassiMotocicleta.getText()+"','"textFieldModeloMotocicleta.getText()+"','"+textFieldPlacaMotocicleta.getText()+"','"+textFieldCorMotocicleta.getText()+"',"+textFieldAnoMotocicleta.getText()+","+textFieldValorCompra.getText()+","+textFieldValorVenda.getText()+")";
        executeQuery(query);
        showMotocicletas();
    }
    @FXML
    private void updateButton() {
        String query = "UPDATE tableMotocicleta SET renavamMotocicleta='"+textFieldRenavamMotocicleta.getText()+"',chassiMotocicleta='"+textFieldChassiMotocicleta.getText()+"',modeloMotocicleta='"+textFieldModeloMotocicleta.getText()+"',placaMotocicleta='"+textFieldPlacaMotocicleta.getText()+"',corMotocicleta='"+textFieldCorMotocicleta.getText()+"',anoMotocicleta='"+textFieldAnoMotocicleta.getText()+"',valorCompra="+textFieldValorCompra.getText()+",valorVenda="+textFieldValorVenda.getText()+" WHERE idMotocicleta="+textFieldCodigoMotocicleta.getText()+"";
        executeQuery(query);
        showMotocicletas();
    }

    @FXML
    private void deleteButton() {
        String query = "DELETE FROM tableMotocicleta WHERE idMotocicleta="+textFieldCodigoMotocicleta.getText()+"";
        executeQuery(query);
        showMotocicletas();
    }

    public void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showMotocicletas();
    }

    public Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql:dataBaseMotocicletas","postgres","******");
            return conn;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ObservableList<Motocicleta> getMotocicletaList(){
        ObservableList<Motocicleta> motocicletaList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM  ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Motocicleta motos;
            while(rs.next()) {
                //long
                motos = new Motocicleta(rs.getInt("idMotocicleta"),rs.getString("renavamMotocicleta"),rs.getString("chassiMotocicleta"),rs.getString("modeloMotocicleta"),rs.getString("placaMotocicleta"),rs.getString("corMotocicleta"),rs.getInt("anoMotocicleta"),rs.getInt("valorCompra"),rs.getInt("valorVenda"));
                motocicletaList.add(motos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return motocicletaList;
    }

    public void showMotocicletas() {
        ObservableList<Motocicleta> list = getMotocicletaList();

        codigoColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, Integer>("idMotocicleta"));
        renavamColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, String>("renavamMotocicleta"));
        chassiColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, String>("chassiMotocicleta"));
        modeloColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, String>("modeloMotocicleta"));
        placaColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, String>("placaMotocicleta"));
        corColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, String>("corMotocicleta"));
        anoColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, Integer>("anoMotocicleta"));
        valorCompraColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, BigDecimal>("valorCompra"));
        valorVendaColumn.setCellValueFactory(new PropertyValueFactory<Motocicleta, BigDecimal>("valorVenda"));

        TableView.setItems(list);
    }
}
