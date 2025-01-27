package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: T_A[E, E], b: Int) extends T_A[E, Boolean]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants