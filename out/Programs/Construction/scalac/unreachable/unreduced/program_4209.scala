package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]], c: T_A[Byte]) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}