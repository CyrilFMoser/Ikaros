package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C() extends T_B[T_A[(Boolean,Byte)], Boolean]
case class CC_D(a: CC_A[T_A[CC_C]], b: CC_C) extends T_B[T_A[(Boolean,Byte)], Boolean]
case class CC_E(a: T_B[CC_D, T_A[Char]], b: T_B[T_A[CC_D], T_A[CC_C]], c: T_A[CC_B[Char]]) extends T_B[T_A[(Boolean,Byte)], Boolean]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_E(_, _, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_B(CC_E(_, _, _), CC_B(_, _)), _) => 2 
  case CC_B(_, _) => 3 
}
}