package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_B[A](a: T_A, b: A, c: T_A) extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C(_)) => 0 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_B Boolean
//      (CC_C (CC_C (CC_A (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                        Wildcard
//                        T_A)
//                  T_A)
//            T_A)
//      Wildcard
//      (CC_B Boolean
//            (CC_A (CC_C (CC_C Wildcard T_A) T_A) Wildcard T_A)
//            Boolean
//            (CC_A Wildcard Wildcard T_A)
//            T_A)
//      T_A)
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard (T_B (CC_A T_A) T_A))