package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: ((T_B,T_B),Int)) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: T_A[T_A[Byte]], c: Char) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _, _) => 1 
  case CC_C(CC_B(), _, _) => 2 
  case CC_C(CC_C(CC_A(_, _), _, _), _, _) => 3 
  case CC_C(CC_C(CC_B(), _, _), _, _) => 4 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 5 
}
}
// This is not matched: CC_A(_, ((_,_),_))