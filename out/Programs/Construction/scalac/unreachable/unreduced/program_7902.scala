package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: Byte) extends T_A[Byte]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: CC_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_))) => 4 
  case CC_B(CC_C(CC_B(_))) => 5 
  case CC_C(CC_B(_)) => 6 
}
}