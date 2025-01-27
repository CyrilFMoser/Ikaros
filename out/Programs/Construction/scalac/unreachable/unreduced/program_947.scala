package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[(T_B,T_B), T_B], C]
case class CC_B[D](a: T_B, b: D) extends T_A[(T_A[T_B, T_B],Byte), D]
case class CC_C[E](a: (Int,(Byte,T_B)), b: CC_B[E], c: E) extends T_A[(T_A[T_B, T_B],Byte), E]
case class CC_D(a: CC_C[Char], b: T_B) extends T_B
case class CC_E(a: CC_D, b: T_A[CC_B[CC_D], CC_C[CC_D]]) extends T_B

val v_a: T_A[(T_A[T_B, T_B],Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _), true) => 0 
  case CC_B(CC_D(_, _), false) => 1 
  case CC_B(CC_E(_, _), true) => 2 
  case CC_B(CC_E(_, _), false) => 3 
  case CC_C(_, _, _) => 4 
}
}