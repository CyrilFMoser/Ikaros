package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Boolean, c: (T_B[(Boolean,Int), T_A],T_B[T_A, Boolean])) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[Boolean, T_A], c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C](a: T_B[CC_A, C], b: C, c: CC_B) extends T_B[CC_A, C]
case class CC_D[D](a: T_B[CC_A, D], b: D, c: Byte) extends T_B[CC_A, D]
case class CC_E(a: CC_B) extends T_B[CC_A, T_B[CC_A, T_B[CC_A, CC_B]]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _, _), _, CC_B(_, _, _)), _, _) => 0 
  case CC_C(CC_C(CC_D(_, _, _), _, CC_B(_, _, _)), _, _) => 1 
  case CC_C(CC_D(CC_C(_, _, _), _, _), _, _) => 2 
  case CC_C(CC_D(CC_D(_, _, _), _, _), _, _) => 3 
}
}