package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,T_B)]]
case class CC_B(a: T_A[T_B], b: (Byte,T_B), c: T_A[Int]) extends T_A[T_A[(T_B,T_B)]]

val v_a: T_A[T_A[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (0,_), _) => 1 
  case CC_B(_, (_,_), _) => 2 
}
}