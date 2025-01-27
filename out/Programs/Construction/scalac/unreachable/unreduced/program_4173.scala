package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C]) extends T_A[C]
case class CC_B[D](a: Int, b: Char, c: T_A[D]) extends T_A[D]
case class CC_C() extends T_B[T_A[Byte]]
case class CC_D[E](a: CC_A[E], b: T_A[E], c: T_A[T_B[CC_C]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, _)) => 0 
  case CC_D(_, _, CC_B(_, _, CC_A(_, _))) => 1 
  case CC_D(_, _, CC_B(_, _, CC_B(_, _, _))) => 2 
}
}