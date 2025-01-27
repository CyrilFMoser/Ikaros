package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]

val v_a: T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}