package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_B, E]
case class CC_D(a: (T_B,T_A[T_B, (Boolean,Char)])) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_B())) => 0 
  case CC_D((_,CC_C(_))) => 1 
  case CC_D((_,CC_A())) => 2 
  case CC_D((CC_F(),CC_C(_))) => 3 
  case CC_E() => 4 
  case CC_F() => 5 
}
}