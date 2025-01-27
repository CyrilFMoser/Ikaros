package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Boolean,Boolean),T_A[Int])) extends T_A[T_A[T_A[Int]]]
case class CC_B[B](a: CC_A, b: B) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B(_, _) => 1 
}
}