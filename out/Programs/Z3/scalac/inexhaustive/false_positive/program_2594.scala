package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,Byte)) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)