package Program_29 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: C, b: T_A[B], c: B) extends T_A[B]
case class CC_B() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Int T_B Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: (CC_B Char (T_B Char (Tuple T_A (CC_A T_A T_A T_A))))