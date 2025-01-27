package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[T_A[T_B[(Char,Char), Byte]]], c: T_B[D, D]) extends T_A[D]
case class CC_B[F](a: CC_A[F], b: T_A[F]) extends T_A[F]
case class CC_C() extends T_B[T_A[(Byte,Char)], CC_A[((Int,Boolean),Int)]]
case class CC_D(a: Int, b: CC_B[T_A[CC_C]]) extends T_B[T_A[(Byte,Char)], CC_A[((Int,Boolean),Int)]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)