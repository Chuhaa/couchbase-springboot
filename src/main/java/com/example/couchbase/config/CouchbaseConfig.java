package com.example.couchbase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;


@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

//    @Autowired
//    private ApplicationContext context;

    @Value("${app.couchbase.connection-string}")
    private String connectionString;

    @Value("${app.couchbase.user-name}")
    private String userName;

    @Value("${app.couchbase.password}")
    private String password;

    @Value("${app.couchbase.bucketName}")
    private String bucketName;

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }

//    @Override
//    public void configureRepositoryOperationsMapping(RepositoryOperationsMapping mapping) {
//        mapping.mapEntity(User.class, getCouchbaseTemplate(userBucket));
//    }
//
//    @SneakyThrows
//    private CouchbaseTemplate getCouchbaseTemplate(String bucketName) {
//        CouchbaseTemplate template = new CouchbaseTemplate(couchbaseClientFactory(bucketName),
//                mappingCouchbaseConverter(couchbaseMappingContext(customConversions()),
//                        new CouchbaseCustomConversions(Collections.emptyList())));
//
//        template.setApplicationContext(context);
//        return template;
//    }

//    private CouchbaseClientFactory couchbaseClientFactory(String bucketName) {
//        return new SimpleCouchbaseClientFactory(couchbaseCluster(couchbaseClusterEnvironment()),
//                bucketName, this.getScopeName());
//    }


//    @Override
//    public CouchbaseEnvironment couchbaseEnvironment() {
//        return DefaultCouchbaseEnvironment
//                .builder()
//                .sslEnabled(true)
//                .sslKeystoreFile("/path/tokeystore")
//                .sslKeystorePassword("password")
//                .build();
//    }
}