package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_A, c: CC_A) extends T_A
case class CC_C[C](a: T_B[CC_A, C]) extends T_B[CC_A, C]
case class CC_D[D](a: CC_B) extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}