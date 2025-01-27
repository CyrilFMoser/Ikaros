package Program_29 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: T_A, c: T_A) extends T_A

val v_a: CC_A[T_A] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
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