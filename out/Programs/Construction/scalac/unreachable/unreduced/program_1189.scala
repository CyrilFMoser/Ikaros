package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[Char, Int], Char]]
case class CC_B[D](a: ((Int,(Int,Byte)),(Boolean,Char)), b: D) extends T_A[D, T_A[T_A[Char, Int], Char]]

val v_a: T_A[Int, T_A[T_A[Char, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), _) => 1 
}
}