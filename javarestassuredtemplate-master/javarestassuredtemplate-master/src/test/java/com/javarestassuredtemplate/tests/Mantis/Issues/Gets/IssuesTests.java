package com.javarestassuredtemplate.tests.Mantis.Issues.Gets;

import com.javarestassuredtemplate.bases.TestBase;

import com.javarestassuredtemplate.dbsteps.UsuariosDBSteps;
import com.javarestassuredtemplate.requests.Gests.Issues.GetIssueFiles;
import com.javarestassuredtemplate.requests.Gests.Issues.GetAnIssue;
import com.javarestassuredtemplate.requests.Gests.Issues.*;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class IssuesTests extends TestBase {

    GetAnIssue getAnIssue;
    GetIssueFiles getIssueFiles;
    GetAllIssues getAllIssues;
    GetIssuesMatchingFilter getIssuesMatchingFilter;
    GetIssuesAssignedToMe getIssuesAssignedToMe;
    GetIssuesReportedByMe getIssuesReportedByMe;
    GetIssuesMonitoredByMe getIssuesMonitoredByMe;
    GetIssuesUnassigned getIssuesUnassigned;
    UsuariosDBSteps usuariosDBSteps;

    @Test
    public void getAnIssue(){
        //Parâmetros


        String teste = UsuariosDBSteps.retornaID();
        int id = Integer.parseInt(teste);
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getAnIssue = new GetAnIssue(id);
        ValidatableResponse response = getAnIssue.executeRequest();


        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getAnIssueFiles(){


        //Parâmetros
        int issue_Id = 1;
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssueFiles = new GetIssueFiles(issue_Id);
        ValidatableResponse response = getIssueFiles.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getAllIssues(){
        //Parâmetros
        int issue_Id = 10;
        int issue_Id2 = 1;
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getAllIssues = new GetAllIssues(issue_Id,issue_Id2);
        ValidatableResponse response = getAllIssues.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }


    @Test
    public void getIssuesMatchingFilter(){
        //Parâmetros
        int issue_Id = 1;

        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssuesMatchingFilter = new GetIssuesMatchingFilter(issue_Id);
        ValidatableResponse response = getIssuesMatchingFilter.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getIssuesAssignedToMe(){
        //Parâmetros
        String issue_Id = "assigned";

        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssuesAssignedToMe = new GetIssuesAssignedToMe(issue_Id);
        ValidatableResponse response = getIssuesAssignedToMe.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getIssuesReportedByMe(){
        //Parâmetros
        String issue_Id = "reported";

        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssuesReportedByMe = new GetIssuesReportedByMe(issue_Id);
        ValidatableResponse response = getIssuesReportedByMe.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getIssuesMonitoredByMe(){
        //Parâmetros
        String issue_Id = "monitored";

        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssuesMonitoredByMe = new GetIssuesMonitoredByMe(issue_Id);
        ValidatableResponse response = getIssuesMonitoredByMe.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

    @Test
    public void getUnassignedIssues(){
        //Parâmetros
        String issue_Id = "unassigned";

        int statusCodeEsperado = HttpStatus.SC_OK;

        //Fluxo
        getIssuesUnassigned = new GetIssuesUnassigned(issue_Id);
        ValidatableResponse response = getIssuesUnassigned.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        //response.body("id",equalTo(issue_Id));
    }

}
