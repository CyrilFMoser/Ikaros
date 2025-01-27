package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: (T_A[CC_B],T_A[Int]), b: T_B[T_B[CC_A, CC_A], Char]) extends T_A[Int]
case class CC_D[D](a: CC_A, b: CC_A) extends T_B[D, T_B[T_A[Int], Boolean]]
case class CC_E[E]() extends T_B[E, T_B[T_A[Int], Boolean]]
case class CC_F[F](a: CC_D[F], b: Byte, c: T_A[F]) extends T_B[F, T_B[T_A[Int], Boolean]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((_,_), _) => 2 
}
}