package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, C], C]]
case class CC_B[D](a: CC_A[D], b: T_A[CC_A[D], D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Char, D], D]]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}