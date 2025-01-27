package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[C, T_A[C, D]], c: T_A[T_A[C, C], C]) extends T_A[C, D]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}