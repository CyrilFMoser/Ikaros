package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: CC_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, (T_A,CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A() => 1 
  case CC_B(_, _, CC_A()) => 2 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)