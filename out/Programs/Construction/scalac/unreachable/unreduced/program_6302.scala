package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Boolean], T_A[Int]], b: T_B[T_B[Char, (Int,Int)], (Char,Boolean)], c: T_B[Boolean, T_A[Char]]) extends T_A[T_B[T_B[Byte, Int], T_A[Char]]]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[T_A[CC_A]]
case class CC_C(a: (T_B[CC_A, CC_B],T_A[Byte]), b: (CC_B,T_A[CC_A])) extends T_A[T_A[CC_A]]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F](a: CC_A, b: Boolean, c: Boolean) extends T_B[T_A[CC_B], F]
case class CC_F[G](a: Byte, b: T_A[T_A[CC_A]]) extends T_B[T_A[CC_B], G]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_D(), CC_D(), CC_D()), _, _) => 0 
  case CC_C(_, (CC_B(_, _, _),_)) => 1 
}
}