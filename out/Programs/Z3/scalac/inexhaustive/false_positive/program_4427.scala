package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: T_B[C, C], b: (T_A,CC_A), c: CC_A) extends T_A
case class CC_C[E, D](a: T_A, b: T_A) extends T_B[D, E]
case class CC_D[F](a: F, b: ((Int,Boolean),CC_A), c: F) extends T_B[CC_A, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(_, _, _), (CC_A(_),CC_A(_)), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_D(_, _, _), (CC_B(_, _, _),CC_A(_)), _) => 3 
  case CC_B(CC_C(_, _), (CC_B(_, _, _),CC_A(_)), _) => 4 
  case CC_B(CC_D(_, _, _), (CC_A(_),CC_A(_)), CC_A(_)) => 5 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))