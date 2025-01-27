package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[CC_A, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _, _), _, _), CC_B(_, (_,_)), _)