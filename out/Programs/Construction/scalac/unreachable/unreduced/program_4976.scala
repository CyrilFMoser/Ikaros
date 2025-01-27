package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C) extends T_A[(Int,T_A[(Byte,Int), (Byte,Boolean)]), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[(Int,T_A[(Byte,Int), (Byte,Boolean)]), D]

val v_a: T_A[(Int,T_A[(Byte,Int), (Byte,Boolean)]), Int] = null
val v_b: Int = v_a match{
  case CC_A(true, 12) => 0 
  case CC_A(true, _) => 1 
  case CC_A(false, 12) => 2 
  case CC_A(false, _) => 3 
  case CC_B(_) => 4 
}
}