package Program_15 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Int) extends T_A
case class CC_B[A](a: A, b: A, c: A) extends T_A
case class CC_C(a: CC_A, b: CC_B[T_B]) extends T_A
case class CC_D(a: CC_C, b: T_A) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _)) => 0 
  case CC_D(CC_C(_, _), CC_A(_)) => 1 
}
}
// This is not matched: (CC_D Wildcard (CC_B Boolean Wildcard Wildcard Boolean T_A) T_B)
// This is not matched: (CC_A (CC_C (CC_B Wildcard Wildcard T_A)
//            (CC_B Wildcard
//                  (CC_A (CC_A (CC_C Wildcard Wildcard T_A) T_A) T_A)
//                  T_A)
//            T_A)
//      T_A)