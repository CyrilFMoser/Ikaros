package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Char, b: C, c: T_B[C, C]) extends T_B[CC_C, C]
case class CC_E[D](a: (CC_C,CC_C), b: T_A, c: T_B[D, D]) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}