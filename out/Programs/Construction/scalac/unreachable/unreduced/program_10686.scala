package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[Byte], c: T_A[T_A[Char]]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_A(_), CC_A(_), _)) => 1 
  case CC_A(CC_B(CC_A(_), CC_B(_, _, _), _)) => 2 
  case CC_B(_, _, _) => 3 
}
}