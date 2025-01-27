package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Char], c: (Int,Boolean)) extends T_A[T_A[Int]]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C[B](a: T_A[Byte], b: T_A[B], c: T_A[B]) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B (CC_C Byte
//            (CC_B Wildcard (T_A Byte))
//            Wildcard
//            (CC_B (CC_B (CC_C Boolean Wildcard Wildcard Wildcard (T_A Byte))
//                        (T_A Byte))
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_B Boolean (T_A Boolean))