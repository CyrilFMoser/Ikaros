package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],T_B), b: Int, c: Byte) extends T_A[T_A[T_A[T_B, T_B], Char], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[T_B, T_B], Char], D]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[T_A[Byte, (Char,Boolean)], (CC_C,Boolean)]) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_) => 1 
}
}