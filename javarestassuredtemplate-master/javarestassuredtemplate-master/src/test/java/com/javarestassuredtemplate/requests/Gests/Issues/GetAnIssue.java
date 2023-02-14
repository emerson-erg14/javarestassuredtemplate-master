package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetAnIssue extends RequestRestBase {

    public GetAnIssue(int issue_Id){
        requestService = "/issues/"+issue_Id;
        method = Method.GET;
    }


}
