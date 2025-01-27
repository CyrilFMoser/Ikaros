package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, Byte]) extends T_A[D, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_B(_))) => 2 
  case CC_B(CC_B(_)) => 3 
}
}