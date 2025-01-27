package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Boolean, c: Char) extends T_A
case class CC_B(a: T_B[T_B[T_A, T_A], CC_A], b: CC_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: T_A) extends T_A
case class CC_D[D, E](a: E, b: Int, c: CC_A) extends T_B[D, (CC_B,T_A)]
case class CC_E(a: CC_D[T_A, T_A], b: (CC_D[CC_B, CC_A],CC_A), c: T_B[CC_C[CC_A], (CC_B,T_A)]) extends T_B[T_A, (CC_B,T_A)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(_, _), _, _) => 2 
}
}