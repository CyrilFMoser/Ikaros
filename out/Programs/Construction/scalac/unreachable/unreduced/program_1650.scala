package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Char) extends T_A[Byte]
case class CC_B(a: CC_A, b: (CC_A,T_A[Int]), c: T_A[T_A[Char]]) extends T_A[Byte]
case class CC_C(a: CC_A, b: Int) extends T_A[Byte]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
}
}