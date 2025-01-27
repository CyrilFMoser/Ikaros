package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B(a: CC_A[Char, CC_A[Char, Int]]) extends T_B[T_B[T_A[Byte]]]
case class CC_C(a: Char, b: T_B[T_B[CC_B]], c: CC_A[T_B[Int], CC_B]) extends T_B[T_B[T_A[Byte]]]
case class CC_D() extends T_B[T_B[T_A[Byte]]]

val v_a: T_B[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}