package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Byte]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: CC_A) extends T_A[Byte]
case class CC_C(a: T_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_C(_) => 2 
}
}