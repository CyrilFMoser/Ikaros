package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], Boolean]) extends T_A[C, Boolean]
case class CC_B[E](a: CC_A[E]) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 2 
  case CC_B(_) => 3 
}
}