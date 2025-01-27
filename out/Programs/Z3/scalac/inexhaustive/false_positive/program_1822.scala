package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[Char], b: Boolean, c: T_A[Char]) extends T_A[Char]
case class CC_B(a: Int) extends T_A[Char]
case class CC_C[D](a: D) extends T_B[D]
case class CC_D(a: T_B[CC_B], b: T_A[Int], c: T_A[CC_B]) extends T_B[T_A[Char]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_B(_), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_)) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(CC_B(_), _, _) => 5 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (CC_A Boolean
//            (CC_A Boolean
//                  (CC_A Boolean Wildcard Wildcard Wildcard (T_A Char))
//                  Wildcard
//                  Wildcard
//                  (T_A Char))
//            Wildcard
//            (CC_A Boolean Wildcard Boolean Wildcard (T_A Char))
//            (T_A Char))
//      (T_A Char))
// This is not matched: (CC_C (T_A Int Int) Int Wildcard (T_A Int (T_A Int Int)))