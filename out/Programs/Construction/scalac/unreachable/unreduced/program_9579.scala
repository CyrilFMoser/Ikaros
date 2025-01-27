package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: Boolean, b: T_A[CC_A[Byte, Char], T_A[Byte, Byte]], c: CC_A[CC_A[Int, Boolean], Byte]) extends T_A[Boolean, T_A[Boolean, T_A[Boolean, Boolean]]]
case class CC_C(a: T_A[CC_A[CC_B, CC_B], CC_B], b: Byte, c: CC_B) extends T_A[Boolean, T_A[Boolean, T_A[Boolean, Boolean]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(0)) => 1 
  case CC_B(_, _, CC_A(_)) => 2 
  case CC_C(_, _, _) => 3 
}
}