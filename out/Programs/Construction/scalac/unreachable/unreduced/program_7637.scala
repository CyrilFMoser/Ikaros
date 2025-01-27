package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: CC_A[D]) extends T_A[T_A[T_A[D, D], D], D]

val v_a: T_A[T_A[T_A[Char, Char], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}