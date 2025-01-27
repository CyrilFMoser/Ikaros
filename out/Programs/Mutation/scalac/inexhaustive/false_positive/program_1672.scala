package Program_63 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[Byte, Char], b: CC_A[Byte]) extends T_A[T_A[Char, Char], Char]
case class CC_C[E, D, F]() extends T_A[E, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Int Char Boolean (T_A Int Char))
// This is not matched: (CC_A (CC_A (CC_A (CC_A Wildcard T_A) T_A) T_A) T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//