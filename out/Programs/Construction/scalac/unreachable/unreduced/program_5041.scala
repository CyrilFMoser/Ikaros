package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_B[D], D]]
case class CC_B(a: T_A[T_B[Int], CC_A[Boolean]]) extends T_B[CC_A[T_A[Byte, Byte]]]
case class CC_C(a: Int) extends T_B[CC_A[T_A[Byte, Byte]]]
case class CC_D(a: CC_C, b: CC_C, c: CC_A[T_A[CC_C, Int]]) extends T_B[CC_A[T_A[Byte, Byte]]]

val v_a: T_B[CC_A[T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(12) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_C(_)