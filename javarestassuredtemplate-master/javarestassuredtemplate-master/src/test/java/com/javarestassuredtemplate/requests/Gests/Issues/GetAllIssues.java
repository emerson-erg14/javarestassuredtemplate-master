package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetAllIssues extends RequestRestBase {


    public GetAllIssues(int issue_Id,int issue_Id2){
        requestService = "/issues?page_size="+issue_Id+"&page="+issue_Id2;
        method = Method.GET;
    }

}
