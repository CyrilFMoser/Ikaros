package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Char]]) extends T_A[T_B[T_A[Char], Int]]
case class CC_B(a: T_A[CC_A], b: T_A[(CC_A,CC_A)], c: T_A[(CC_A,CC_A)]) extends T_A[T_B[T_A[Char], Int]]
case class CC_C() extends T_A[T_B[T_A[Char], Int]]
case class CC_D[E, D](a: T_A[T_A[D]]) extends T_B[E, D]

val v_a: T_A[T_B[T_A[Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}