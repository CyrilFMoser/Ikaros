package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[Int, Int],(Byte,Byte)), C]
case class CC_B[D](a: D) extends T_A[(T_A[Int, Int],(Byte,Byte)), D]
case class CC_C(a: CC_A[Byte]) extends T_A[(T_A[Int, Int],(Byte,Byte)), T_A[Byte, (Byte,Boolean)]]

val v_a: T_A[(T_A[Int, Int],(Byte,Byte)), T_A[Byte, (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}