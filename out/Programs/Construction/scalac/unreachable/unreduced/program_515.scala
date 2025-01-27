package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: CC_A) extends T_A
case class CC_C() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_B(_, _)