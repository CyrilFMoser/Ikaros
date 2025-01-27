package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E](a: (T_A[(Boolean,Boolean)],CC_B[CC_A]), b: CC_B[E]) extends T_A[E]
case class CC_D[F]() extends T_B[F, CC_B[F]]
case class CC_E(a: (T_A[CC_A],T_B[CC_A, CC_A]), b: CC_A, c: T_B[T_A[Char], T_A[CC_A]]) extends T_B[T_A[T_A[CC_A]], T_A[CC_A]]
case class CC_F(a: (CC_E,T_A[CC_A]), b: T_A[T_A[CC_A]]) extends T_B[T_A[T_A[CC_A]], T_A[CC_A]]

val v_a: T_B[T_A[T_A[CC_A]], T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_E((CC_B(_),_), CC_A(), _) => 0 
  case CC_E((CC_C(_, _),_), CC_A(), _) => 1 
  case CC_F(_, CC_B(CC_B(_))) => 2 
  case CC_F(_, CC_B(CC_C(_, _))) => 3 
  case CC_F(_, CC_C(_, CC_B(_))) => 4 
}
}