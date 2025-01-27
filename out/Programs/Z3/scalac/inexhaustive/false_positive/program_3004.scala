package Program_14 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[(Boolean,Int)], c: T_B[T_A]) extends T_A
case class CC_B[B, C](a: C, b: (CC_A,(Int,Int)), c: T_A) extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), CC_B(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B (Tuple Boolean Int)
//            Boolean
//            Boolean
//            Wildcard
//            (CC_A Wildcard
//                  Wildcard
//                  (CC_B T_A T_A Wildcard Wildcard Wildcard (T_B T_A))
//                  T_A)
//            (T_B (Tuple Boolean Int)))
//      Wildcard
//      T_A)
// This is not matched: (CC_B (CC_C Int Wildcard T_B) T_A)