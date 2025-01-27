package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[T_B[T_B[T_B[Byte]]], T_B[T_B[Byte]]], c: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[F](a: CC_A[F], b: T_B[F], c: Boolean) extends T_A[T_B[F], F]
case class CC_C[G](a: G, b: Byte, c: T_A[T_B[G], G]) extends T_A[T_B[((Boolean,Boolean),Int)], ((Boolean,Boolean),Int)]

val v_a: T_A[T_B[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 1 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 2 
  case CC_A(_, CC_B(CC_A(_, _, _), _, _), _) => 3 
  case CC_B(_, _, _) => 4 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _)