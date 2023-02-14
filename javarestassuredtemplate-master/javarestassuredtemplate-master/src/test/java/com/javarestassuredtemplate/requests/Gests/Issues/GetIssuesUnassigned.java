package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetIssuesUnassigned extends RequestRestBase {


    public GetIssuesUnassigned(String issue_Id){
        requestService = "/issues?filter_id="+issue_Id;
        method = Method.GET;
    }

}
