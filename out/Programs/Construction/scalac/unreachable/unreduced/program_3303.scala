package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: Byte, c: T_B[T_B[CC_A]]) extends T_A[CC_A]
case class CC_C[C](a: CC_B, b: (Char,CC_B)) extends T_B[C]
case class CC_D[D](a: ((CC_A,CC_A),T_B[Boolean])) extends T_B[D]
case class CC_E[E](a: T_B[E], b: Byte) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(((_,_),CC_C(_, _))) => 1 
  case CC_D(((_,_),CC_D(_))) => 2 
  case CC_E(CC_C(CC_B(_, _, _), _), _) => 3 
  case CC_E(CC_D(_), _) => 4 
  case CC_E(CC_E(_, 0), _) => 5 
  case CC_E(CC_E(_, _), _) => 6 
}
}
// This is not matched: CC_D(((_,_),CC_E(_, _)))