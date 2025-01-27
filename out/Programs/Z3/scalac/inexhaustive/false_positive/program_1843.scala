package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[(Boolean,Int), E]
case class CC_B(a: T_A[Char, Boolean], b: CC_A[(Boolean,Boolean), Char]) extends T_A[(Boolean,Int), CC_A[Char, Byte]]
case class CC_C[H, G](a: H, b: (CC_B,CC_B)) extends T_B[H, G]
case class CC_D[J, I](a: (CC_B,CC_B), b: CC_B) extends T_B[I, J]

val v_a: T_A[(Boolean,Int), Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A (Tuple Boolean Int) Boolean))
// This is not matched: (CC_B Byte Wildcard (T_A Byte))