job('test-job') {
  steps {
    shell("ls -l")
  }

  triggers {
    cron("H 1 * * *")
  }
}