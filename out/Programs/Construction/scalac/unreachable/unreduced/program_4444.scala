package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: Byte) extends T_A[C]
case class CC_B(a: T_A[T_B[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_C[D](a: D, b: D, c: T_A[D]) extends T_A[T_A[T_A[Char]]]
case class CC_D() extends T_B[CC_C[T_A[CC_B]]]
case class CC_E() extends T_B[CC_C[T_A[CC_B]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _))