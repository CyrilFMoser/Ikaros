package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: Boolean, b: T_A) extends T_A
case class CC_C[A](a: CC_B, b: T_A) extends T_A

val v_a: CC_C[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), CC_A(_, _, _)) => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(CC_B(_, _), CC_B(_, _)) => 3 
}
}
// This is not matched: (CC_C T_A
//      (CC_B Wildcard Wildcard T_A)
//      (CC_C T_A
//            (CC_B Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//            Wildcard
//            T_A)
//      T_A)
// This is not matched: (CC_A Boolean (T_A Boolean))