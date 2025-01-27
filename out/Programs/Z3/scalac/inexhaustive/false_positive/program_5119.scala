package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Boolean)) extends T_A[T_A[(Int,Char), Boolean], C]

val v_a: T_A[T_A[(Int,Char), Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_A T_B (CC_B (CC_A Byte Wildcard (T_A Byte)) Wildcard T_B) (T_A T_B))