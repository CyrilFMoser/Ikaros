package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B(a: T_A[T_B, T_B], b: Char) extends T_A[T_B, Boolean]

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_B Char (T_A Char))