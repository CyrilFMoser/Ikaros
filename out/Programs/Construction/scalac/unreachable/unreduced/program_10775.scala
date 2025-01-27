package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Int,Int), Char],((Byte,Int),(Char,Byte))), b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]
case class CC_B[D](a: CC_A[T_A[D, D]]) extends T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _, _) => 0 
  case CC_B(_) => 1 
}
}