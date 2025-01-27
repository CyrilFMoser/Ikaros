package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[Byte, Char], b: T_B[CC_A[Int], T_A[Byte]]) extends T_B[T_A[T_A[Char]], Byte]
case class CC_C(a: CC_A[Int]) extends T_B[T_A[T_A[Char]], Byte]

val v_a: T_B[T_A[T_A[Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}