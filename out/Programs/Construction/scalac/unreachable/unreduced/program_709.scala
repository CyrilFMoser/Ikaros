package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Boolean, c: T_A[C, C]) extends T_A[C, T_A[(Byte,(Char,Byte)), T_A[C, C]]]
case class CC_B[D](a: T_A[((Int,Byte),Int), T_A[D, D]]) extends T_A[D, T_A[(Byte,(Char,Byte)), T_A[D, D]]]
case class CC_C[E](a: (T_A[Int, Int],(Byte,Byte))) extends T_A[E, T_A[(Byte,(Char,Byte)), T_A[E, E]]]

val v_a: T_A[Int, T_A[(Byte,(Char,Byte)), T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}