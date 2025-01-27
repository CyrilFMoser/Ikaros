package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C], c: (T_A[Byte, Boolean],Byte)) extends T_A[Byte, C]
case class CC_B() extends T_A[Byte, CC_A[CC_A[Byte]]]

val v_a: T_A[Byte, CC_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (CC_A(_, _, _),_)) => 0 
  case CC_A(CC_B(), _, (CC_A(_, _, _),_)) => 1 
  case CC_B() => 2 
}
}