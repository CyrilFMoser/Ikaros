package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[CC_A], c: Char) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: Byte) extends T_A[T_A[Int]]
case class CC_D(a: Byte, b: T_A[Int]) extends T_B
case class CC_E(a: T_A[CC_D], b: Byte, c: CC_A) extends T_B
case class CC_F(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_) => 2 
}
}