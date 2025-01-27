package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_B[T_B[Boolean, Char], CC_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[E](a: T_A[E]) extends T_A[E]
case class CC_D(a: CC_A[Int], b: CC_B) extends T_B[CC_B, (T_B[CC_B, CC_B],Char)]
case class CC_E(a: T_B[CC_B, T_A[Char]], b: T_A[T_A[CC_D]]) extends T_B[CC_B, (T_B[CC_B, CC_B],Char)]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_C(_)) => 2 
  case CC_C(_) => 3 
}
}