package demo



class EveryMonthJob {

    // generally I would statically type this property but
    // am leaving it dynamically typed top be consistent with
    // a question being asked...
    def usersUtilsService

    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        usersUtilsService.testMe() // this works fine
    }
}
