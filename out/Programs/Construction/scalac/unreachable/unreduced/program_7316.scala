package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Int, Boolean],T_A[(Byte,Byte), Byte]), C]
case class CC_B() extends T_A[(T_A[Int, Boolean],T_A[(Byte,Byte), Byte]), Int]

val v_a: T_A[(T_A[Int, Boolean],T_A[(Byte,Byte), Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}