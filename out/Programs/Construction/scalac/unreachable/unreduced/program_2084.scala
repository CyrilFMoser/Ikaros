package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[D](a: Char, b: Boolean) extends T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}