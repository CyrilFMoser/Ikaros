package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: F, b: T_B) extends T_A[E, F]
case class CC_C[G]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C T_B T_B)
// This is not matched: (CC_C T_B T_B)