package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: T_A[T_B, T_A[T_B, Boolean]], b: T_A[T_A[(Int,Char), T_B], T_B]) extends T_B
case class CC_C(a: T_A[T_A[CC_B, Char], Byte], b: T_A[T_A[T_B, T_B], Boolean], c: CC_A[Int]) extends T_B
case class CC_D[D](a: D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, CC_A(_)) => 1 
  case CC_D(_) => 2 
}
}