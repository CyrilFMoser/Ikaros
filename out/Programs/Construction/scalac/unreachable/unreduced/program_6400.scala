package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Boolean) extends T_A[Char]
case class CC_B(a: T_A[((Byte,Byte),CC_A)]) extends T_A[Char]
case class CC_C(a: T_A[Char]) extends T_A[Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_C(CC_C(CC_A(_, _))) => 2 
  case CC_C(CC_C(CC_B(_))) => 3 
  case CC_C(CC_C(CC_C(_))) => 4 
}
}