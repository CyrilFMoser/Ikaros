package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Boolean]
case class CC_B[E, F](a: CC_A[E], b: T_B[Int], c: Int) extends T_A[E, F]
case class CC_C(a: CC_A[T_A[Char, Byte]]) extends T_B[Char]
case class CC_D() extends T_B[Char]
case class CC_E(a: Byte, b: T_B[CC_D]) extends T_B[Char]

val v_a: T_A[T_B[Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}