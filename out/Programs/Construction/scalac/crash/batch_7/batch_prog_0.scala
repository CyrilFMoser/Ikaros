package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_B[Boolean],T_B[Int]), b: Int) extends T_A[C]
case class CC_B[D](a: T_B[D], b: D) extends T_B[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}