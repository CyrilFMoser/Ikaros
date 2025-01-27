package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_A[Boolean],(Int,Boolean))]
case class CC_B() extends T_A[(T_A[Boolean],(Int,Boolean))]

val v_a: T_A[(T_A[Boolean],(Int,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}