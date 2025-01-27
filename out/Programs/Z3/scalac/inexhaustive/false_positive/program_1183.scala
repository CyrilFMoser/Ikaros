package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: B) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]
case class CC_C(a: (T_B,T_B), b: CC_B[T_B, T_B], c: Boolean) extends T_B
case class CC_D[E]() extends T_B
case class CC_E() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_B Int T_B (T_A Int))
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))