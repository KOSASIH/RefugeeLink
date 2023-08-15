package com.kosasih.refugeelink;

import com.kosasih.refugeelink.RefugeeLinkApp;
import com.kosasih.refugeelink.config.AsyncSyncConfiguration;
import com.kosasih.refugeelink.config.EmbeddedElasticsearch;
import com.kosasih.refugeelink.config.EmbeddedKafka;
import com.kosasih.refugeelink.config.EmbeddedSQL;
import com.kosasih.refugeelink.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RefugeeLinkApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
