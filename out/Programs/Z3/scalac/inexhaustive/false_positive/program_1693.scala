package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean], b: T_A, c: T_B[T_A, T_A]) extends T_A
case class CC_B[C]() extends T_B[C, T_B[T_A, T_A]]
case class CC_C[D, E](a: E, b: Byte) extends T_B[D, T_B[T_A, T_A]]

val v_a: T_B[Int, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_C(_, 0) => 2 
}
}
// This is not matched: (CC_C Int Boolean Boolean Wildcard (T_B Int (T_B T_A T_A)))
// This is not matched: Pattern match is empty without constants