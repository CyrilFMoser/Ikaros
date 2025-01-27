package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Boolean]
case class CC_B(a: T_A[CC_A], b: (Int,CC_A)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
}
}