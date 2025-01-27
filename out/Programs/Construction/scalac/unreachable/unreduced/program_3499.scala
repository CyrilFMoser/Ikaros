package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: (T_A[Char],T_A[Boolean]), b: T_A[D]) extends T_A[C]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F], b: F, c: T_A[F]) extends T_A[F]
case class CC_D(a: T_B[CC_B[Char]]) extends T_B[T_A[(Boolean,Boolean)]]
case class CC_E() extends T_B[T_A[(Boolean,Boolean)]]
case class CC_F(a: Int, b: CC_E) extends T_B[T_A[(Boolean,Boolean)]]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_E(), CC_A(_, _)) => 2 
  case CC_C(_, CC_E(), CC_B(CC_A(_, _))) => 3 
  case CC_C(_, CC_E(), CC_B(CC_C(_, _, _))) => 4 
  case CC_C(_, CC_E(), CC_C(_, CC_E(), _)) => 5 
}
}
// This is not matched: CC_C(_, CC_E(), CC_B(CC_B(_)))