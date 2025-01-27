package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_A[(Int,(Char,Char))]]
case class CC_B() extends T_A[T_A[(Int,(Char,Char))]]
case class CC_C(a: T_A[CC_B], b: Int) extends T_A[T_A[(Int,(Char,Char))]]
case class CC_D() extends T_B[T_A[T_B[Int]]]
case class CC_E(a: CC_C, b: T_B[T_B[Byte]]) extends T_B[T_A[T_B[Int]]]
case class CC_F(a: Byte, b: T_B[CC_B], c: Char) extends T_B[T_A[T_B[Int]]]

val v_a: T_B[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, 12), _) => 1 
  case CC_F(_, _, _) => 2 
}
}
// This is not matched: CC_E(CC_C(_, _), _)