package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_B) extends T_A[C, (T_B,T_A[(Char,Int), T_B])]
case class CC_B(a: T_A[T_A[T_B, T_B], T_B], b: T_B) extends T_B
case class CC_C[D](a: D, b: D, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(true, _, CC_B(_, CC_B(_, _))) => 0 
  case CC_C(false, _, CC_B(_, CC_B(_, _))) => 1 
  case CC_C(true, _, CC_B(_, CC_C(_, _, _))) => 2 
  case CC_C(false, _, CC_B(_, CC_C(_, _, _))) => 3 
  case CC_C(true, _, CC_B(_, CC_D())) => 4 
  case CC_C(false, _, CC_B(_, CC_D())) => 5 
  case CC_C(true, _, CC_C(_, _, _)) => 6 
  case CC_C(false, _, CC_C(_, _, _)) => 7 
  case CC_C(true, _, CC_D()) => 8 
  case CC_C(false, _, CC_D()) => 9 
}
}