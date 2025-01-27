package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Boolean, b: T_A[D, D]) extends T_A[C, D]

val v_a: CC_A[Int, Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Int
//      Int
//      Int
//      Wildcard
//      (CC_A Int
//            Int
//            Boolean
//            Boolean
//            (CC_A Int Int Boolean Boolean Wildcard (T_A Int Int))
//            (T_A Int Int))
//      (T_A Int Int))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)