package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[Byte]) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}