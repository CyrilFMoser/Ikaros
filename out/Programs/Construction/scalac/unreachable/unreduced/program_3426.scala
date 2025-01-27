package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Byte, c: Char) extends T_A[T_A[T_B[Byte], T_A[Char, Char]], D]
case class CC_B(a: T_A[T_A[Int, Byte], T_B[(Char,Char)]], b: T_A[CC_A[Int], CC_A[Char]]) extends T_A[T_A[T_B[Byte], T_A[Char, Char]], Byte]
case class CC_C(a: CC_A[T_B[CC_B]], b: T_A[CC_A[CC_B], T_A[CC_B, CC_B]], c: T_B[T_A[Char, CC_B]]) extends T_B[T_A[Byte, T_A[CC_B, CC_B]]]
case class CC_D() extends T_B[T_A[Byte, T_A[CC_B, CC_B]]]
case class CC_E(a: CC_A[CC_A[Boolean]], b: (CC_D,CC_B), c: Byte) extends T_B[T_A[Byte, T_A[CC_B, CC_B]]]

val v_a: T_B[T_A[Byte, T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_A(CC_A(_, _, _), 0, _), (CC_D(),CC_B(_, _)), 0) => 2 
  case CC_E(CC_A(CC_A(_, _, _), _, _), (CC_D(),CC_B(_, _)), 0) => 3 
  case CC_E(CC_A(CC_A(_, _, _), 0, _), (CC_D(),CC_B(_, _)), _) => 4 
}
}
// This is not matched: CC_E(CC_A(CC_A(_, _, _), _, _), (CC_D(),CC_B(_, _)), _)