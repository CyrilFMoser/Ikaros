package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_B) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Char) extends T_A[T_A[(Byte,T_B), CC_A[T_B]], D]
case class CC_C[E](a: E, b: CC_A[E]) extends T_A[T_A[(Byte,T_B), CC_A[T_B]], E]
case class CC_D(a: CC_C[CC_B[T_B]], b: (CC_A[T_B],CC_A[T_B]), c: CC_B[CC_C[T_B]]) extends T_B
case class CC_E(a: Int, b: Byte, c: Byte) extends T_B
case class CC_F(a: CC_A[Byte], b: CC_B[(CC_E,CC_E)], c: CC_C[CC_C[(Char,Byte)]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_B(_), _), _, CC_B(_)) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, CC_B(_), CC_C(CC_C(_, _), CC_A(_, _, _))) => 2 
}
}