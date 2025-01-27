package Program_13 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[Char], b: T_B[Int]) extends T_A[T_A[Char, (Byte,Int)], Boolean]
case class CC_B[D, E](a: T_A[E, D], b: D) extends T_A[D, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_B Wildcard T_A)