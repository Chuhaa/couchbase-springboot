package com.example.couchbase;

import com.couchbase.client.core.diagnostics.PingResult;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.kv.GetResult;
import com.couchbase.client.java.manager.bucket.BucketManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouchbaseApplication {

	public static void main(String[] args) {
//		Cluster cluster = Cluster.connect("couchbase://13.214.164.37,18.141.216.97", "Administrator", "password");
//		PingResult ping = cluster.ping();
//		BucketManager buckets = cluster.buckets();
//		System.out.println(buckets.getAllBuckets());
//		System.out.println(ping.id());
	//	Collection collection = bucket.defaultCollection();

// You can access multiple buckets using the same Cluster object.
//		Bucket anotherBucket = clusterster.bucket("person");


// You can access collections other than the default
// if your version of Couchbase Server supports this feature.
//		Scope customerA = bucket.scope("customer-a");
//		Collection widgets = customerA.collection("widgets");

// For a graceful shutdown, disconnect from the cluster when the program ends.
//		cluster.disconnect();
		SpringApplication.run(CouchbaseApplication.class, args);
	}

}

