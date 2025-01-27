package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A[T_B[Boolean]], c: Char) extends T_A[T_B[Boolean]]
case class CC_B(a: T_A[Char], b: T_B[Byte]) extends T_A[T_B[Boolean]]
case class CC_C(a: Char) extends T_A[CC_A]
case class CC_D[C](a: Boolean, b: CC_A) extends T_B[C]
case class CC_E[D]() extends T_B[D]
case class CC_F[E](a: T_A[E], b: T_A[E], c: T_B[E]) extends T_B[E]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_D(_, _), CC_A(_, _, _), _)) => 0 
  case CC_D(_, CC_A(CC_E(), CC_A(_, _, _), _)) => 1 
  case CC_D(_, CC_A(CC_F(_, _, _), CC_A(_, _, _), _)) => 2 
  case CC_D(_, CC_A(CC_D(_, _), CC_B(_, _), _)) => 3 
  case CC_D(_, CC_A(CC_E(), CC_B(_, _), _)) => 4 
  case CC_D(_, CC_A(CC_F(_, _, _), CC_B(_, _), _)) => 5 
  case CC_F(_, _, CC_D(_, CC_A(_, _, _))) => 6 
  case CC_F(_, _, CC_E()) => 7 
  case CC_F(_, _, CC_F(_, _, CC_D(_, _))) => 8 
  case CC_F(_, _, CC_F(_, _, CC_E())) => 9 
  case CC_F(_, _, CC_F(_, _, CC_F(_, _, _))) => 10 
}
}
// This is not matched: CC_E()