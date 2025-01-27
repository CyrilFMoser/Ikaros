package Program_30 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_A,T_A)) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,CC_A())) => 0 
}
}
// This is not matched: CC_C(_, CC_B(_), CC_A(CC_D(_, _, _)))