package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: Boolean, b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[CC_A]], b: CC_A) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _)) => 3 
  case CC_C(_, _) => 4 
}
}