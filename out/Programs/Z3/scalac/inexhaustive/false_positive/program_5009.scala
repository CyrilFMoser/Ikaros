package Program_14 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D]) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C[G](a: Byte, b: T_A[G]) extends T_B[G, Byte]
case class CC_D(a: T_A[Char], b: T_A[Byte], c: CC_B[Char]) extends T_B[Byte, Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(0, CC_A(_)) => 0 
  case CC_C(_, CC_A(_)) => 1 
  case CC_C(0, CC_B()) => 2 
  case CC_C(_, CC_B()) => 3 
}
}
// This is not matched: (CC_C Boolean
//      Byte
//      (CC_A Boolean Boolean (CC_B Boolean (T_A Boolean)) (T_A Boolean))
//      (T_B Boolean Byte))
// This is not matched: (CC_B Byte (CC_A Wildcard Wildcard T_A) Wildcard T_A)