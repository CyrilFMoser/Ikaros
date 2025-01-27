package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: T_A, c: Int) extends T_A
case class CC_C(a: T_A, b: T_B[Byte], c: T_A) extends T_B[Byte]
case class CC_D(a: Byte, b: CC_C) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}