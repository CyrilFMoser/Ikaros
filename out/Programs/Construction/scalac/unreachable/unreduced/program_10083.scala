package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[T_B, C]
case class CC_B[D](a: T_A[CC_A[D], D], b: (T_B,T_A[T_B, T_B])) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_B]) extends T_B
case class CC_D(a: CC_A[T_B], b: CC_B[CC_A[T_B]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_), _)) => 0 
  case CC_C(CC_A(CC_D(_, _), _)) => 1 
  case CC_C(CC_A(CC_E(), _)) => 2 
  case CC_C(CC_B(_, _)) => 3 
  case CC_D(CC_A(CC_C(_), (_,_)), CC_B(_, _)) => 4 
  case CC_D(CC_A(CC_D(_, _), (_,_)), CC_B(_, _)) => 5 
  case CC_D(CC_A(CC_E(), (_,_)), CC_B(_, _)) => 6 
  case CC_E() => 7 
}
}