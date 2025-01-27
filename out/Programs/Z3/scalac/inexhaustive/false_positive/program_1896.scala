package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B](a: Int) extends T_A[B]

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard (T_B Boolean))