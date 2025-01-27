package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A) extends T_B[Char]
case class CC_C() extends T_B[Char]
case class CC_D() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}