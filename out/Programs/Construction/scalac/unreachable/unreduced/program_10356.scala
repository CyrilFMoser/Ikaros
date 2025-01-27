package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: C) extends T_A[T_A[C, C], C]
case class CC_B(a: T_B, b: T_A[T_B, T_B]) extends T_A[(Int,T_B), Byte]
case class CC_C(a: T_A[(Int,T_B), Byte], b: T_A[(Int,T_B), Byte], c: CC_B) extends T_B
case class CC_D(a: T_B, b: CC_A[CC_C], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _, _) => 0 
  case CC_D(CC_C(_, _, _), CC_A(CC_A(_, _, _), _, CC_C(_, _, _)), _) => 1 
}
}
// This is not matched: CC_D(CC_D(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, CC_C(_, _, _)), _)