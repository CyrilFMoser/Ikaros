package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Int], C], b: Byte, c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: ((Byte,Byte),Boolean), c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _), _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}