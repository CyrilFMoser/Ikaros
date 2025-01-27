package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(((Char,Char),Char),T_A[Boolean, Boolean]), C]
case class CC_B[D](a: Int, b: T_A[D, D], c: T_A[D, D]) extends T_A[(((Char,Char),Char),T_A[Boolean, Boolean]), D]

val v_a: T_A[(((Char,Char),Char),T_A[Boolean, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}