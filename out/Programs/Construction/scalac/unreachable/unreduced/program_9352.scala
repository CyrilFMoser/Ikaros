package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[(Boolean,T_A[T_B])]
case class CC_B(a: T_A[CC_A], b: (Int,Char), c: CC_A) extends T_A[(Boolean,T_A[T_B])]
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_B]) extends T_B
case class CC_E(a: T_B, b: CC_D, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E(CC_C(), CC_D(_), _) => 2 
  case CC_E(CC_D(_), CC_D(_), _) => 3 
  case CC_E(CC_E(CC_D(_), _, _), CC_D(_), _) => 4 
  case CC_E(CC_E(CC_E(_, _, _), _, _), CC_D(_), _) => 5 
}
}
// This is not matched: CC_E(CC_E(CC_C(), _, _), CC_D(_), _)