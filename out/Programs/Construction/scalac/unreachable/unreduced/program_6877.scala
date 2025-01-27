package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[Char], b: CC_A, c: Boolean) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), true) => 1 
  case CC_B(_, CC_A(), false) => 2 
}
}