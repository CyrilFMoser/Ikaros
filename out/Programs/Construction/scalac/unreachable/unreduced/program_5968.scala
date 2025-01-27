package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[Char]
case class CC_C(a: CC_B, b: T_B[CC_B], c: T_A[T_A[(Byte,Boolean)]]) extends T_A[Char]
case class CC_D(a: Byte, b: T_A[Char]) extends T_B[T_A[Char]]
case class CC_E() extends T_B[T_A[Char]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
}
}
// This is not matched: CC_A(_)