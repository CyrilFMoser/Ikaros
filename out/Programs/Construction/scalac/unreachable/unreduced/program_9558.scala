package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int, b: T_B[Boolean, Int]) extends T_A
case class CC_C[C]() extends T_B[T_B[C, C], C]
case class CC_D[D](a: Boolean) extends T_B[T_B[D, D], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}