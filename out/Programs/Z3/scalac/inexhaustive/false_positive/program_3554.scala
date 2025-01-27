package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[B]
case class CC_B[C, D](a: T_A[D]) extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 12) => 0 
  case CC_A(_, 12) => 1 
  case CC_A(CC_A(_, _), _) => 2 
}
}
// This is not matched: (CC_A Int
//      (CC_B Int
//            (CC_A Boolean Boolean Boolean Boolean)
//            (CC_A (CC_A Boolean Boolean Boolean Boolean)
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_A Boolean Boolean Boolean Boolean)))
//            (T_A Int))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_B (Tuple Wildcard (CC_B Wildcard T_A)) T_A)