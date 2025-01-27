package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, E, G](a: T_A[E, G]) extends T_A[E, F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(12, CC_A(_, _)) => 3 
  case CC_A(_, CC_A(_, _)) => 4 
  case CC_A(12, _) => 5 
}
}
// This is not matched: (CC_B Int
//      Byte
//      (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      (T_A Byte Int))
// This is not matched: (CC_C Wildcard Wildcard T_A)