package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Int) extends T_A[C]
case class CC_B(a: T_B[T_A[Char]], b: T_A[T_B[Byte]], c: T_A[Boolean]) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_D[D](a: (CC_C,T_B[CC_C]), b: (T_A[CC_B],T_B[CC_C])) extends T_B[D]
case class CC_E[E](a: CC_B, b: CC_D[E]) extends T_B[E]
case class CC_F[F](a: F, b: (T_B[CC_C],Boolean)) extends T_B[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), 12), _) => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 1 
}
}