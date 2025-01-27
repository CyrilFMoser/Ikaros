package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_A[E, E], E], b: Int, c: Byte) extends T_A[E, F]
case class CC_B(a: CC_A[CC_A[Int, Char], CC_A[Char, Byte]]) extends T_B[T_A[T_A[Char, Int], (Char,Byte)], Boolean]
case class CC_C() extends T_B[T_A[T_A[Char, Int], (Char,Byte)], Boolean]
case class CC_D(a: CC_B) extends T_B[T_A[T_A[Char, Int], (Char,Byte)], Boolean]

val v_a: T_B[T_A[T_A[Char, Int], (Char,Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_B(CC_A(_, _, _))) => 1 
}
}
// This is not matched: CC_C()