package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[(Int,Byte)],T_A[T_B]), b: T_A[T_A[(Byte,Byte)]], c: Boolean) extends T_A[T_A[(T_B,T_B)]]
case class CC_B() extends T_A[T_A[(T_B,T_B)]]
case class CC_C(a: CC_B) extends T_B

val v_a: T_A[T_A[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}