package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: CC_A[T_A[T_B, (Byte,Int)]], b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, Int], Int], Int]
case class CC_C(a: CC_A[T_B], b: T_A[CC_B, Int], c: CC_A[Byte]) extends T_A[T_A[T_A[T_B, Int], Int], Int]

val v_a: T_A[T_A[T_A[T_B, Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_), _, _) => 2 
}
}