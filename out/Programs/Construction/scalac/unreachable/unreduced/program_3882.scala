package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Byte,(Char,Boolean)), T_A[Int, Byte]]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, T_A[(Byte,(Char,Boolean)), T_A[Int, Byte]]]

val v_a: T_A[Char, T_A[(Byte,(Char,Boolean)), T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}