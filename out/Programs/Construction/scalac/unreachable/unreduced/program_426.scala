package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[T_B[D]]) extends T_A[D, E]
case class CC_B(a: Boolean, b: T_A[T_B[Char], CC_A[Char, Char]], c: T_A[Boolean, T_B[Byte]]) extends T_B[CC_A[Int, T_B[Byte]]]
case class CC_C(a: (T_A[CC_B, Int],Byte)) extends T_B[CC_A[Int, T_B[Byte]]]
case class CC_D() extends T_B[CC_A[Int, T_B[Byte]]]

val v_a: T_B[CC_A[Int, T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), CC_A(_)) => 0 
  case CC_C((_,_)) => 1 
}
}
// This is not matched: CC_D()