package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_A[Char]]) extends T_A[T_B[T_A[Int], Byte]]
case class CC_B(a: T_A[CC_A], b: (T_B[Char, CC_A],T_B[(Char,Int), CC_A]), c: T_B[T_B[CC_A, CC_A], Char]) extends T_A[T_B[T_A[Int], Byte]]
case class CC_C() extends T_A[T_B[T_A[Int], Byte]]
case class CC_D[D]() extends T_B[T_B[CC_A, CC_A], D]
case class CC_E[E](a: Boolean, b: (CC_A,Byte)) extends T_B[T_B[CC_A, CC_A], E]
case class CC_F[F](a: CC_B, b: Byte, c: CC_A) extends T_B[T_B[CC_A, CC_A], F]

val v_a: T_A[T_B[T_A[Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)