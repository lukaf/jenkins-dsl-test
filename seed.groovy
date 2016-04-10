job('test-job') {
  steps {
    shell("ls -l")
  }

  triggers {
    cron("H 1 * * *")
  }
}

job('emtpy-job') {
  steps {
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