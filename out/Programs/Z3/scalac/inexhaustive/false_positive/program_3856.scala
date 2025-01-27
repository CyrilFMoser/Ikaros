package Program_14 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E]) extends T_A[C, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean Wildcard (T_A Byte Byte))
// This is not matched: (CC_A (CC_D Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_D Boolean Boolean Boolean Boolean)
//                (CC_D Boolean Boolean Boolean Boolean))
//           (CC_D Boolean Boolean Boolean Boolean)))