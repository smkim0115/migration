package com.smilegate.migration.sample.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableBatchProcessing
public class SingleStepConfig {


	@Autowired public JobBuilderFactory jobBuilderFactory;
    @Autowired public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job ExampleJob(){

        Job exampleJob = jobBuilderFactory.get("exampleJob")
                .start(Step())
                .build();

        return exampleJob;
    }

    @Bean
    public Step Step() {
        return stepBuilderFactory.get("step")
                .tasklet((contribution, chunkContext) -> {
                    log.info("Step!");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }	
}
