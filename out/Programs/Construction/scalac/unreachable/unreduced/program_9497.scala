package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Byte)], b: T_B[T_A[Int]], c: T_A[Char]) extends T_A[T_B[T_A[Int]]]
case class CC_B() extends T_A[T_B[T_A[Int]]]
case class CC_C[C](a: T_A[C]) extends T_B[C]
case class CC_D[D](a: (T_B[CC_A],T_B[Int]), b: D, c: D) extends T_B[D]
case class CC_E[E](a: E, b: E) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)