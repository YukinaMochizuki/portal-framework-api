package tw.yukina.portalframework.api.job;

interface JobManager {
  public void registerJob(JobBuilder jobBuilder);

  public void unregisterJob(JobBuilder jobBuilder);

  public JobContainer getJobContainer(String id);

  public JobPlan getJobPlan(String id);
}
