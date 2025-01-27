package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[F, E]
case class CC_B[H](a: Boolean, b: (Char,Char), c: Boolean) extends T_B[H, T_A[(Char,Char), Byte]]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean (T_A Char Boolean))
// This is not matched: (CC_A Byte (T_A Byte))