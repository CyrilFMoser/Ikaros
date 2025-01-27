package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D(a: T_B[Boolean, CC_A], b: (CC_B,T_A)) extends T_B[CC_A, T_B[Boolean, T_A]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_A())) => 0 
}
}
// This is not matched: (CC_B (Tuple Boolean Char) Int Wildcard (T_A (Tuple Boolean Char) Int))