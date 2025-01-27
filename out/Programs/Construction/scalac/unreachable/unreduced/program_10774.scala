package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: (CC_A,T_A[T_B]), b: T_A[T_A[Boolean]], c: (CC_C,Byte)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_, _), _), _) => 0 
  case CC_B(CC_A(_, CC_C(), _), _) => 1 
  case CC_B(CC_A(_, CC_D(_, _, _), _), _) => 2 
  case CC_C() => 3 
  case CC_D(_, _, (CC_C(),_)) => 4 
}
}