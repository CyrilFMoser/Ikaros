package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Boolean]], b: (T_A[Int, Boolean],T_B[Char])) extends T_A[T_A[T_B[Char], T_B[Int]], T_A[T_A[Boolean, (Int,Byte)], T_B[Byte]]]
case class CC_B[D](a: T_B[T_B[T_B[Int]]]) extends T_B[D]
case class CC_C[F](a: T_A[F, F], b: CC_B[F]) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(CC_C(_, CC_B(_)))