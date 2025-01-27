package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Byte, c: T_A[(Int,Char)]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: Byte, b: T_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
  case CC_C(_, CC_B()) => 3 
  case CC_C(_, CC_C(_, _)) => 4 
}
}