package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, Char]) extends T_A[D, Char]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, Char]
case class CC_C(a: Int) extends T_A[T_A[CC_A[Int], Char], Char]
case class CC_D(a: CC_A[Boolean]) extends T_B[T_A[(CC_C,CC_C), Char]]
case class CC_E(a: (T_B[CC_C],CC_A[CC_D]), b: Int, c: CC_D) extends T_B[T_A[T_A[Char, Boolean], Char]]
case class CC_F(a: Boolean) extends T_B[T_A[T_A[Char, Boolean], Char]]

val v_a: T_B[T_A[T_A[Char, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_E((_,_), _, CC_D(_)) => 0 
  case CC_F(_) => 1 
}
}