package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,T_A), b: Int) extends T_A
case class CC_D[C]() extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),CC_A(_, _)), _) => 1 
  case CC_C((CC_B(),CC_B()), _) => 2 
  case CC_C((CC_B(),CC_C(_, _)), _) => 3 
}
}
// This is not matched: CC_A(_, _)