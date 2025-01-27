package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: CC_A[D]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(CC_A()) => 2 
}
}
// This is not matched: (CC_B Boolean Boolean (CC_A Boolean (T_A Boolean)) (T_A Boolean))
// This is not matched: (CC_C Int
//      (CC_B Int
//            (CC_A Int (T_A Int))
//            (CC_B Int Wildcard (CC_A Int (T_A Int)) (T_A Int))
//            (T_A Int))
//      Wildcard
//      (T_A Int))