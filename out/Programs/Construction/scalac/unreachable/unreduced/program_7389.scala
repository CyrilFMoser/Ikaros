package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Char, b: Char) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[CC_A], b: CC_A, c: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(12), _) => 2 
}
}
// This is not matched: CC_C(_, CC_A(_), _)