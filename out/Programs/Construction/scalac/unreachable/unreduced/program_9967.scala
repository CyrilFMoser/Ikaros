package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (((Int,Char),Boolean),T_A[Byte, Int]), b: T_A[(Byte,Boolean), T_A[Char, Int]]) extends T_A[T_A[T_A[Int, Char], (Byte,Char)], T_A[T_A[Char, Char], T_A[Char, Int]]]
case class CC_B[C]() extends T_A[T_A[T_A[Int, Char], (Byte,Char)], T_A[T_A[Char, Char], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Int, Char], (Byte,Char)], T_A[T_A[Char, Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
  case CC_B() => 1 
}
}