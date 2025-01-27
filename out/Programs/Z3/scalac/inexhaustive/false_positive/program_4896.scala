package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Byte, b: T_A[E, C]) extends T_A[D, C]
case class CC_B[G, F](a: Byte) extends T_A[F, G]

val v_a: CC_A[Byte, Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Byte
//      Boolean
//      Int
//      Wildcard
//      (CC_B Boolean Int Wildcard (T_A Int Boolean))
//      (T_A Byte Boolean))
// This is not matched: (CC_A Byte
//      Boolean
//      Int
//      Wildcard
//      (CC_B Boolean Int Wildcard (T_A Int Boolean))
//      (T_A Byte Boolean))