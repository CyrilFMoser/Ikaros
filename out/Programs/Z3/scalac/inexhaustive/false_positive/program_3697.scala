package Program_13 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[Int, C]) extends T_A[Int, C]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      (CC_A Boolean
//            Int
//            (CC_A Boolean Boolean Wildcard Wildcard (T_A Int Boolean))
//            Wildcard
//            (T_A Int Boolean))
//      (T_A Int Boolean))
// This is not matched: (CC_A T_A)