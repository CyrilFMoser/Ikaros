package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Char
//      Int
//      (CC_C Char Wildcard Char (T_A Char))
//      (CC_A Int (T_A Int))
//      (T_A Char))