package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Char)], b: T_A[T_A[Char]], c: T_B[T_A[(Int,Boolean)]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_B[CC_A], b: T_B[Char]) extends T_A[T_A[T_B[Byte]]]
case class CC_C[C](a: T_A[C], b: (T_A[Byte],Boolean), c: T_A[C]) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: Int, b: Int) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D()