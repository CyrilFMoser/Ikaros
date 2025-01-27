package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E]) extends T_A[D]
case class CC_B[F](a: (Byte,Int)) extends T_A[F]
case class CC_C[G, H](a: (Byte,Char), b: T_A[H], c: ((Int,Char),Boolean)) extends T_B[G, H]
case class CC_D[J, I](a: J, b: T_B[I, J]) extends T_B[I, J]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B((_,12)) => 1 
  case CC_B((_,_)) => 2 
  case CC_B((0,_)) => 3 
  case CC_A(_) => 4 
  case CC_A(CC_B(_)) => 5 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_B Char)))