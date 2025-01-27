package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: D, b: Int) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_B[T_A[Byte]], b: Char, c: CC_C[CC_B[Int]]) extends T_B[CC_C[Byte]]
case class CC_E(a: T_A[T_A[CC_D]], b: T_A[T_A[CC_D]]) extends T_B[CC_C[Byte]]

val v_a: T_B[CC_C[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, 'x', CC_C()) => 0 
  case CC_D(_, _, CC_C()) => 1 
  case CC_E(CC_A(), _) => 2 
  case CC_E(CC_B(CC_A(), _), _) => 3 
  case CC_E(CC_B(CC_B(_, _), _), _) => 4 
  case CC_E(CC_B(CC_C(), _), _) => 5 
  case CC_E(CC_C(), _) => 6 
}
}