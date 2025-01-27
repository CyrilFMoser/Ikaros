package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[T_B, C]
case class CC_B[E](a: T_A[T_B, E], b: T_A[(Byte,T_B), E]) extends T_A[T_B, E]
case class CC_C[F](a: CC_A[F, F], b: F) extends T_A[T_B, F]
case class CC_D(a: T_A[T_B, CC_B[T_B]], b: T_A[T_B, T_A[T_B, (Boolean,Char)]]) extends T_B
case class CC_E(a: CC_A[((Byte,Char),Boolean), Int]) extends T_B
case class CC_F(a: CC_D, b: T_A[T_B, CC_D], c: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(CC_C(_, _), _) => 1 
  case CC_E(CC_A()) => 2 
  case CC_F(_, CC_A(), _) => 3 
  case CC_F(_, CC_B(_, _), _) => 4 
  case CC_F(_, CC_C(_, _), _) => 5 
}
}
// This is not matched: CC_D(CC_B(_, _), _)