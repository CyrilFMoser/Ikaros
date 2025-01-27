package Program_31 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A
case class CC_C(a: CC_B, b: Byte, c: CC_B) extends T_A

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
  case CC_A(CC_C(_, _, _)) => 1 
  case CC_A(CC_A(_)) => 2 
}
}
// This is not matched: (CC_A Int (CC_A T_A (CC_B (Tuple Wildcard Wildcard) T_A) T_A) T_A)
// This is not matched: (CC_A (CC_A (CC_B Boolean Boolean Wildcard T_A)
//            (CC_B Boolean Boolean Wildcard T_A)
//            (CC_B Wildcard Wildcard Boolean T_A)
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)