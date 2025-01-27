package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, T_B], Boolean], T_A[(T_B,T_B), T_B]]
case class CC_B() extends T_A[T_A[T_A[T_B, T_B], Boolean], T_A[(T_B,T_B), T_B]]
case class CC_C(a: CC_A, b: (T_A[CC_A, CC_A],Int)) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], Boolean], T_A[(T_B,T_B), T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), CC_C(CC_A(_, _, _), _), CC_C(_, (_,_))) => 0 
  case CC_B() => 1 
}
}