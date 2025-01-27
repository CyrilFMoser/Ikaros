package Program_14 

package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Byte) extends T_A
case class CC_B(a: T_B[Int, T_A], b: (T_A,T_A)) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[D, E](a: E, b: CC_B, c: E) extends T_B[D, E]
case class CC_E[G, F](a: G) extends T_B[F, G]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_C(_) => 2 
  case CC_B(CC_E(_), (CC_C(_),CC_B(_, _))) => 3 
  case CC_B(CC_E(_), (CC_B(_, _),CC_B(_, _))) => 4 
  case CC_B(_, (CC_A(_),CC_C(_))) => 5 
  case CC_B(_, (CC_C(_),CC_A(_))) => 6 
  case CC_B(_, _) => 7 
  case CC_B(CC_E(_), _) => 8 
  case CC_B(CC_D(_, _, _), (CC_C(_),CC_B(_, _))) => 9 
  case CC_B(CC_D(_, _, _), (CC_B(_, _),CC_C(_))) => 10 
  case CC_B(CC_D(_, _, _), (CC_C(_),CC_A(_))) => 11 
  case CC_B(CC_E(_), (CC_A(_),CC_B(_, _))) => 12 
  case CC_B(_, (CC_A(_),CC_A(_))) => 13 
  case CC_B(_, (CC_A(_),CC_B(_, _))) => 14 
  case CC_B(_, (CC_C(_),CC_C(_))) => 15 
  case CC_B(CC_E(_), (CC_B(_, _),CC_A(_))) => 16 
  case CC_B(_, (CC_B(_, _),CC_A(_))) => 17 
  case CC_B(CC_D(_, _, _), (CC_B(_, _),CC_B(CC_E(_), _))) => 18 
  case CC_B(CC_D(_, _, _), (CC_B(_, _),CC_B(CC_D(_, _, _), _))) => 18 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 18 into: 
// {
//  CC_D(_, _, _)
//  CC_E(_)
// }
//
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_, _)) at position 0