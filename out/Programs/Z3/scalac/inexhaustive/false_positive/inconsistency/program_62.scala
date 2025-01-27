package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, (_,CC_A(_, _)))) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Char)))