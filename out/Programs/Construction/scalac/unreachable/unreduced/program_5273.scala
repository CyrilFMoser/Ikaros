package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Boolean]], c: T_B[(Boolean,Int)]) extends T_A[((Char,Char),T_A[Int])]
case class CC_B() extends T_A[((Char,Char),T_A[Int])]

val v_a: T_A[((Char,Char),T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}