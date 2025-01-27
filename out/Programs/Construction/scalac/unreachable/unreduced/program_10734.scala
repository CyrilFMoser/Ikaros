package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: T_B[Int, CC_B]) extends T_B[CC_B, CC_B]
case class CC_D[C](a: CC_C) extends T_B[CC_B, CC_B]
case class CC_E(a: T_B[T_B[CC_B, CC_B], T_A], b: Boolean, c: Boolean) extends T_B[CC_B, CC_B]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)