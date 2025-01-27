package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Byte, b: CC_A, c: T_A[Byte]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(CC_B(_, CC_A(), _), CC_A()) => 2 
}
}