package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B(a: T_A[CC_A[Boolean, Byte]], b: T_B[T_A[Boolean]]) extends T_B[Byte]
case class CC_C() extends T_B[Byte]
case class CC_D(a: CC_A[Char, T_A[Char]]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}