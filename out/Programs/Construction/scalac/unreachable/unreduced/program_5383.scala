package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, Int],Char)) extends T_A[Char, C]
case class CC_B[D](a: CC_A[D]) extends T_A[Char, D]
case class CC_C[E](a: T_A[Char, E]) extends T_A[Char, E]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A((_,_))) => 1 
  case CC_C(CC_A((_,_))) => 2 
  case CC_C(CC_B(CC_A(_))) => 3 
  case CC_C(CC_C(_)) => 4 
}
}