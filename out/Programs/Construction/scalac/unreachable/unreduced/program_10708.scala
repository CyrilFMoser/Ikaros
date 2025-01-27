package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Char,T_A[Int]), b: Boolean) extends T_A[T_A[Int]]
case class CC_B(a: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: T_A[T_A[Int]], b: CC_B, c: CC_A) extends T_A[Boolean]
case class CC_D() extends T_B
case class CC_E(a: CC_A, b: CC_B, c: Char) extends T_B
case class CC_F(a: T_B, b: T_B, c: T_A[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_F(_, _, _) => 1 
}
}
// This is not matched: CC_D()