package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, Boolean], b: T_A[(Int,Char)]) extends T_A[T_B[(Int,Int), (Int,Int)]]
case class CC_B[D, E](a: E, b: T_A[CC_A]) extends T_A[D]

val v_a: T_A[T_B[(Int,Int), (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B (Tuple Int Char)
//            Boolean
//            Wildcard
//            (CC_B (CC_A Boolean Boolean Boolean)
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_A Boolean Boolean Boolean)))
//            (T_A (Tuple Int Char)))
//      (T_A (T_B (Tuple Int Int) (Tuple Int Int))))
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))