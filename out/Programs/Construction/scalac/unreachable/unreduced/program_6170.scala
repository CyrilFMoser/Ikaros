package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: D, b: Char, c: CC_A[D]) extends T_A[T_B, D]
case class CC_C[E](a: E, b: (CC_B[T_B],T_B)) extends T_A[T_B, E]
case class CC_D(a: T_A[T_B, CC_C[T_B]]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_C(_, (CC_B(_, _, _),CC_D(_))) => 2 
  case CC_C(_, (CC_B(_, _, _),CC_E())) => 3 
}
}