package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Char Wildcard (CC_A T_A Wildcard (CC_B T_A) T_A) T_A)
// This is not matched: (CC_A (CC_D T_B Wildcard T_B)
//      Wildcard
//      (CC_A (CC_D T_B (CC_C Char (CC_D T_B Wildcard T_B) (T_A T_B)) T_B)
//            Wildcard
//            Wildcard
//            (T_A T_B))
//      (T_A T_B))