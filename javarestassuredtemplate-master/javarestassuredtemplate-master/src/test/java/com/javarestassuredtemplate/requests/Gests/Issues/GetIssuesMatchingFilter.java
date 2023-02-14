package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetIssuesMatchingFilter extends RequestRestBase {


    public GetIssuesMatchingFilter(int issue_Id){
        requestService = "/issues?filter_id="+issue_Id;
        method = Method.GET;
    }

}
