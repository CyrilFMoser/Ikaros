package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C(a: (T_A[T_B, T_B],T_A[T_B, Boolean])) extends T_A[T_A[T_A[T_B, T_B], T_B], T_B]
case class CC_D(a: T_A[(Boolean,T_B), T_B], b: CC_B[CC_A[(Char,Char)]]) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((_,_)) => 2 
}
}