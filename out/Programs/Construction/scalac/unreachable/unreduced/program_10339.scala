package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[Char]) extends T_A[Char]
case class CC_B(a: CC_A[Byte], b: CC_A[T_A[Boolean]], c: T_A[CC_A[Byte]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(CC_A(_, _), CC_A(_, _), _)) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 2 
}
}