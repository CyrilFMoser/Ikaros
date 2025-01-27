package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[(T_B[Byte],T_A[Char, Boolean]), D]
case class CC_B[E](a: ((Boolean,Char),CC_A[Byte]), b: T_A[E, E]) extends T_A[(T_B[Byte],T_A[Char, Boolean]), E]
case class CC_C[F](a: CC_B[T_B[F]], b: CC_A[F], c: CC_A[F]) extends T_A[F, T_B[F]]
case class CC_D(a: CC_B[CC_A[Int]], b: (CC_B[Byte],Char)) extends T_B[T_B[CC_A[Byte]]]

val v_a: T_A[(T_B[Byte],T_A[Char, Boolean]), T_B[(T_B[Byte],T_A[Char, Boolean])]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(((_,_),CC_A(_)), _)