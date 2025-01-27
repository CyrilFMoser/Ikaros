package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: (Int,T_A[(Boolean,Int)])) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_C(CC_C(_)) => 2 
  case CC_C(CC_D(_)) => 3 
  case CC_D(CC_B(_)) => 4 
  case CC_D(CC_C(_)) => 5 
  case CC_D(CC_D(_)) => 6 
}
}