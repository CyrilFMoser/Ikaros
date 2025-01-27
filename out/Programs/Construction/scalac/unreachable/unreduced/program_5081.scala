package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: CC_C[G]) extends T_B[G, T_B[CC_A[(Char,Char)], T_A[(Char,Boolean)]]]
case class CC_E() extends T_B[T_A[(Char,Boolean)], T_B[CC_A[(Char,Char)], T_A[(Char,Boolean)]]]
case class CC_F(a: Boolean, b: CC_A[T_A[CC_E]], c: CC_D[CC_B[CC_E]]) extends T_B[T_A[CC_A[CC_E]], T_A[CC_C[CC_E]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()