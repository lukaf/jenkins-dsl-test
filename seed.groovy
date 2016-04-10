job('test-job') {
  steps {
    shell("ls -l")
  }

  triggers {
    cron("H 1 * * *")
  }
}

listView('test-view') {
  jobs {
    regex('test-.*')
  }

  columns {
    status()
    weather()
    name()
    lastSuccess()
    lastFailure()
    lastDuration()
    buildButton()
  }
}

job('emtpy-job') {
  description = "this should be deleted when removed"
}