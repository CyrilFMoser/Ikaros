package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B(a: T_B[T_B[Byte, Char], Char], b: T_A[T_B[Int, Int]]) extends T_A[T_A[CC_A[Boolean]]]
case class CC_C(a: Char, b: T_B[T_B[CC_B, CC_B], CC_B], c: Boolean) extends T_B[CC_A[CC_A[CC_B]], CC_A[(CC_B,CC_B)]]
case class CC_D() extends T_B[CC_A[CC_A[CC_B]], CC_A[(CC_B,CC_B)]]
case class CC_E(a: CC_C, b: T_A[Char], c: CC_B) extends T_B[CC_A[CC_A[CC_B]], CC_A[(CC_B,CC_B)]]

val v_a: T_B[CC_A[CC_A[CC_B]], CC_A[(CC_B,CC_B)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E(_, CC_A(_, _, _), _) => 2 
}
}