package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Boolean, c: Boolean) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}