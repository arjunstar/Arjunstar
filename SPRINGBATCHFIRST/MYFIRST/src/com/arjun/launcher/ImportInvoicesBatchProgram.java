package com.arjun.launcher;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ImportInvoicesBatchProgram {
public static void main(String[] args) throws Exception {
/*	
if (args == null || args.length != 3) {
	throw new IllegalArgumentException("Batch job needs 3 parameters: " +"input archive, target directory, target file");
}*/
ApplicationContext context =new ClassPathXmlApplicationContext("com/arjun/launcher/import-invoices-job-context.xml");
JobLauncher jobLauncher = context.getBean(JobLauncher.class);
Job job = context.getBean(Job.class);
//JobExecution jobExecution = jobLauncher.run(job,new JobParametersBuilder().addString("inputResource", args[0]).addString("targetDirectory", args[1]).addString("targetFile", args[2]).toJobParameters());
//JobExecution jobExecution = jobLauncher.run(job,new JobParametersBuilder().addString("inputResource", args[0]).addString("targetDirectory", args[1]).addString("targetFile", args[2]).toJobParameters());
JobExecution jobExecution=jobLauncher.run(job, new JobParametersBuilder().addString("myfile",args[0]).toJobParameters());
System.out.println("Job ended with status: "+ jobExecution.getExitStatus());
}
}
