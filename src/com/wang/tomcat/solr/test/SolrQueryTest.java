package com.wang.tomcat.solr.test;

import java.io.IOException;
import java.util.List;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

public class SolrQueryTest {
	
	//solr 服务器地址  
    public static final String solrServerUrl = "http://localhost:8080/solr";  
    
    //solrhome下的core  
    public static final String solrCroeHome = "my_solr";  
    
    @SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) {
    	try {
    		//SolrClient client = new HttpSolrClient(solrServerUrl + "/" + solrCroeHome);
			//QueryResponse resp = client.query(new SolrQuery("*:*"));
			
			SolrClient client = new HttpSolrClient(solrServerUrl);
			QueryResponse resp = client.query(solrCroeHome, new SolrQuery("*:*"));
			List<TestBean> lists =  resp.getBeans(TestBean.class);
			System.out.println(lists);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
