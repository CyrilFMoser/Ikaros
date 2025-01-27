package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: Int) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B(_)) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B(_) => 5 
  case CC_C() => 6 
}
}