package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Int], T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: CC_A, b: Char, c: T_B[Char, C]) extends T_A
case class CC_C(a: Byte, b: Int, c: T_B[((Int,Char),T_A), CC_B[T_A]]) extends T_A
case class CC_D[D](a: Byte, b: CC_B[CC_B[D]]) extends T_B[T_B[D, D], D]
case class CC_E[E](a: CC_D[E], b: Int) extends T_B[T_B[E, E], E]

val v_a: T_B[T_B[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _)) => 0 
  case CC_E(_, _) => 1 
}
}