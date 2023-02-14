package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetIssueFiles extends RequestRestBase {


    public GetIssueFiles(int issue_Id){
        requestService = "/issues/"+issue_Id+"/files";
        method = Method.GET;
    }

}
