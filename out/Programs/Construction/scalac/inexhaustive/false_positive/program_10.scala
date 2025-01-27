package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B() extends T_A
case class CC_C(a: (T_B[CC_B],T_B[CC_B]), b: T_B[Boolean]) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_, _),_), _) => 0 
}
}
// This is not matched: CC_A(_, _, _)