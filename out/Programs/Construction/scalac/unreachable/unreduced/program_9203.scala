package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B[C](a: C, b: CC_A, c: T_A[T_A[Byte]]) extends T_B[C]
case class CC_C[D](a: T_A[D]) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 0 
  case CC_B(_, _, CC_A(CC_C(_))) => 1 
  case CC_C(_) => 2 
}
}