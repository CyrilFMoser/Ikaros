package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[T_A[T_B[Int, Int]]]
case class CC_C(a: CC_A[Int]) extends T_B[CC_B[T_A[Byte]], T_B[(Boolean,Byte), Char]]
case class CC_D(a: T_A[Char]) extends T_B[CC_C, CC_A[((Char,Char),Boolean)]]
case class CC_E[F]() extends T_B[CC_C, CC_A[((Char,Char),Boolean)]]

val v_a: T_B[CC_C, CC_A[((Char,Char),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_E() => 1 
}
}