package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Boolean, Char], C]

val v_a: T_A[T_A[Boolean, Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)