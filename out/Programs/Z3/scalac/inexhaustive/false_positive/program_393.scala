package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[E, E], b: Byte) extends T_A[E, T_A[Char, Boolean]]

val v_a: T_A[Int, T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Int Wildcard Wildcard Wildcard (T_A Int (T_A Char Boolean)))