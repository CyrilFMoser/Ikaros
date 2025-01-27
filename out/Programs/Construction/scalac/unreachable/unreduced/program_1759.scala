package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: Boolean) extends T_A[T_B, D]
case class CC_C() extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), true) => 1 
  case CC_B((_,_), false) => 2 
}
}