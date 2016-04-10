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

views {
  listView('test-view') {
    jobs {
      regex('test-.*')
    }
  }
}