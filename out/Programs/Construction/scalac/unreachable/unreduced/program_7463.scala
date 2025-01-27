package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[CC_A], b: Boolean, c: CC_A) extends T_A[T_A[T_B]]
case class CC_C(a: Byte) extends T_B
case class CC_D(a: T_A[(CC_A,CC_C)], b: T_A[T_A[T_B]], c: Boolean) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_A(CC_D(_, CC_A(_), _)) => 1 
  case CC_A(CC_D(_, CC_B(_, _, _), _)) => 2 
  case CC_B(_, _, CC_A(CC_C(_))) => 3 
  case CC_B(_, _, CC_A(CC_D(_, _, _))) => 4 
}
}