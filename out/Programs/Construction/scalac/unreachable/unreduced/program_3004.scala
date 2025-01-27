package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_B]
case class CC_B(a: T_A[Byte], b: T_B) extends T_A[T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
}
}