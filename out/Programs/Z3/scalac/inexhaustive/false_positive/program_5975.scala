package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Byte, Int], C]
case class CC_B[D, E](a: T_A[E, D], b: D, c: D) extends T_A[T_A[Byte, Int], D]

val v_a: T_A[T_A[Byte, Int], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 'x', _) => 1 
  case CC_B(CC_A(), _, _) => 2 
  case CC_B(CC_A(), 'x', _) => 3 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte Int) Char))
// This is not matched: (CC_A T_A)