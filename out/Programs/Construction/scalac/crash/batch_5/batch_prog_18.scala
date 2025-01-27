package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[Char], c: T_A[T_B[Char]]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C[C, D](a: Char) extends T_B[C]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}