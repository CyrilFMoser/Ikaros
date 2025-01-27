package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A
case class CC_B(a: T_B, b: (T_A,T_A)) extends T_B
case class CC_C(a: T_A) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A (T_A (Tuple Int Char) Boolean)
//      Wildcard
//      (T_A (T_A Int Int) (T_A (Tuple Int Char) Boolean)))