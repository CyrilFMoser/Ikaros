package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: Int, c: T_A[Int]) extends T_A[(Byte,T_B[Byte, Boolean])]
case class CC_B[D](a: T_B[Boolean, D], b: D) extends T_B[Boolean, D]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}