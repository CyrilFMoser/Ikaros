package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: Byte) extends T_A[C]
case class CC_B[D](a: D, b: D, c: T_A[D]) extends T_A[D]
case class CC_C(a: Boolean, b: T_A[T_B[Char]], c: T_A[Byte]) extends T_B[CC_B[Char]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C(_, CC_A(_, _), CC_A(_, _)), _, _) => 1 
  case CC_B(CC_C(_, CC_B(_, _, _), CC_A(_, _)), _, _) => 2 
  case CC_B(CC_C(_, CC_A(_, _), CC_B(_, _, _)), _, _) => 3 
}
}
// This is not matched: CC_B(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), _, _)