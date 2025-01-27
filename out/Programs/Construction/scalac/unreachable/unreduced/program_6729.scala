package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(Char,T_A[Int, Byte]), C]
case class CC_B[D](a: T_A[Boolean, D]) extends T_A[(Char,T_A[Int, Byte]), D]

val v_a: T_A[(Char,T_A[Int, Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}