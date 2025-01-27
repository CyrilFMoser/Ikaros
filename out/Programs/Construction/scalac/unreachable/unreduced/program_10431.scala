package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_B[T_B[Byte]], c: T_A[(Boolean,Char)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: E, b: T_A[E], c: Int) extends T_B[E]

val v_a: T_B[T_A[T_A[T_B[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_C()