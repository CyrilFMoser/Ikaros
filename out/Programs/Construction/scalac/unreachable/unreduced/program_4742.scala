package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte) extends T_A[Byte]
case class CC_B(a: Boolean) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}