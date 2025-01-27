package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Byte,Byte), Char],T_A[Boolean, Boolean]), b: T_A[C, C]) extends T_A[C, T_A[Int, T_A[Int, Int]]]
case class CC_B[D, E]() extends T_A[D, T_A[Int, T_A[Int, Int]]]
case class CC_C[F]() extends T_A[F, T_A[Int, T_A[Int, Int]]]

val v_a: T_A[Int, T_A[Int, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}