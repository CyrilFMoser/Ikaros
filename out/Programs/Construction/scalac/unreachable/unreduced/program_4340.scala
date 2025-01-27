package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_B[CC_A], c: CC_A) extends T_A
case class CC_D(a: T_B[T_A]) extends T_B[T_A]
case class CC_E(a: CC_C, b: CC_D, c: CC_B) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()