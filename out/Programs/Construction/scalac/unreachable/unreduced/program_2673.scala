package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[((T_B,T_B),T_A[T_B, T_B]), D]
case class CC_C[E](a: Byte, b: T_A[E, T_A[E, E]], c: (CC_B[T_B],T_A[T_B, Int])) extends T_A[((T_B,T_B),T_A[T_B, T_B]), E]
case class CC_D(a: T_A[T_B, CC_A[T_B]], b: T_B, c: CC_C[CC_A[T_B]]) extends T_B
case class CC_E(a: CC_D, b: T_A[Boolean, T_A[Boolean, Boolean]]) extends T_B
case class CC_F(a: (CC_B[CC_E],CC_B[T_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _, _), _) => 0 
  case CC_D(_, CC_F((_,_)), _) => 1 
  case CC_E(_, CC_A(CC_A(_, _), _)) => 2 
  case CC_F((CC_B(),CC_B())) => 3 
}
}
// This is not matched: CC_D(_, CC_E(CC_D(_, _, _), CC_A(_, _)), _)