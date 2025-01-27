package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Int
//      Char
//      (CC_A Int
//            Int
//            (CC_A Int Int Wildcard Wildcard Int (T_A Int Int))
//            Wildcard
//            Wildcard
//            (T_A Int Int))
//      Wildcard
//      Wildcard
//      (T_A Int Char))