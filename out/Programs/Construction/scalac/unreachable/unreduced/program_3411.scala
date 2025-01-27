package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_A[CC_C], Boolean], b: T_A[T_B, T_B], c: (Char,Int)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, ('x',_)) => 1 
}
}
// This is not matched: CC_D(_, _, (_,_))