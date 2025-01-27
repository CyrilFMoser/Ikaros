package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: T_A[B]) extends T_A[T_A[Char]]
case class CC_B(a: CC_A[(T_B,T_B)], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C(a: CC_A[CC_B], b: CC_A[T_B]) extends T_B
case class CC_D(a: CC_B, b: CC_B, c: Char) extends T_B
case class CC_E[C](a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_B(CC_A(_, _), CC_A(_, _)), CC_B(_, _), _) => 1 
  case CC_E(_) => 2 
}
}
// This is not matched: CC_D(CC_B(CC_A(_, _), CC_B(_, _)), CC_B(_, _), _)