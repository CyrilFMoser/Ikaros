package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_B[T_B[T_A, T_A], Int]) extends T_A
case class CC_C[C](a: Boolean, b: T_A, c: CC_B) extends T_B[(CC_A,T_A), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}