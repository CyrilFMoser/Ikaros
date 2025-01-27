package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Byte,Int)) extends T_A[(Byte,Int)]

val v_a: T_A[(Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Char Char Wildcard Wildcard (T_A Char Char))