package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Int], T_A[Int, Boolean]]]
case class CC_B[D](a: T_A[D, CC_A[D]], b: D, c: D) extends T_A[D, T_A[T_A[Int, Int], T_A[Int, Boolean]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}