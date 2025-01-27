package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: Byte) extends T_A[B]
case class CC_B[D](a: CC_A[D, D], b: T_A[D], c: T_A[Byte]) extends T_A[CC_A[Byte, Boolean]]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Int
//      Int
//      (CC_A Int
//            Boolean
//            (CC_A Int
//                  Boolean
//                  (CC_A Int
//                        Boolean
//                        (CC_A Int Boolean Wildcard Wildcard (T_A Int))
//                        Byte
//                        (T_A Int))
//                  Byte
//                  (T_A Int))
//            Byte
//            (T_A Int))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_B Wildcard Wildcard T_B)