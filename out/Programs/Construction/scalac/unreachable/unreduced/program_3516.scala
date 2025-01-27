package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[(Int,Char), C], C]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[T_A[(Int,Char), D], D]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[T_A[(Int,Char), E], E]]

val v_a: T_A[Char, T_A[T_A[(Int,Char), Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}