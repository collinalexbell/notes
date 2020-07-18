val todos = List[String](
  "find a calendar app I want to use"
)

case class Philosophy(name: String, notes: Object*) {
  private var _comments: Seq[String] = Seq()
  def comments(comments: String*) = _comments = comments
  def comments = _comments

}

val philosophiesOfDeepWork = List[Philosophy](
  Philosophy(
    "Monastic Philosophy of Deep Work Scheduling",
    //
    "maximize deep offorts by eliminating or radically minimizing shallow obligations",
    "praticioners usually have a well defined and highly valued professional goal",
    "requires discrete, clear, and individualized contributions"
  ),
  Philosophy(
    "The Bimodal Philosphy of Deep Work Scheduling",
    //
    "divide time into 'deep' and 'shallow'",
    "the minimum unit of time for deep work in this philosophy is one full day",
    "deployed by people who cannot succeed in the absensce of substaintial commitments to non-deep pursuits"
  ).comments("this is the one I would most like to do (but fractally perhaps)")
)

val curPageNum = List[Double](
  66.9
)
