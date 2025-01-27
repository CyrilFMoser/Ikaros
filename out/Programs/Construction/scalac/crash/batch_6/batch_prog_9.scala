package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D) extends T_A[E, D]
case class CC_B(a: T_A[CC_A[Char, (Int,Int)], T_A[Char, Boolean]]) extends T_B[T_A[CC_A[Boolean, Boolean], T_A[Int, Char]]]
case class CC_C() extends T_B[T_A[CC_A[Boolean, Boolean], T_A[Int, Char]]]

val v_a: T_B[T_A[CC_A[Boolean, Boolean], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_))) => 0 
  case CC_C() => 1 
}
}