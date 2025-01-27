package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: Boolean) extends T_A[C]
case class CC_B[E]() extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_B Byte Int (T_A Byte Int))