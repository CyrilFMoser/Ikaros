package Program_14 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[Int, Char]]
case class CC_B[E, D, F](a: T_A[F, F]) extends T_A[E, D]

val v_a: T_A[Byte, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_A(_)) => 3 
}
}
// This is not matched: (CC_B Byte (T_A Int Char) Boolean Wildcard (T_A Byte (T_A Int Char)))
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Boolean)))