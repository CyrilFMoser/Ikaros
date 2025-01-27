package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: (Char,T_B)) extends T_A[Boolean, C]
case class CC_B[D](a: (Char,T_A[T_B, T_B])) extends T_A[Boolean, D]
case class CC_C(a: T_A[Boolean, Boolean]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C(_))) => 0 
  case CC_A(_, (_,CC_D())) => 1 
  case CC_B(('x',_)) => 2 
  case CC_B((_,_)) => 3 
}
}