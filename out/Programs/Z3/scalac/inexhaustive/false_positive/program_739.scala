package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Char]) extends T_A[T_A[Int]]
case class CC_B[B, C](a: T_A[C], b: CC_A, c: (CC_A,CC_A)) extends T_A[B]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 1 
}
}
// This is not matched: (CC_B Char
//      Byte
//      (CC_B Byte
//            Boolean
//            Wildcard
//            (CC_A Wildcard Wildcard (T_A (T_A Int)))
//            Wildcard
//            (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_C (T_A (T_A (CC_A (T_A Boolean)
//                      (T_A Boolean)
//                      (T_A (T_A Boolean))
//                      (T_A Boolean)))))