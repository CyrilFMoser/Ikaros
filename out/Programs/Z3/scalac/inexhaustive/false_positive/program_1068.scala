package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: T_A[Byte]) extends T_A[T_A[Int]]
case class CC_C[B](a: T_A[CC_B], b: T_A[CC_B], c: CC_A) extends T_A[CC_B]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, CC_A(_)) => 0 
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), _) => 1 
}
}
// This is not matched: (CC_C Boolean
//      (CC_C Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (CC_B Boolean Boolean Boolean Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (CC_B Boolean Boolean Boolean (T_A Boolean))))
// This is not matched: (CC_A Int Wildcard (T_A Int Char))