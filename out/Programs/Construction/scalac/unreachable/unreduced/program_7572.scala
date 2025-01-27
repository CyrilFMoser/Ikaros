package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_B, T_A[T_B, T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_B, T_A[T_B, T_B]]]
case class CC_C(a: (Int,T_B)) extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_B, T_A[T_B, T_B]]]
case class CC_D(a: CC_C, b: T_B) extends T_B
case class CC_E(a: (T_B,T_A[CC_C, CC_B]), b: CC_D, c: Int) extends T_B
case class CC_F(a: T_A[(Boolean,CC_D), CC_E]) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_C(_), CC_D(_, _))) => 0 
  case CC_A(CC_D(CC_C(_), CC_E(_, _, _))) => 1 
  case CC_A(CC_D(CC_C(_), CC_F(_))) => 2 
  case CC_A(CC_E(_, _, _)) => 3 
  case CC_A(CC_F(_)) => 4 
  case CC_B() => 5 
  case CC_C((_,CC_D(_, _))) => 6 
  case CC_C((_,CC_E(_, _, _))) => 7 
  case CC_C((_,CC_F(_))) => 8 
}
}