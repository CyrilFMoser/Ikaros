package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: T_A[D, D]) extends T_A[D, T_B]
case class CC_C(a: (CC_A[T_B],CC_B[T_B]), b: Byte, c: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_D(a: T_A[Byte, T_B], b: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _),CC_B(_, _)), _, CC_A(CC_C(_, _, _), _)) => 0 
  case CC_C((CC_A(_, _),CC_B(_, _)), _, CC_A(CC_D(_, _), _)) => 1 
  case CC_C((CC_A(_, _),CC_B(_, _)), _, CC_B(CC_A(_, _), _)) => 2 
  case CC_C((CC_A(_, _),CC_B(_, _)), _, CC_B(CC_B(_, _), _)) => 3 
}
}