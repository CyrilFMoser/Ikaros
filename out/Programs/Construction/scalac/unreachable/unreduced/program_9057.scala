package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[Byte]) extends T_A[T_A[(Int,Boolean)]]
case class CC_B() extends T_A[T_A[(Int,Boolean)]]
case class CC_C(a: CC_A) extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}