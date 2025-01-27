package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[T_B, T_B], T_B], b: CC_A[CC_A[T_B]], c: ((Byte,T_B),T_B)) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C(a: (T_A[CC_B, CC_B],T_B), b: T_B, c: T_B) extends T_B
case class CC_D(a: (Char,CC_B), b: Boolean) extends T_B
case class CC_E(a: T_A[T_A[T_B, T_B], T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((_,CC_C(_, _, _)), _, _) => 0 
  case CC_C((_,CC_D(_, _)), _, _) => 1 
  case CC_C((_,CC_E(_)), _, _) => 2 
  case CC_D((_,CC_B(_, _, _)), _) => 3 
  case CC_E(CC_A()) => 4 
}
}
// This is not matched: CC_E(CC_B(_, _, _))