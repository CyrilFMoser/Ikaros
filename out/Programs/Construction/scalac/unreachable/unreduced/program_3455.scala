package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[C](a: T_B[C]) extends T_B[C]
case class CC_C[D](a: D, b: D) extends T_B[D]
case class CC_D[E](a: E, b: Int, c: T_B[E]) extends T_B[E]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_B(_))) => 0 
  case CC_A(CC_B(CC_C(_, _))) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_A(CC_D(_, _, CC_B(_))) => 3 
  case CC_A(CC_D(_, _, CC_C(_, _))) => 4 
  case CC_A(CC_D(_, _, CC_D(_, _, _))) => 5 
}
}
// This is not matched: CC_A(CC_B(CC_D(_, _, _)))