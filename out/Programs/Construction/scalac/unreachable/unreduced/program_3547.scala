package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, CC_A], T_A], b: T_B[T_B[CC_A, T_A], T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (CC_C,CC_A), b: CC_A) extends T_B[T_A, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()