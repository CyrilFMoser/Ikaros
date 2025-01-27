package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_B[T_A[Int]], c: T_A[(Boolean,Char)]) extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_A[Int]
case class CC_D[C](a: T_A[Int], b: C, c: T_B[C]) extends T_B[C]
case class CC_E[D](a: (Byte,T_A[Int]), b: D, c: ((CC_C,CC_C),T_B[CC_C])) extends T_B[D]
case class CC_F[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}