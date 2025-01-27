package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Int]], b: T_B[T_A[Char], T_A[Char]], c: T_A[Int]) extends T_A[T_A[T_B[Int, Byte]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: CC_A, c: T_A[T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Int, Byte]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_B[Int, Byte]]]
case class CC_D[D](a: Char, b: CC_A, c: Char) extends T_B[D, CC_C]
case class CC_E[E]() extends T_B[E, CC_C]
case class CC_F(a: Boolean, b: T_B[Boolean, (CC_B,Boolean)]) extends T_B[CC_B, T_B[Int, CC_D[CC_A]]]

val v_a: T_B[Boolean, CC_C] = null
val v_b: Int = v_a match{
  case CC_D('x', CC_A(_, _, _), _) => 0 
  case CC_D(_, CC_A(_, _, _), _) => 1 
  case CC_E() => 2 
}
}