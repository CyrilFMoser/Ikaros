package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: (CC_A[T_B],(T_B,T_B)), b: D, c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C(a: T_A[Char, T_A[T_B, T_B]], b: T_A[Int, T_B]) extends T_A[CC_B[CC_A[T_B]], T_B]
case class CC_D(a: Boolean, b: CC_B[T_A[(Char,Int), T_B]], c: T_B) extends T_B

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),(_,_)), _, CC_A()) => 0 
  case CC_B((CC_A(),(_,_)), _, CC_B(_, _, _)) => 1 
}
}