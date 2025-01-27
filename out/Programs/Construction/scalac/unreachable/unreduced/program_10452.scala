package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (Boolean,(Boolean,Int))) extends T_A[Boolean, C]
case class CC_B() extends T_A[Boolean, CC_A[T_A[Boolean, Byte]]]

val v_a: T_A[Boolean, CC_A[T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (true,(_,_))) => 0 
  case CC_A(_, _, (false,(_,_))) => 1 
  case CC_B() => 2 
}
}