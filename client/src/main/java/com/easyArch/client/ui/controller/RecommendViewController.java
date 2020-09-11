package com.easyArch.client.ui.controller;

import com.easeArch.common.handler.Handler;
import com.easyArch.client.handler.HandlerFactory;
import com.easyArch.client.ui.ControllerStage;
import com.easyArch.client.ui.container.ResourceContainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.easyArch.client.ui.controller.AddViewController.faccount;
import static com.easyArch.client.ui.controller.AddViewController.user;

public class RecommendViewController implements Initializable, ControllerStage {
    @FXML
    private ImageView close;
    @FXML
    private ImageView min;


    @FXML
    private void close() {
        System.exit(0);
    }

    @FXML
    private void closeEntered() {
        Image image = ResourceContainer.getClose_1();
        close.setImage(image);
    }

    @FXML
    private void closeExited() {
        Image image = ResourceContainer.getClose();
        close.setImage(image);
    }

    @FXML
    private void minEntered() {
        Image image = ResourceContainer.getMin_1();
        min.setImage(image);
    }

    @FXML
    private void minExited() {
        Image image = ResourceContainer.getMin();
        min.setImage(image);
    }

    @FXML
    private void min() {
        getStage().setIconified(true);
    }

    @Override
    public Stage getStage() {
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void click() {
        String account = user.getAccount();
//        String faccount = searchuser.getText();
        System.out.println("---------------------");
        System.out.println(account);
        System.out.println(faccount);
        insertFriend(account, faccount);

    }


    private int insertFriend(String account, String faccount) {
        HandlerFactory factory = HandlerFactory.getFactory();
        Handler insert = factory.handler("insert");
        return (int) insert.handler(account, faccount);
    }





}
