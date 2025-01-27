package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,T_B), b: B, c: T_B) extends T_A[T_A[(Byte,T_B)]]
case class CC_B(a: (CC_A[Int],T_B), b: T_A[T_B]) extends T_A[T_A[(Byte,T_B)]]

val v_a: T_A[T_A[(Byte,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),_), _) => 1 
}
}