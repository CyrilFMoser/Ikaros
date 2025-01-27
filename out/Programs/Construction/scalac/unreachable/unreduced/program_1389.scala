package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[(Char,CC_B)]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C(_)