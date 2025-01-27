package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Int]], b: (Byte,T_A[CC_A])) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(true, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(true, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(false, CC_A(_, _))) => 2 
  case CC_A(_, CC_A(false, CC_B(_, _))) => 3 
  case CC_A(_, CC_B(_, _)) => 4 
  case CC_B(_, _) => 5 
}
}