package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Boolean, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)