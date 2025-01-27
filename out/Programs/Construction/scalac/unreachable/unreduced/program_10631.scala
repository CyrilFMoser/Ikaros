package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_C(a: CC_A, b: Char) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_C(CC_A(), 'x') => 4 
  case CC_C(CC_A(), _) => 5 
}
}