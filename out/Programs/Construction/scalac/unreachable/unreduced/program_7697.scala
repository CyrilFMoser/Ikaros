package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_B[(T_A,T_A)], b: CC_A, c: CC_A) extends T_A
case class CC_C() extends T_B[CC_B]
case class CC_D(a: CC_B) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}