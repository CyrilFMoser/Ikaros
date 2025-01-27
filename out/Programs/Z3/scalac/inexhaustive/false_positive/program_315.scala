package Program_28 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: T_A[T_B], b: Char, c: CC_A[T_B, Boolean]) extends T_A[(T_B,Char)]
case class CC_C(a: T_B, b: Int, c: (T_B,Int)) extends T_B

val v_a: T_A[(T_B,Char)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(_, 'x', CC_A()) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))