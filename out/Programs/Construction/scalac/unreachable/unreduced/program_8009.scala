package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: ((T_B,(Int,Boolean)),T_B)) extends T_A[(Char,T_A[T_B])]
case class CC_B(a: T_A[Boolean]) extends T_A[(Char,T_A[T_B])]
case class CC_C(a: Int) extends T_A[(Char,T_A[T_B])]

val v_a: T_A[(Char,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_)) => 0 
  case CC_B(_) => 1 
  case CC_C(12) => 2 
  case CC_C(_) => 3 
}
}