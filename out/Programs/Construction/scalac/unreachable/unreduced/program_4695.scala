package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[T_B, C]]) extends T_A[T_A[T_A[T_B, T_B], T_B], C]
case class CC_B(a: CC_A[Int]) extends T_A[(T_B,T_A[(Int,Int), (Boolean,Char)]), Byte]
case class CC_C(a: CC_A[Int]) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}