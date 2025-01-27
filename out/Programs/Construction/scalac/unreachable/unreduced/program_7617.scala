package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Int], T_B[Char, Byte]]) extends T_A[T_B[T_B[Char, Int], Char]]
case class CC_B[D](a: D, b: T_A[D], c: CC_A) extends T_A[D]
case class CC_C[E, F]() extends T_A[E]
case class CC_D[G](a: CC_C[G, G], b: T_A[G]) extends T_B[G, CC_C[CC_B[CC_A], CC_B[CC_A]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B('x', CC_B(_, _, _), CC_A(_)), CC_A(_)) => 0 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_)), CC_A(_)) => 1 
  case CC_B(_, CC_B('x', CC_C(), CC_A(_)), CC_A(_)) => 2 
  case CC_B(_, CC_B(_, CC_C(), CC_A(_)), CC_A(_)) => 3 
  case CC_B(_, CC_C(), CC_A(_)) => 4 
  case CC_C() => 5 
}
}