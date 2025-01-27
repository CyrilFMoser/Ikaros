package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, Byte]) extends T_A[D, Byte]
case class CC_B[E](a: (T_B[(Char,Char)],T_B[Int])) extends T_B[E]
case class CC_C[F](a: (T_B[Byte],T_A[(Char,Char), Byte]), b: (T_B[Byte],Char), c: CC_A[F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_),CC_B(_))) => 0 
  case CC_B((CC_B(_),CC_C(_, _, _))) => 1 
  case CC_B((CC_C(_, _, _),CC_C(_, _, _))) => 2 
  case CC_C(_, _, CC_A(_, _)) => 3 
}
}
// This is not matched: CC_B((CC_C(_, _, _),CC_B(_)))