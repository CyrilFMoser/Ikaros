package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Boolean, Byte]]) extends T_A[T_B[Char, T_A[Byte]]]
case class CC_B(a: CC_A) extends T_A[T_B[Char, T_A[Byte]]]
case class CC_C() extends T_A[T_B[Char, T_A[Byte]]]
case class CC_D[D](a: (CC_C,(CC_B,CC_B)), b: D, c: (CC_B,CC_C)) extends T_B[CC_C, CC_C]

val v_a: T_A[T_B[Char, T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}