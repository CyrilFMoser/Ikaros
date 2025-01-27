package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[T_A[Boolean, (Char,Int)], E]
case class CC_B(a: T_A[Int, Int], b: T_B[Int, Byte]) extends T_A[T_A[Boolean, (Char,Int)], T_B[Byte, Char]]
case class CC_C[G, H](a: CC_A[H, H], b: Boolean) extends T_B[H, G]
case class CC_D[I]() extends T_B[CC_C[CC_B, CC_B], I]

val v_a: T_A[T_A[Boolean, (Char,Int)], T_B[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(_, _)) => 1 
}
}
// This is not matched: (CC_A (T_B Byte Char)
//      Boolean
//      (T_A (T_A Boolean (Tuple Char Int)) (T_B Byte Char)))
// This is not matched: (CC_B Boolean Char Wildcard Wildcard (T_A Boolean Char))