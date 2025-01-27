package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: T_A[Boolean], b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants