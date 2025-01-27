package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[Char, Char], b: T_B[F, E], c: T_B[F, E]) extends T_A[E, F]
case class CC_B[G]() extends T_B[G, T_B[Int, Char]]
case class CC_C[H, I](a: (Boolean,Char), b: T_A[I, H], c: T_B[H, H]) extends T_B[H, T_B[Int, Char]]
case class CC_D() extends T_B[Int, T_B[Int, Char]]

val v_a: T_B[Int, T_B[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D() => 1 
  case CC_C((_,'x'), CC_A(_, _, _), _) => 2 
  case CC_C(_, _, _) => 3 
  case CC_C((_,'x'), _, _) => 4 
  case CC_C((_,_), _, _) => 5 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Wildcard Wildcard (T_B Int (T_B Int Char)))
// This is not matched: (CC_A Wildcard (CC_C Wildcard Wildcard Wildcard T_A) T_A)