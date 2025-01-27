package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, CC_A]) extends T_A
case class CC_C[D, C](a: T_A, b: T_B[D, D], c: CC_A) extends T_B[D, C]
case class CC_D[F, E](a: F, b: CC_B) extends T_B[E, F]
case class CC_E[G, H, I](a: T_B[I, I], b: CC_C[G, G], c: (CC_A,(Int,Boolean))) extends T_B[G, H]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, _, _), CC_C(_, _, _), _) => 0 
  case CC_E(_, CC_C(_, _, _), (CC_A(_, _, _),(_,_))) => 1 
  case CC_D(_, _) => 2 
  case CC_C(CC_B(_, _), CC_C(_, _, _), _) => 3 
  case CC_C(_, CC_C(_, _, _), CC_A(_, _, _)) => 4 
  case CC_C(CC_A(_, _, _), CC_D(_, _), CC_A(_, _, _)) => 5 
  case CC_C(CC_B(_, _), CC_E(_, _, _), CC_A(_, _, _)) => 6 
  case CC_C(CC_A(_, _, _), CC_E(_, _, _), CC_A(_, _, _)) => 7 
  case CC_C(CC_B(_, _), _, _) => 8 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _)) => 9 
  case CC_C(CC_B(_, _), _, CC_A(_, _, _)) => 10 
  case CC_C(CC_A(_, _, _), CC_D(_, _), _) => 11 
}
}
// This is not matched: (CC_E Int Boolean T_A Wildcard Wildcard Wildcard (T_B Int Boolean))
// This is not matched: (CC_D Boolean Int Wildcard Wildcard (T_B Int Boolean))