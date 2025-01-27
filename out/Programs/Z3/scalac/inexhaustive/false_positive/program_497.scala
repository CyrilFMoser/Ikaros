package Program_29 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, Boolean]]
case class CC_B[D, E, F](a: T_A[F, E], b: CC_A[D]) extends T_A[E, D]

val v_a: T_A[Byte, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(_, CC_A(_)) => 3 
}
}
// This is not matched: (CC_B (T_A Byte Boolean)
//      Byte
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A Byte (T_A Byte Boolean)))
// This is not matched: (CC_A Byte Wildcard (T_A Byte (T_A Byte Boolean)))