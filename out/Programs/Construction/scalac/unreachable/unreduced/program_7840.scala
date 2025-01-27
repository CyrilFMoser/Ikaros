package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Char, Char],(Int,Boolean)), c: T_A[C, C]) extends T_A[C, T_A[(Byte,(Int,Boolean)), T_A[Int, Int]]]
case class CC_B[D]() extends T_A[D, T_A[(Byte,(Int,Boolean)), T_A[Int, Int]]]

val v_a: T_A[Char, T_A[(Byte,(Int,Boolean)), T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A('x', (_,(_,_)), _) => 0 
  case CC_A(_, (_,(_,_)), _) => 1 
  case CC_B() => 2 
}
}