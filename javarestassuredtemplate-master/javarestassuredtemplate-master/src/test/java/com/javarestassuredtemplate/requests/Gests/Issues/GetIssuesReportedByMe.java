package com.javarestassuredtemplate.requests.Gests.Issues;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetIssuesReportedByMe extends RequestRestBase {


    public GetIssuesReportedByMe(String issue_Id){
        requestService = "/issues?filter_id="+issue_Id;
        method = Method.GET;
    }

}
