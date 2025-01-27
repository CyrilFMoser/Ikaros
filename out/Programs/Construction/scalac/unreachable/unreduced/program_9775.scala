package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: CC_A[CC_A[Byte]], b: Int, c: T_B[T_B[Char]]) extends T_B[CC_A[T_A[Boolean]]]
case class CC_C(a: Byte, b: Boolean) extends T_B[CC_A[T_A[Boolean]]]
case class CC_D(a: Int, b: CC_B, c: CC_B) extends T_B[CC_A[T_A[Boolean]]]

val v_a: T_B[CC_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D(_, CC_B(_, _, _), _)