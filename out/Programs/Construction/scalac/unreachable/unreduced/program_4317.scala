package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: E) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_B[(Char,Char), (Int,Char)]]
case class CC_D(a: T_B[CC_A[(Byte,Boolean)], T_A[Int]], b: CC_A[CC_C[Byte]]) extends T_B[CC_C[CC_A[Int]], T_B[(Char,Char), (Int,Char)]]
case class CC_E(a: CC_B[T_A[CC_D]], b: T_A[T_A[CC_D]]) extends T_B[CC_C[CC_A[Int]], T_B[(Char,Char), (Int,Char)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}