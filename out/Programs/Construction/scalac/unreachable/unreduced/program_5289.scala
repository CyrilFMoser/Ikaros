package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[CC_A]], b: Byte) extends T_A[Boolean]
case class CC_C(a: T_A[CC_A], b: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}