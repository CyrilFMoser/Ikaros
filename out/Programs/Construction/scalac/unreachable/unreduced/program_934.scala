package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: T_B[D, D]) extends T_A[T_A[T_B[Int, Char]]]
case class CC_B(a: CC_A[T_A[Boolean]], b: T_A[CC_A[Char]], c: T_B[CC_A[Char], CC_A[Char]]) extends T_A[T_A[T_B[Int, Char]]]
case class CC_C(a: CC_B, b: T_A[T_B[CC_B, Boolean]], c: Byte) extends T_A[T_A[T_B[Int, Char]]]
case class CC_D[E, F]() extends T_B[E, CC_C]
case class CC_E[G]() extends T_B[G, CC_C]
case class CC_F(a: CC_E[CC_D[CC_B, CC_C]], b: CC_B) extends T_B[Int, CC_A[CC_A[Char]]]

val v_a: T_A[T_A[T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)