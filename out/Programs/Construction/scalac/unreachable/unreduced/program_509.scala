package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: D, b: T_B[T_A[D]], c: D) extends T_A[D]
case class CC_C[E](a: T_A[E], b: E) extends T_A[E]
case class CC_D(a: CC_A[T_B[(Boolean,Boolean)]], b: T_A[CC_A[Char]]) extends T_B[T_A[T_A[Byte]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _) => 2 
  case CC_C(CC_B(_, _, _), _) => 3 
  case CC_C(CC_C(_, _), _) => 4 
}
}