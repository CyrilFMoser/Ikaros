package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[T_A, CC_A], c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A, c: C) extends T_B[C, T_B[C, C]]
case class CC_D() extends T_B[CC_C[CC_C[CC_B]], T_B[CC_C[CC_C[CC_B]], CC_C[CC_C[CC_B]]]]
case class CC_E(a: CC_B, b: T_B[CC_A, T_B[CC_A, CC_A]]) extends T_B[CC_C[CC_C[CC_B]], T_B[CC_C[CC_C[CC_B]], CC_C[CC_C[CC_B]]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, CC_A(_, _))) => 1 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _))) => 2 
}
}