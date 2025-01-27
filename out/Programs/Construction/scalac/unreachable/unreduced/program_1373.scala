package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int]) extends T_A[T_A[(T_B,T_B)]]
case class CC_B(a: Char, b: Char) extends T_A[T_A[(T_B,T_B)]]
case class CC_C(a: (Int,T_B)) extends T_A[T_A[(T_B,T_B)]]

val v_a: T_A[T_A[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_)) => 2 
}
}