package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[(Int,Char), T_A[Int, Int]], b: T_A[Int, T_A[Char, Char]], c: Byte) extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], (T_B[Boolean],T_B[Int])]
case class CC_B(a: T_B[CC_A]) extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], (T_B[Boolean],T_B[Int])]
case class CC_C() extends T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], (T_B[Boolean],T_B[Int])]
case class CC_D[D](a: CC_A) extends T_B[D]
case class CC_E[E](a: T_B[E], b: T_B[E], c: Int) extends T_B[E]
case class CC_F[F](a: F, b: Byte) extends T_B[F]

val v_a: T_A[T_A[T_B[Char], T_B[(Boolean,Byte)]], (T_B[Boolean],T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_D(_)) => 1 
  case CC_B(CC_E(_, _, _)) => 2 
  case CC_B(CC_F(_, _)) => 3 
}
}
// This is not matched: CC_C()