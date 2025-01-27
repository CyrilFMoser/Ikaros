package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_B, Int], b: T_A[T_B, T_B]) extends T_A[T_A[Char, Char], Char]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}