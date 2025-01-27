package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Byte]
case class CC_B(a: Int, b: T_A[T_A[CC_A]], c: Char) extends T_A[T_B]
case class CC_C(a: T_A[Char], b: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}