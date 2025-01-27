package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: C) extends T_A[T_A[T_B, T_B], C]

val v_a: T_A[T_A[T_B, T_B], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))