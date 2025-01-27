package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: Int) extends T_A[T_A[T_B, Int], (Char,T_B)]

val v_a: T_A[T_A[T_B, Int], (Char,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Int)))