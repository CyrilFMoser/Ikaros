package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[(Int,(Boolean,Byte)), T_A[(Int,Boolean), Byte]]]
case class CC_B[D]() extends T_A[D, T_A[(Int,(Boolean,Byte)), T_A[(Int,Boolean), Byte]]]

val v_a: T_A[Char, T_A[(Int,(Boolean,Byte)), T_A[(Int,Boolean), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}