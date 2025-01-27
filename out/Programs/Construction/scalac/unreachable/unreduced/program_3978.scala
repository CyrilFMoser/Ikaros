package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[T_B[Boolean]], T_B[T_B[T_B[Boolean]]]], b: T_A[D, D], c: T_A[((Char,Byte),(Boolean,Char)), D]) extends T_A[D, T_B[D]]
case class CC_B[F](a: CC_A[F], b: T_B[T_B[F]]) extends T_B[F]
case class CC_C[G, H](a: T_A[H, T_B[H]], b: (CC_A[Int],Byte), c: CC_A[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_C(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, CC_C(_, _, CC_A(_, _, _)))