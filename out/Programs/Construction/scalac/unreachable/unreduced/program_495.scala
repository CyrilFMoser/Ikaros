package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)]) extends T_A[T_B]
case class CC_B(a: Boolean, b: (T_A[Boolean],T_A[T_B]), c: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: ((CC_A,CC_B),Char)) extends T_B
case class CC_E(a: CC_D, b: CC_A, c: T_A[T_B]) extends T_B
case class CC_F(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(_, _, CC_A(_)) => 1 
  case CC_E(_, _, CC_B(_, _, _)) => 2 
  case CC_E(_, _, CC_C()) => 3 
  case CC_F(CC_A(_)) => 4 
}
}