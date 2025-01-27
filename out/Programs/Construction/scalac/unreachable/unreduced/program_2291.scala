package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, Boolean], b: CC_A, c: T_B[T_B[T_A, CC_A], T_B[T_A, CC_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()