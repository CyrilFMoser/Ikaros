package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: (T_A[Boolean],Byte)) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B((_,_))) => 1 
  case CC_A(_, CC_B((_,_)), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B((_,_)), CC_B((_,_))) => 3 
  case CC_B((CC_A(_, _, _),_)) => 4 
  case CC_B((CC_B(_),_)) => 5 
}
}