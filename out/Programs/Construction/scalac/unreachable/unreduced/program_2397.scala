package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Boolean,Char)]], b: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: T_A[E], b: Int, c: CC_C[E]) extends T_B[E]

val v_a: T_B[T_A[T_A[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_C()) => 1 
}
}
// This is not matched: CC_B()