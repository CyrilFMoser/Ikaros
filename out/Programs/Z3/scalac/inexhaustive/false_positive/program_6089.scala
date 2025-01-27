package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B(a: CC_A[T_B], b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Boolean T_A) Wildcard T_A)