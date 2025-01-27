package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,(Int,Byte)), b: C, c: T_A[C, C]) extends T_A[C, T_A[Char, T_A[C, Char]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[D, Char]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _, _) => 0 
  case CC_B() => 1 
}
}