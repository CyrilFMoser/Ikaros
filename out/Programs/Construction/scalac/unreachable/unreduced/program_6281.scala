package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_C(a: T_B[CC_B, T_B[CC_A, Boolean]]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_D[D](a: D, b: D) extends T_B[D, CC_B]
case class CC_E(a: T_B[CC_C, (Char,CC_C)], b: CC_B) extends T_B[CC_C, (Char,CC_C)]
case class CC_F(a: T_B[T_A[CC_C], CC_B], b: T_B[CC_C, (Char,CC_C)]) extends T_B[CC_C, CC_B]

val v_a: T_A[T_A[T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()