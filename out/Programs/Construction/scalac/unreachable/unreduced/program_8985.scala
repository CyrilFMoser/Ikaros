package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], (Int,Byte)]) extends T_A[Int, T_A[T_A[Byte, Boolean], T_A[Char, Byte]]]
case class CC_B[C](a: CC_A) extends T_A[C, Int]
case class CC_C[D](a: CC_A, b: D) extends T_A[D, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_, _) => 1 
}
}