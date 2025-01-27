package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]], b: Int, c: T_B[T_B[Int]]) extends T_A[T_B[(Byte,Boolean)]]
case class CC_B(a: T_A[T_B[CC_A]]) extends T_A[T_B[(Byte,Boolean)]]
case class CC_C(a: Int) extends T_A[T_B[(Byte,Boolean)]]
case class CC_D[C](a: C, b: T_A[C], c: CC_C) extends T_B[C]
case class CC_E[D](a: Int) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_) => 1 
}
}