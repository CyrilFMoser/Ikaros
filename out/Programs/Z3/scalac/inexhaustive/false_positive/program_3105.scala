package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B[B]() extends T_B[B]
case class CC_C[C](a: C, b: C) extends T_B[CC_A]
case class CC_D[D, E](a: (T_A,T_A), b: D, c: T_A) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_, _),CC_A(_, _)), _, _) => 0 
  case CC_D(_, _, _) => 1 
  case CC_D(_, 12, CC_A(_, _)) => 2 
  case CC_D((CC_A(_, _),CC_A(_, _)), 12, CC_A(_, _)) => 3 
  case CC_B() => 4 
}
}
// This is not matched: (CC_D Int T_A Wildcard Int (CC_A Int Wildcard T_A) (T_B Int))
// This is not matched: (CC_B (CC_C T_B T_B T_B) T_B Wildcard (T_A (Tuple Char T_B) (CC_C T_B T_B T_B)))