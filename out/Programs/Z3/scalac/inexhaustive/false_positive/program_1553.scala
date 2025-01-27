package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B() extends T_B[T_A[Int, Char]]
case class CC_C[E]() extends T_B[T_A[Int, Char]]

val v_a: T_B[T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_C Boolean (T_B (T_A Int Char)))
// This is not matched: Pattern match is empty without constants