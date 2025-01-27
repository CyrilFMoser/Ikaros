package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: Boolean, b: T_A) extends T_B[C, (CC_A,CC_A)]
case class CC_D[D](a: Boolean, b: T_A) extends T_B[D, (CC_A,CC_A)]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(CC_B(_))) => 1 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(_)))