package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[E, E], b: Int) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//      Wildcard
//      Wildcard
//      T_A)