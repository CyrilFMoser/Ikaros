package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_A[T_B, T_B], (T_B,T_A[(Char,Char), T_B])]
case class CC_B(a: CC_A) extends T_A[T_A[T_B, T_B], (T_B,T_A[(Char,Char), T_B])]
case class CC_C(a: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_D, b: T_A[CC_A, T_B]) extends T_B

val v_a: T_A[T_A[T_B, T_B], (T_B,T_A[(Char,Char), T_B])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _) => 0 
  case CC_A(CC_D(), _) => 1 
  case CC_A(CC_E(_, _), _) => 2 
  case CC_B(_) => 3 
}
}