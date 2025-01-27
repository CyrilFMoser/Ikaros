package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: CC_A, b: CC_B[CC_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A() => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A Wildcard
//      (CC_A Int
//            (CC_B (CC_A Wildcard (CC_C Boolean Wildcard T_A) T_A)
//                  Wildcard
//                  Wildcard
//                  T_A)
//            T_A)
//      T_A)