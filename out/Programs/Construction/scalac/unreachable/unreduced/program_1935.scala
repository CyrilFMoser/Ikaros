package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[Char, C]) extends T_A[Char, C]
case class CC_B[D](a: Char) extends T_A[Char, D]
case class CC_C[E](a: (Byte,Int), b: E, c: CC_B[E]) extends T_A[Char, E]
case class CC_D(a: CC_C[(T_B,T_B)], b: CC_B[CC_C[T_B]]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[T_B, CC_C[T_B]]) extends T_B

val v_a: T_A[Char, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C(_, CC_E(), CC_B(_))) => 2 
  case CC_B(_) => 3 
  case CC_C((0,_), CC_E(), CC_B(_)) => 4 
  case CC_C((_,_), CC_E(), CC_B(_)) => 5 
}
}