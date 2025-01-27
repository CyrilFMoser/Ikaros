package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, T_B[D, D]]) extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],CC_A[Int]), b: T_A[E], c: T_A[E]) extends T_B[(T_A[(Byte,Int)],T_A[Byte]), E]
case class CC_C[F]() extends T_B[(T_A[(Byte,Int)],T_A[Byte]), F]
case class CC_D[G](a: CC_B[G]) extends T_B[(T_A[(Byte,Int)],T_A[Byte]), G]

val v_a: T_B[(T_A[(Byte,Int)],T_A[Byte]), Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B((_,_), CC_A(_, _), _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)