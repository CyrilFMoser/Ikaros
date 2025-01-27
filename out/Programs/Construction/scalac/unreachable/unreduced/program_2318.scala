package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_A[T_A[Char]], b: Char) extends T_A[Byte]
case class CC_D(a: CC_B, b: CC_C, c: T_A[CC_C]) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _) => 6 
}
}