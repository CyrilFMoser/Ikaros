package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[T_A[Boolean, Boolean]]) extends T_A[T_A[T_A[Int, Byte], CC_A[Byte]], T_A[T_A[T_A[Int, Byte], CC_A[Byte]], T_A[T_A[Int, Byte], CC_A[Byte]]]]
case class CC_C(a: T_A[CC_A[CC_B], T_A[CC_A[CC_B], CC_A[CC_B]]], b: T_A[T_A[Int, CC_B], CC_A[CC_B]], c: Char) extends T_A[CC_B, T_A[CC_B, CC_B]]

val v_a: T_A[T_A[CC_B, T_A[CC_B, CC_B]], T_A[T_A[CC_B, T_A[CC_B, CC_B]], T_A[CC_B, T_A[CC_B, CC_B]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_C(_, _, _), CC_A(_, _))) => 1 
}
}