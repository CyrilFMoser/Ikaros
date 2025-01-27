package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_A[Int, Char]], D]
case class CC_B(a: T_B[T_B[Boolean]], b: CC_A[CC_A[Boolean]]) extends T_A[T_A[Int, T_A[Byte, Boolean]], T_B[T_A[Char, Boolean]]]
case class CC_C(a: T_A[T_B[(Byte,Int)], (CC_B,CC_B)], b: Char, c: Char) extends T_A[T_A[Int, T_A[Byte, Boolean]], T_B[T_A[Char, Boolean]]]
case class CC_D(a: CC_B, b: T_B[T_B[Int]], c: Byte) extends T_B[Boolean]
case class CC_E(a: Char) extends T_B[Boolean]
case class CC_F(a: CC_B) extends T_B[CC_B]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_A()), _, _) => 0 
  case CC_E(_) => 1 
}
}