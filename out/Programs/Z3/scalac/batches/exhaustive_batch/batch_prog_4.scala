package Program_4 

 object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[C, T_B], b: T_B) extends T_A[C, D]
case class CC_B[F, E](a: T_A[E, E], b: (T_B,T_B)) extends T_A[E, F]
case class CC_C(a: (T_B,T_B), b: CC_A[T_B, T_B]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_D(a: CC_B[CC_C, CC_C]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(CC_B(CC_B(_, _), (CC_D(_),CC_D(_)))) => 1 
  case CC_D(CC_B(CC_B(_, _), (CC_E(),CC_D(_)))) => 2 
  case CC_D(CC_B(_, _)) => 3 
  case CC_D(CC_B(CC_A(_, _), (CC_E(),CC_E()))) => 4 
  case CC_D(CC_B(CC_A(_, _), (CC_D(_),CC_D(_)))) => 5 
  case CC_D(CC_B(_, (CC_E(),CC_E()))) => 6 
}
}