package Program_63 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int, b: T_A[T_A[(Int,Int)]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: CC_D(_, _, _)