package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: CC_A, b: T_B[T_A], c: T_B[Byte]) extends T_B[T_A]
case class CC_D(a: CC_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A()) => 1 
}
}