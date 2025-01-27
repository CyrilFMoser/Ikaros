package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: B, b: CC_B) extends T_B[B]
case class CC_D() extends T_B[T_B[CC_A]]

val v_a: CC_C[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)