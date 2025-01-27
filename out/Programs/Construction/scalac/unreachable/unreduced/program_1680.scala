package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[(T_A[Byte],Boolean)]
case class CC_B(a: T_A[(CC_A,CC_A)], b: Boolean, c: T_A[Int]) extends T_A[(T_A[Byte],Boolean)]

val v_a: T_A[(T_A[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}