package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: T_A[E, E]) extends T_A[T_B[T_A[Boolean, Boolean], T_B[Boolean, (Byte,Int)]], E]
case class CC_B() extends T_A[T_B[T_A[Boolean, Boolean], T_B[Boolean, (Byte,Int)]], Char]
case class CC_C(a: CC_B, b: T_A[CC_A[CC_B], T_A[CC_B, CC_B]], c: T_A[T_B[CC_B, Byte], (CC_B,CC_B)]) extends T_A[T_B[T_A[Boolean, Boolean], T_B[Boolean, (Byte,Int)]], Char]

val v_a: T_A[T_B[T_A[Boolean, Boolean], T_B[Boolean, (Byte,Int)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_B(), _, _)