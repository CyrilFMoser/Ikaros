package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[Byte, C]
case class CC_B() extends T_A[Byte, Byte]
case class CC_C(a: CC_A[CC_B]) extends T_B
case class CC_D(a: CC_B, b: ((CC_C,(Int,Byte)),Char), c: T_A[CC_B, CC_C]) extends T_B

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_))) => 0 
  case CC_A(CC_D(_, _, _)) => 1 
  case CC_B() => 2 
}
}