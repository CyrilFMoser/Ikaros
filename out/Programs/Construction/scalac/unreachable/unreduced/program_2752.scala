package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, Int]) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_A
case class CC_D[C](a: Boolean, b: T_B[C, CC_A], c: (Int,CC_B)) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)