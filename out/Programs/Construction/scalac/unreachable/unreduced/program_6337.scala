package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A, b: (CC_A,T_A[CC_A]), c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: (CC_A,Char), b: T_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C((CC_A(),_), CC_B(_, (_,_), _)) => 1 
}
}
// This is not matched: CC_C((CC_A(),_), CC_C((_,_), _))