package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: CC_A) extends T_A
case class CC_C() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(CC_B(_, _))) => 1 
}
}
// This is not matched: CC_A(CC_B(CC_B(_)))