package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Char, c: Char) extends T_B[E, T_B[T_B[Char, Boolean], Char]]
case class CC_C(a: Int) extends T_B[T_A[CC_A[Byte]], T_B[T_B[Char, Boolean], Char]]

val v_a: T_B[T_A[CC_A[Byte]], T_B[T_B[Char, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}