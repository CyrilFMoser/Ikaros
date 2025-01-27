package Program_29 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: Char, b: T_A[CC_B], c: T_A[CC_B]) extends T_A[Boolean]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), CC_A()) => 0 
  case CC_C('x', _, CC_A()) => 1 
  case CC_C('x', _, _) => 2 
  case CC_C('x', CC_A(), CC_A()) => 3 
  case CC_C('x', CC_A(), _) => 4 
  case CC_C(_, CC_A(), _) => 5 
  case CC_C(_, _, CC_A()) => 6 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A (CC_B Boolean) Boolean (T_A (CC_B Boolean)))
//      (CC_A (CC_B Boolean) Boolean (T_A (CC_B Boolean)))
//      (T_A Boolean))
// This is not matched: (CC_B (CC_E (T_A T_B) (T_A (T_A T_B)) (T_A T_B) (T_A T_B))
//      (CC_C (CC_B T_B
//                  (CC_D Wildcard
//                        (CC_A (Tuple Boolean Byte)
//                              Wildcard
//                              Wildcard
//                              (T_A (Tuple Boolean Byte)))
//                        T_B)
//                  (T_A T_B))
//            T_B)
//      (T_A (CC_E (T_A T_B) (T_A (T_A T_B)) (T_A T_B) (T_A T_B))))