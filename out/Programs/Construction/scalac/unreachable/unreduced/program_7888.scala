package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Int], (Boolean,Byte)]]
case class CC_B(a: T_B[T_A[CC_A], T_A[CC_A]], b: (T_B[CC_A, CC_A],T_B[Char, CC_A]), c: T_A[T_A[(Byte,Boolean)]]) extends T_A[T_B[T_A[Int], (Boolean,Byte)]]
case class CC_C[E, D](a: CC_B, b: E) extends T_B[E, D]
case class CC_D[F, G](a: CC_A, b: T_A[F], c: CC_C[CC_B, T_B[F, F]]) extends T_B[G, F]
case class CC_E[H](a: (CC_B,CC_D[CC_A, CC_B]), b: H) extends T_B[H, Boolean]

val v_a: T_B[T_A[T_B[T_A[Int], (Boolean,Byte)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_D(CC_A(), _, CC_C(_, _)) => 1 
  case CC_E((CC_B(_, _, _),CC_D(_, _, _)), _) => 2 
}
}
// This is not matched: CC_C(_, CC_B(_, _, _))