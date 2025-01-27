package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Byte, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[Byte], c: T_B[Byte]) extends T_B[Byte]
case class CC_D(a: T_B[Byte], b: T_B[T_B[CC_B]], c: CC_B) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}