package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Char],T_B[Char])) extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: T_A[T_A[(Byte,Byte)]]) extends T_A[T_A[(Char,Boolean)]]
case class CC_C(a: T_A[CC_A], b: T_B[CC_A]) extends T_A[T_A[(Char,Boolean)]]
case class CC_D[C](a: CC_A) extends T_B[C]
case class CC_E[D](a: T_A[D], b: T_B[D]) extends T_B[D]
case class CC_F[E](a: T_B[E], b: CC_B, c: E) extends T_B[E]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_E(_, CC_D(_))) => 2 
  case CC_C(_, CC_E(_, CC_E(_, _))) => 3 
  case CC_C(_, CC_E(_, CC_F(_, _, _))) => 4 
  case CC_C(_, CC_F(_, CC_B(_), _)) => 5 
}
}
// This is not matched: CC_C(_, CC_D(CC_A(_)))