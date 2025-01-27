package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_B[T_B[Char, Boolean], T_A[Char]]) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_B(a: (T_B[CC_A, CC_A],CC_A), b: ((CC_A,CC_A),(CC_A,CC_A))) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_C[D]() extends T_A[D]
case class CC_D[E]() extends T_B[E, T_A[E]]
case class CC_E[F](a: (CC_C[(Int,Char)],CC_A), b: Boolean, c: T_B[T_A[F], T_A[T_A[F]]]) extends T_B[F, T_A[F]]
case class CC_F() extends T_B[Boolean, T_B[CC_C[Boolean], T_A[CC_C[Boolean]]]]

val v_a: T_A[T_A[T_A[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()