package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[E, Char]
case class CC_B[F]() extends T_B[T_B[T_B[(Byte,Byte), Boolean], T_B[Boolean, Boolean]], F]
case class CC_C[G, H](a: T_A[H, G], b: CC_B[G]) extends T_B[H, G]
case class CC_D(a: T_A[CC_C[Int, Int], Char], b: Byte, c: Byte) extends T_B[T_B[T_B[(Byte,Byte), Boolean], T_B[Boolean, Boolean]], T_A[(Byte,Int), T_B[Char, Boolean]]]

val v_a: T_B[T_B[T_B[(Byte,Byte), Boolean], T_B[Boolean, Boolean]], CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
}
}