package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Boolean,Int),T_A[Int, Boolean]), b: C) extends T_A[C, T_A[T_A[Int, Boolean], T_A[Boolean, Int]]]
case class CC_B[D](a: D, b: CC_A[Boolean], c: D) extends T_A[D, T_A[T_A[Int, Boolean], T_A[Boolean, Int]]]

val v_a: T_A[Byte, T_A[T_A[Int, Boolean], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}