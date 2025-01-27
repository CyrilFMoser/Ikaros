package Program_13 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B[B, C](a: T_A[B]) extends T_A[B]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_B (T_A Boolean) Boolean Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_C Int
//      Wildcard
//      Wildcard
//      (CC_C Int
//            (CC_A Int Int Wildcard Int Wildcard (T_A Int Int))
//            Int
//            Wildcard
//            (T_B Int))
//      (T_B Int))