package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_A[T_A[Boolean]]) extends T_A[T_B[(Int,Int), Int]]
case class CC_B[D](a: CC_A) extends T_B[(T_A[CC_A],Char), D]
case class CC_C[E](a: E, b: T_A[E], c: (CC_A,Byte)) extends T_B[(T_A[CC_A],Char), E]
case class CC_D[F](a: F, b: T_B[F, F], c: Byte) extends T_B[(T_A[CC_A],Char), F]

val v_a: T_B[(T_A[CC_A],Char), Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)