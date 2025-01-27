package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_B[T_B[T_A, CC_A], CC_A]) extends T_A
case class CC_C(a: T_B[CC_B, CC_A], b: CC_B) extends T_B[CC_B, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, _), CC_A(), _) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_A(), _, _), CC_A(), _)