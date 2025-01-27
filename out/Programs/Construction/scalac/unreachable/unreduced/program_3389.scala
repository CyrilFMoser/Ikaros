package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Int,Byte)], b: Char, c: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_B[T_B[CC_A, CC_B], Char], b: T_B[CC_B, T_A[Boolean]], c: T_B[T_A[CC_A], T_A[Byte]]) extends T_A[Byte]
case class CC_D[E, D](a: CC_B, b: T_B[D, E]) extends T_B[D, E]
case class CC_E[F](a: (T_B[CC_C, Int],T_B[CC_C, CC_B]), b: T_B[F, F], c: T_A[Char]) extends T_B[F, T_A[Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_D(_, CC_D(_, _)), CC_D(_, _), CC_D(_, _))