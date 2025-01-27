package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_A[Boolean, T_B]], b: T_A[T_B, T_B], c: Int) extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_B, c: T_B) extends T_A[T_B, T_B]
case class CC_C(a: Char, b: T_A[T_B, T_B], c: Int) extends T_A[T_B, T_B]

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)