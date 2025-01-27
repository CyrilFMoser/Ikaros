package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[Int, E], b: Char, c: T_A[E]) extends T_A[D]
case class CC_B(a: Char, b: CC_A[Char, Int]) extends T_A[T_B[Boolean, Byte]]
case class CC_C() extends T_A[T_B[Boolean, Byte]]

val v_a: T_A[T_B[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, 'x', CC_B(_, _)) => 3 
  case CC_A(_, 'x', CC_A(_, _, _)) => 4 
}
}
// This is not matched: (CC_A (T_B Boolean Byte)
//      (T_B Boolean Byte)
//      Wildcard
//      Wildcard
//      (CC_C (T_A (T_B Boolean Byte)))
//      (T_A (T_B Boolean Byte)))
// This is not matched: (CC_C (T_A (T_B Boolean Byte)))