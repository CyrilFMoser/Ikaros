package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Byte,Char)) extends T_A[T_A[Int, Boolean], C]

val v_a: T_A[T_A[Int, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))