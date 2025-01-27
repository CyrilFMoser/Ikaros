package Program_9 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)