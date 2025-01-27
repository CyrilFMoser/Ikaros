package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Int) extends T_A[T_B, C]
case class CC_B[E, F]() extends T_A[E, T_B]

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int T_B Wildcard (T_A T_B Int))
// This is not matched: (CC_C Wildcard T_B)