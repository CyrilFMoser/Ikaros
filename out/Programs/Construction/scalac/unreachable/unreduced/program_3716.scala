package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[E, F]
case class CC_B(a: T_B[Boolean, T_B[Boolean, Byte]]) extends T_B[CC_A[T_B[Int, Char], Byte], T_B[T_A[Char, Boolean], T_B[Byte, Char]]]
case class CC_C() extends T_B[CC_A[T_B[Int, Char], Byte], T_B[T_A[Char, Boolean], T_B[Byte, Char]]]
case class CC_D() extends T_B[CC_A[T_B[Int, Char], Byte], T_B[T_A[Char, Boolean], T_B[Byte, Char]]]

val v_a: T_B[CC_A[T_B[Int, Char], Byte], T_B[T_A[Char, Boolean], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}