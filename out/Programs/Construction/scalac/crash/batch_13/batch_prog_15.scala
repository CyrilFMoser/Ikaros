package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E, F](a: T_A[E]) extends T_B[E, Byte]
case class CC_C() extends T_B[CC_B[T_A[Boolean], T_B[Int, Char]], T_B[T_B[Char, Char], Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}