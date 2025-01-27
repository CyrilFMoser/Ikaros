package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_B[T_A, Int]
case class CC_C(a: T_B[Byte, Int], b: CC_B, c: CC_A) extends T_B[T_A, Int]
case class CC_D(a: Char) extends T_B[T_A, Int]

val v_a: T_B[T_A, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B(), CC_A()) => 1 
  case CC_D('x') => 2 
  case CC_D(_) => 3 
}
}