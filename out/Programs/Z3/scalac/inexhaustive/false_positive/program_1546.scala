package Program_29 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: T_A) extends T_A

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A T_A Wildcard Wildcard T_A)
//      (CC_A T_A
//            Wildcard
//            (CC_A T_A Wildcard (CC_A T_A Wildcard Wildcard T_A) T_A)
//            T_A)
//      T_A)
// This is not matched: (CC_A Int Char Wildcard (T_A Int Char))