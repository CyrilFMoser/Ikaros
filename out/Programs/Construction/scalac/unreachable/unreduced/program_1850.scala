package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: Byte, c: T_A) extends T_A
case class CC_B(a: T_A, b: Int, c: Byte) extends T_A
case class CC_C[C](a: T_A) extends T_B[C, CC_A]
case class CC_D[D](a: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, 0) => 1 
}
}
// This is not matched: CC_B(_, _, _)