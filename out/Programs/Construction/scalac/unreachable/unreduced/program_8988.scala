package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Byte], b: T_A, c: T_B[T_A, Int]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: ((T_A,(Byte,Boolean)),Byte)) extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[CC_A, C]
case class CC_E[D]() extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(CC_B(), (_,_)), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_B(), ((_,_),_)) => 4 
}
}