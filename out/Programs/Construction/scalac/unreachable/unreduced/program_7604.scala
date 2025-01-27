package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}