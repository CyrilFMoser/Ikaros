package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[Char], b: CC_B, c: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(CC_A(_)), CC_B(CC_A(_))) => 2 
}
}