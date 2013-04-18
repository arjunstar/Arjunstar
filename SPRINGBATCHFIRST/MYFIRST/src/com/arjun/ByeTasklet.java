package com.arjun;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.*;
import org.springframework.batch.repeat.RepeatStatus;
public class ByeTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bye Thanks First SPring");
		return RepeatStatus.FINISHED;
	}

}
