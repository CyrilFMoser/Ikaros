package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (Byte,Byte)) extends T_A[(Int,Byte)]

val v_a: T_A[(Int,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A T_B))