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

listView('manual.view') {
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