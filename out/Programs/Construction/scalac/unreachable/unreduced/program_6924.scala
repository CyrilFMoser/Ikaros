package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[T_A, C]
case class CC_C[D](a: CC_B[D], b: T_B[T_A, D]) extends T_B[T_A, D]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}